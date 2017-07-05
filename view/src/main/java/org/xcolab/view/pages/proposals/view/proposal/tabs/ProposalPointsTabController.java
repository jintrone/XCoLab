package org.xcolab.view.pages.proposals.view.proposal.tabs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.xcolab.client.contest.pojo.Contest;
import org.xcolab.client.members.pojo.Member;
import org.xcolab.client.proposals.ProposalClientUtil;
import org.xcolab.client.proposals.enums.points.DistributionStrategy;
import org.xcolab.client.proposals.enums.points.PointsTarget;
import org.xcolab.client.proposals.enums.points.ReceiverLimitationStrategy;
import org.xcolab.client.proposals.pojo.Proposal;
import org.xcolab.client.proposals.pojo.points.PointType;
import org.xcolab.view.pages.proposals.requests.AssignPointsBean;
import org.xcolab.view.pages.proposals.tabs.ProposalTab;
import org.xcolab.view.pages.proposals.utils.context.ProposalContext;
import org.xcolab.view.pages.proposals.wrappers.PointsTargetProposalWrapper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/contests/{contestYear}/{contestUrlName}")
public class ProposalPointsTabController extends BaseProposalTabController {

    @GetMapping(value = "c/{proposalUrlString}/{proposalId}", params = "tab=POINTS")
    public String showProposalDetails(HttpServletRequest request, Model model,
            ProposalContext proposalContext) {

        setCommonModelAndPageAttributes(request, model, proposalContext, ProposalTab.POINTS);
        Proposal proposal = proposalContext.getProposal();
        Contest contest = proposalContext.getContest();

        PointType contestParentPointType = proposalContext.getClients().getPointsClient()
                .getPointType(contest.getDefaultParentPointType());

        if (contestParentPointType == null) {
            //there is no point scheme set for this contest, forward to description tab
            return "";
        }

        List<Proposal> subProposalsWrapped = ProposalClientUtil
                .getSubproposals(proposal.getProposalId(), false);

        //TODO: make this flexible
        PointType pointType = proposalContext.getClients().getPointsClient().getPointType(9L);
        DistributionStrategy distributionStrategy = DistributionStrategy.valueOf(pointType.getDistributionStrategy());
        ReceiverLimitationStrategy receiverLimitationStrategy = ReceiverLimitationStrategy.valueOf(pointType.getReceiverLimitationStrategy());

        List<PointsTarget> targets = receiverLimitationStrategy.getTargets(proposal, pointType, distributionStrategy);
        List<PointsTargetProposalWrapper> regionalPercentages = new ArrayList<>();
        for (PointsTarget target : targets) {
            regionalPercentages.add(new PointsTargetProposalWrapper(target, 93l));
        }

        pointType = proposalContext.getClients().getPointsClient().getPointType(4L);
        distributionStrategy = DistributionStrategy.valueOf(pointType.getDistributionStrategy());
        receiverLimitationStrategy = ReceiverLimitationStrategy.valueOf(pointType.getReceiverLimitationStrategy());

        targets = receiverLimitationStrategy.getTargets(proposal, pointType, distributionStrategy);
        List<PointsTargetProposalWrapper> basicPercentages = new ArrayList<>();
        for (PointsTarget target : targets) {
            basicPercentages.add(new PointsTargetProposalWrapper(target, 2l));
        }


        final List<Proposal> linkingProposalsWrapped = proposalContext.getClients().getProposalClient().getLinkingProposals(proposal.getProposalId());


        List<Member> members = proposalContext.getClients().getProposalClient().getProposalMembers(proposal.getProposalId());

        //this bean will be filled with the user input
        AssignPointsBean assignPointsBean = new AssignPointsBean(proposal.getProposalId());
        assignPointsBean.addAllAssignments((contestParentPointType), members);

        model.addAttribute("assignPointsBean", assignPointsBean);
        model.addAttribute("pointsToDistribute", contest.getPoints());
        model.addAttribute("pointType", (contestParentPointType));
        model.addAttribute("recursionLevel", 0);
        model.addAttribute("percentageOfTotalPoints", (contestParentPointType).getPercentageOfParent());
        model.addAttribute("subProposals", subProposalsWrapped);
        model.addAttribute("regionalPercentages", regionalPercentages);
        model.addAttribute("basicPercentages", basicPercentages);
        model.addAttribute("members", members);
        model.addAttribute("totalPoints", proposalContext.getClients().getProposalClient().getProposalMaterializedPoints(proposal.getProposalId()));
        model.addAttribute("proposal", proposal);
        model.addAttribute("contest", contest);
        model.addAttribute("linkingProposals", linkingProposalsWrapped);
        return "/proposals/proposalPoints";
    }
}
