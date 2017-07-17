package org.xcolab.view.pages.proposals.view.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.xcolab.client.proposals.ProposalPhaseClientUtil;
import org.xcolab.util.enums.contest.ProposalContestPhaseAttributeKeys;
import org.xcolab.view.pages.proposals.exceptions.ProposalsAuthorizationException;
import org.xcolab.view.pages.proposals.utils.context.ProposalContext;
import org.xcolab.view.util.entity.flash.AlertMessage;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AssignRibbonToProposalActionController {

    @PostMapping("/contests/{contestYear}/{contestUrlName}/c/{proposalUrlString}/{proposalId}/tab/ADMIN/assignRibbon")
    public void handleAction(HttpServletRequest request, HttpServletResponse response, Model model,
            ProposalContext proposalContext, @RequestParam int ribbon)
            throws ProposalsAuthorizationException, IOException {
        
        if (proposalContext.getPermissions().getCanAssignRibbon()) {
            long proposalId = proposalContext.getProposal().getProposalId();
            long contestPhaseId = proposalContext.getContestPhase().getContestPhasePK();

            ProposalPhaseClientUtil.setProposalContestPhaseAttribute(proposalId, contestPhaseId,
                    ProposalContestPhaseAttributeKeys.RIBBON, null, (long) ribbon, null);

            AlertMessage.success("The ribbon has been assigned to the proposal at the current contest phase!").flash(request);
            response.sendRedirect(proposalContext.getProposal().getProposalLinkUrl(proposalContext.getContest(),
                    proposalContext.getContestPhase().getContestPhasePK()) + "/tab/ADMIN");
        }
        else {
            throw new ProposalsAuthorizationException("User isn't allowed to assign ribbon");
        }
    }
}
