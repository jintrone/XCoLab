package org.xcolab.view.pages.proposals.view.action;


import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.xcolab.client.contest.exceptions.ContestNotFoundException;
import org.xcolab.client.contest.pojo.Contest;
import org.xcolab.client.members.pojo.Member;
import org.xcolab.client.proposals.ProposalMemberRatingClient;
import org.xcolab.view.pages.loginregister.SharedColabUtil;
import org.xcolab.view.pages.proposals.exceptions.ProposalsAuthorizationException;
import org.xcolab.view.pages.proposals.utils.context.ProposalContext;
import org.xcolab.view.util.entity.analytics.AnalyticsUtil;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SupportProposalActionController {
    
    private final static String SUPPORT_ANALYTICS_KEY = "SUPPORTED_ENTRIES";
    private final static String SUPPORT_ANALYTICS_CATEGORY = "User";
    private final static String SUPPORT_ANALYTICS_ACTION = "Support contest entry";
    private final static String SUPPORT_ANALYTICS_LABEL = "";


    //-- @RequestMapping(params = {"action=supportProposalAction"})
    @GetMapping("/contests/{contestYear}/{contestUrlName}/c/{proposalUrlString}/{proposalId}/supportProposalAction")
    public synchronized void handleAction(HttpServletRequest request, HttpServletResponse response,
            Model model, ProposalContext proposalContext, Member currentMember,
            @RequestParam(required = false) String forwardToTab)
            throws ProposalsAuthorizationException, IOException {
        
        if (proposalContext.getPermissions().getCanSupportProposal()) {
            long memberId = currentMember.getUserId();
            long proposalId = proposalContext.getProposal().getProposalId();
            ProposalMemberRatingClient proposalMemberRatingClient = proposalContext.getClients().getProposalMemberRatingClient();
            if (proposalMemberRatingClient.isMemberProposalSupporter(proposalId, memberId)) {
                proposalMemberRatingClient.removeProposalSupporter(proposalId, memberId);
            }
            else {
                proposalMemberRatingClient.addProposalSupporter(proposalId, memberId);
                int supportedCount = proposalMemberRatingClient.getProposalSupportersCount(memberId);
                if (supportedCount > 0) {
                    int analyticsValue = AnalyticsUtil.getAnalyticsValueForCount(supportedCount);
                    AnalyticsUtil.publishEvent(request, memberId, SUPPORT_ANALYTICS_KEY + analyticsValue,
            			SUPPORT_ANALYTICS_CATEGORY,
            			SUPPORT_ANALYTICS_ACTION,
            			SUPPORT_ANALYTICS_LABEL,
            			analyticsValue);
                }
                try {
                    Contest contest = proposalContext.getClients().getProposalClient().getLatestContestInProposal(proposalId);
                    SharedColabUtil.checkTriggerForAutoUserCreationInContest(contest.getContestPK(), memberId);
                }catch (ContestNotFoundException ignore){

                }
            }
            String proposalLinkUrl = proposalContext.getProposal().getProposalLinkUrl(proposalContext.getContest());
            if (!StringUtils.isBlank(forwardToTab)) {
                proposalLinkUrl += "/tab/" + forwardToTab;
            }
            response.sendRedirect(proposalLinkUrl);
        }
        else {
            throw new ProposalsAuthorizationException("User isn't allowed to toggle support for proposal");
        }
    }

}
