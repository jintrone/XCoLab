package org.xcolab.view.pages.proposals.permissions;


import org.xcolab.client.contest.pojo.phases.ContestPhase;
import org.xcolab.client.members.PermissionsClient;
import org.xcolab.client.proposals.pojo.Proposal;
import org.xcolab.client.proposals.pojo.team.MembershipRequest;
import org.xcolab.util.activities.enums.ActivityCategory;
import org.xcolab.view.pages.proposals.utils.context.ClientHelper;

/**
 * Helper class to decide whether a certain user should see things in the UI
 */
public class ProposalsDisplayPermissions {

    private final ProposalsPermissions proposalsPermissions;
    private final ClientHelper clientHelper;
    private final Proposal proposal;
    private final ContestPhase contestPhase;
    private final long memberId;
    private final boolean isGuest;
    private final boolean isLoggedIn;

    public ProposalsDisplayPermissions(ProposalsPermissions proposalsPermissions, Proposal proposal,
            ContestPhase contestPhase, ClientHelper clientHelper, long memberId) {
        this.proposalsPermissions = proposalsPermissions;
        this.proposal = proposal;
        this.contestPhase = contestPhase;
        this.memberId = memberId;
        this.isLoggedIn = memberId > 0;
        this.isGuest = PermissionsClient.isGuest(memberId);
        this.clientHelper = clientHelper;
    }

    public boolean getCanSeeCreateProposalButton() {
        final boolean canSeeCreateProposalButton = !isGuest
                && proposalsPermissions.getIsCreationAllowedByPhase();
        return canSeeCreateProposalButton || proposalsPermissions.getCanAdminAll();
    }

    public boolean getCanSeeRequestMembershipButton() {
        return !isGuest && !proposalsPermissions.getIsTeamMember()
                && !getUserHasOpenMembershipRequest();
    }

    public boolean getUserHasOpenMembershipRequest() {
        for (MembershipRequest mr : clientHelper.getMembershipClient()
                .getMembershipRequests(proposal.getProposalId())) {
            if (mr.getUserId() == memberId && (
                    (mr.getStatusId() == MembershipRequestStatus.STATUS_PENDING)
                            || mr.getStatusId()
                            == MembershipRequestStatus.STATUS_PENDING_REQUESTED)) {
                return true;
            }
        }
        return false;
    }

    public boolean getCanSeeVoteButton() {
        return !isLoggedIn || (!isGuest && !hasVotedOnThisProposal());
    }

    private boolean hasVotedOnThisProposal() {
        return proposal != null && proposal.getProposalId() > 0
                && clientHelper.getProposalMemberRatingClient().hasUserVoted(
                proposal.getProposalId(), contestPhase.getContestPhasePK(), memberId);
    }

    public boolean getCanSeeUnsubscribeProposalButton() {
        return isLoggedIn && isSubscribedToProposal();
    }

    private boolean isSubscribedToProposal() {
        return proposal != null && proposal.getProposalId() > 0
                && (clientHelper.getProposalClient()
                .isMemberSubscribedToProposal(proposal.getProposalId(),memberId));
    }

    public boolean getCanSeeUnsubscribeContestButton() {
        return isLoggedIn && isSubscribedToContest();
    }

    private boolean isSubscribedToContest() {
        return contestPhase != null
                && clientHelper.getActivitiesClient().isSubscribedToActivity(memberId,
                        ActivityCategory.CONTEST, contestPhase.getContestPK());
    }

    public boolean getCanSeeSubscribeProposalButton() {
        return !isLoggedIn || !isSubscribedToProposal();
    }

    public boolean getCanSeeSubscribeContestButton() {
        return !isLoggedIn || !isSubscribedToContest();
    }

    public boolean getCanSeeUnsupportButton() {
        return (isLoggedIn && isSupporter())
                && !proposalsPermissions.isVotingEnabled();
    }

    private boolean isSupporter() {
        return proposal != null && proposal.getProposalId() > 0
                && clientHelper.getProposalMemberRatingClient()
                .isMemberProposalSupporter(proposal.getProposalId(), memberId);
    }

    public boolean getCanSeeSupportButton() {
        return (!isLoggedIn || !isSupporter())
                && !proposalsPermissions.isVotingEnabled();
    }

    public boolean getCanSeeReviewStatus() {
        return proposalsPermissions.getCanJudgeActions()
                || proposalsPermissions.getCanFellowActions()
                || proposalsPermissions.getCanIAFActions();
    }
}
