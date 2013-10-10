package org.xcolab.portlets.proposals.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.xcolab.portlets.proposals.requests.RequestMembershipBean;
import org.xcolab.portlets.proposals.wrappers.ProposalTab;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

@Controller
@RequestMapping("view")
public class ProposalTeamTabController extends BaseProposalTabController {

    @Autowired
    private Validator validator;

    @InitBinder("requestMembershipBean")
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(params = {"pageToDisplay=proposalDetails_TEAM"})
    public String show(Model model)
            throws PortalException, SystemException {
        model.addAttribute("currentTab", ProposalTab.TEAM);

        model.addAttribute("requestMembershipBean", new RequestMembershipBean());

        return "proposalTeam";
    }


}