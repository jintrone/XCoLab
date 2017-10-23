package org.xcolab.client.proposals;

import org.xcolab.client.activities.ActivitiesClient;
import org.xcolab.client.activities.enums.ActivityProvidersType;
import org.xcolab.client.activities.helper.ActivityEntryHelper;
import org.xcolab.client.members.UsersGroupsClient;
import org.xcolab.client.proposals.exceptions.MembershipRequestNotFoundException;
import org.xcolab.client.proposals.exceptions.ProposalNotFoundException;
import org.xcolab.client.proposals.pojo.Proposal;
import org.xcolab.client.proposals.pojo.team.MembershipRequest;
import org.xcolab.client.proposals.pojo.team.MembershipRequestDto;
import org.xcolab.util.http.client.CoLabService;
import org.xcolab.util.enums.activity.ActivityEntryType;
import org.xcolab.util.enums.membershiprequest.MembershipRequestStatus;
import org.xcolab.util.exceptions.InternalException;
import org.xcolab.util.http.caching.CacheKeys;
import org.xcolab.util.http.caching.CacheName;
import org.xcolab.util.http.client.RestResource1;
import org.xcolab.util.http.client.RestService;
import org.xcolab.util.http.dto.DtoUtil;
import org.xcolab.util.http.exceptions.Http409ConflictException;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembershipClient {

    private static final Map<RestService, MembershipClient> instances = new HashMap<>();

    private final RestService proposalService;
    private final RestResource1<MembershipRequestDto, Long> membershipRequestResource;

    private final ProposalClient proposalClient;

    private MembershipClient(RestService proposalService) {
        membershipRequestResource = new RestResource1<>(proposalService,
                "membershipRequests", MembershipRequestDto.TYPES);
        proposalClient = ProposalClient.fromService(proposalService);
        this.proposalService = proposalService;
    }

    public static MembershipClient fromService(RestService proposalService) {
        return instances
                .computeIfAbsent(proposalService, MembershipClient::new);
    }

    public void denyMembershipRequest(long proposalId, long userId, long membershipRequestId,
            String reply, long updateAuthorId) {
        if (hasUserRequestedMembership(proposalId, userId)) {
            try {
                MembershipRequest membershipRequest = getMembershipRequest(membershipRequestId);
                membershipRequest.setStatusId(MembershipRequestStatus.STATUS_DENIED);
                membershipRequest.setReplierUserId(updateAuthorId);
                membershipRequest.setReplyComments(reply);
                membershipRequest.setReplyDate(new Timestamp((new Date()).getTime()));
                updateMembershipRequest(membershipRequest);
            } catch (MembershipRequestNotFoundException ignored) {

            }
        }
    }

    public boolean updateMembershipRequest(MembershipRequest membershipRequest) {
        return membershipRequestResource
                .update(new MembershipRequestDto(membershipRequest),
                        membershipRequest.getMembershipRequestId())
                .execute();
    }

    public Boolean hasUserRequestedMembership(Long proposalId, Long userId) {
        try {
            Long groupId = proposalClient.getProposal(proposalId).getGroupId();
            List<MembershipRequest> userRequests = getMembershipRequestsByUser(groupId, userId);
            if (userRequests != null && !userRequests.isEmpty()) {
                return true;
            }
        } catch (ProposalNotFoundException ignored) {

        }
        return false;
    }

    public List<MembershipRequest> getMembershipRequestsByUser(Long groupId, Long userId) {
        return DtoUtil.toPojos(membershipRequestResource.list()
                .withCache(CacheKeys.withClass(MembershipRequestDto.class)
                        .withParameter("groupId", groupId)
                        .withParameter("userId", userId).asList(), CacheName.MISC_MEDIUM)
                .optionalQueryParam("groupId", groupId)
                .optionalQueryParam("userId", userId)
                .execute(), proposalService);
    }

    public MembershipRequest getMembershipRequest(long MembershipRequestId)
            throws MembershipRequestNotFoundException {
        return membershipRequestResource.get(MembershipRequestId)
                .execute().toPojo(proposalService);
    }

    public void approveMembershipRequest(long proposalId, Long userId, MembershipRequest request,
            String reply, Long updateAuthorId) {

        if (hasUserRequestedMembership(proposalId, userId)) {
            try {
                MembershipRequest membershipRequest =
                        getMembershipRequest(request.getMembershipRequestId());
                membershipRequest.setStatusId(MembershipRequestStatus.STATUS_APPROVED);
                membershipRequest.setReplierUserId(updateAuthorId);
                membershipRequest.setReplyComments(reply);
                membershipRequest.setReplyDate(new Timestamp((new Date()).getTime()));
                updateMembershipRequest(membershipRequest);
                addUserToProposalTeam(userId, membershipRequest.getGroupId(), proposalId);
            } catch (MembershipRequestNotFoundException e) {
                throw new InternalException(e);
            }
        }
    }

    public void addUserToProposalTeam(Long userId, Long groupId, Long proposalId) {
        RestService memberService  = proposalService.withServiceName(CoLabService.MEMBER.getServiceName());
        UsersGroupsClient usersGroupsClient = UsersGroupsClient.fromService(memberService);

        try {
            usersGroupsClient.addMemberToGroup(userId, groupId);

            RestService activitiesService  = proposalService.withServiceName(CoLabService.ACTIVITY.getServiceName());
            ActivitiesClient activityClient = ActivitiesClient.fromService(activitiesService);

            ActivityEntryHelper.createActivityEntry(activityClient,userId, proposalId, null,
                    ActivityProvidersType.ProposalMemberAddedActivityEntry.getType());


            if (!activityClient.isSubscribedToActivity(userId,
                    ActivityEntryType.PROPOSAL.getPrimaryTypeId(), proposalId, 0, "")) {
                activityClient
                        .addSubscription(userId, ActivityEntryType.PROPOSAL, proposalId, null);

            }
        } catch (Http409ConflictException ignored) {
            // already a member - don't do anything
        }
    }

    public MembershipRequest addInvitedMembershipRequest(Long proposalId, Long userId,
            String comment) {
        return createMembershipRequest(proposalId, userId, comment,
                MembershipRequestStatus.STATUS_PENDING_INVITED);
    }

    private MembershipRequest createMembershipRequest(Long proposalId, Long userId, String comment,
            Integer status) {
        try {
            Long groupId = proposalClient.getProposal(proposalId).getGroupId();

            MembershipRequest membershipRequest = new MembershipRequest();
            membershipRequest.setComments(comment == null ? "" : comment);
            membershipRequest.setUserId(userId);
            membershipRequest.setGroupId(groupId);
            membershipRequest.setCompanyId(10112L);
            membershipRequest.setStatusId(status);
            membershipRequest = createMembershipRequest(membershipRequest);
            return membershipRequest;
        } catch (ProposalNotFoundException ignored) {

        }
        return null;
    }

    public MembershipRequest createMembershipRequest(MembershipRequest membershipRequest) {
        return membershipRequestResource.create(new MembershipRequestDto(membershipRequest))
                .execute().toPojo(proposalService);
    }

    public MembershipRequest addRequestedMembershipRequest(Long proposalId, Long userId,
            String comment) {
        return createMembershipRequest(proposalId, userId, comment,
                MembershipRequestStatus.STATUS_PENDING_REQUESTED);
    }

    public List<MembershipRequest> getMembershipRequests(Long proposalId) {

        try {
            Proposal proposal = proposalClient.getProposal(proposalId);
            List<MembershipRequest> invited = getMembershipRequestsByStatus(proposal.getGroupId(),
                    MembershipRequestStatus.STATUS_PENDING_INVITED);
            List<MembershipRequest> requested = getMembershipRequestsByStatus(proposal.getGroupId(),
                    MembershipRequestStatus.STATUS_PENDING_REQUESTED);
            List<MembershipRequest> olderRequests =
                    getMembershipRequestsByStatus(proposal.getGroupId(),
                            MembershipRequestStatus.STATUS_PENDING);
            List<MembershipRequest> combined = new ArrayList<>();
            if (invited != null && !invited.isEmpty()) {
                combined.addAll(invited);
            }
            if (requested != null && !requested.isEmpty()) {
                combined.addAll(requested);
            }
            if (olderRequests != null && !olderRequests.isEmpty()) {
                combined.addAll(olderRequests);
            }
            return combined;
        } catch (ProposalNotFoundException ignored) {
            return null;
        }
    }

    public List<MembershipRequest> getMembershipRequestsByStatus(Long groupId, Integer statusId) {
        return DtoUtil.toPojos(membershipRequestResource.list()
                .withCache(CacheKeys.withClass(MembershipRequestDto.class)
                        .withParameter("groupId", groupId)
                        .withParameter("statusId", statusId).asList(), CacheName.MISC_REQUEST)
                .optionalQueryParam("groupId", groupId)
                .optionalQueryParam("statusId", statusId)
                .execute(), proposalService);
    }

}
