package org.xcolab.portlets.contestmanagement.controller.common;


import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.portlet.bind.annotation.ResourceMapping;
import org.xcolab.client.contest.ContestClientUtil;
import org.xcolab.client.contest.OntologyClientUtil;
import org.xcolab.client.contest.PlanTemplateClientUtil;
import org.xcolab.client.contest.pojo.ContestType;
import org.xcolab.client.contest.pojo.ontology.OntologyTerm;
import org.xcolab.client.contest.pojo.templates.PlanSectionDefinition;
import org.xcolab.client.proposals.PointsClientUtil;
import org.xcolab.client.proposals.pojo.points.PointType;
import org.xcolab.controller.BaseTabController;
import org.xcolab.enums.ContestTier;
import org.xcolab.enums.OntologySpaceEnum;
import org.xcolab.interfaces.TabEnum;
import org.xcolab.points.DistributionStrategy;
import org.xcolab.portlets.contestmanagement.entities.LabelStringValue;
import org.xcolab.portlets.contestmanagement.entities.LabelValue;
import org.xcolab.portlets.contestmanagement.entities.SectionTypes;
import org.xcolab.portlets.contestmanagement.wrappers.SectionDefinitionWrapper;
import org.xcolab.wrapper.TabWrapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

import javax.portlet.PortletRequest;
import javax.portlet.ResourceResponse;

/**
 * Created by Thomas on 2/13/2015.
 */
public abstract class ContestProposalTemplateTabController extends BaseTabController {

    private final static Log _log = LogFactoryUtil.getLog(ContestProposalTemplateTabController.class);
    static final public String TAB_VIEW = "manager/proposalTemplateTab";
    static final public String NO_PERMISSION_TAB_VIEW = "common/noPermissionTab";
    static final public String NOT_FOUND_TAB_VIEW = "common/notFound";

    protected TabWrapper tabWrapper;

    @ModelAttribute("levelSelectionItems")
    public List<LabelValue> populateLevelSelectionItems() {
        return getContestLevelSelectionItems();
    }

    @ModelAttribute("sectionTypeSelectionItems")
    public List<LabelStringValue> populateSectionTypesSelectionItems() {
        return getSectionTypesSelectionItems();
    }

    @ModelAttribute("contestTypeSelectionItems")
    public List<LabelValue> populateContestTypeSelectionItems() throws PortalException, SystemException {
        return getContestTypeSelectionItems();
    }

    @ModelAttribute("pointTypeSelectionItems")
    public List<LabelValue> populatePointTypeSelectionItems() throws PortalException, SystemException {
        return getPointTypeSelectionItems();
    }

    @ModelAttribute("whatTerms")
    public List<LabelValue> populateWhatTerms() throws PortalException, SystemException {
        return getWhatTerms();
    }

    @ModelAttribute("whereTerms")
    public List<LabelValue> populateWhereTerms() throws PortalException, SystemException {
        return getWhereTerms();
    }

    @ModelAttribute("whoTerms")
    public List<LabelValue> populateWhoTerms() throws PortalException, SystemException {
        return getWhoTerms();
    }

    @ModelAttribute("howTerms")
    public List<LabelValue> populateHowTerms() throws PortalException, SystemException {
        return getHowTerms();
    }

    @ResourceMapping(value = "getSectionDefinition")
    public
    @ResponseBody
    void getSectionDefinition(@RequestParam("sectionDefinitionId") Long sectionDefinitionId, ResourceResponse response)
            throws PortalException, SystemException, java.io.IOException {

        PlanSectionDefinition planSectionDefinition =
                PlanTemplateClientUtil.getPlanSectionDefinition(sectionDefinitionId);
        SectionDefinitionWrapper sectionDefinitionWrapper = new SectionDefinitionWrapper(planSectionDefinition);
        ObjectMapper mapper = new ObjectMapper();
        response.setContentType("application/json");
        response.getWriter().write(mapper.writeValueAsString(sectionDefinitionWrapper));
    }

    private List<LabelValue> getContestLevelSelectionItems() {
        List<LabelValue> selectItems = new ArrayList<>();
        for (ContestTier contestLevel : ContestTier.values()) {
            selectItems.add(new LabelValue(contestLevel.getTierType(), contestLevel.getTierName()));
        }
        return selectItems;
    }

    private List<LabelValue> getContestTypeSelectionItems() {
        List<LabelValue> selectItems = new ArrayList<>();
        for (ContestType contestType : ContestClientUtil.getActiveContestTypes()) {
            selectItems.add(new LabelValue(contestType.getId_(),
                    contestType.getLabelName()));
        }
        return selectItems;

    }

    private List<LabelValue> getPointTypeSelectionItems() {
        List<LabelValue> selectItems = new ArrayList<>();
        selectItems.add(new LabelValue(0L, "Default"));
        for (PointType pointType : PointsClientUtil.getAllPointTypes()) {
            if (pointType.getDistributionStrategy()
                    .equalsIgnoreCase(DistributionStrategy.SECTION_DEFINED.name())) {
                selectItems.add(new LabelValue(pointType.getId_(),
                        String.format("%d - %s : %s", pointType.getId_(),
                                pointType.getDistributionStrategy(),
                                pointType.getReceiverLimitationStrategy())));
            }
        }
        return selectItems;

    }

    private List<LabelStringValue> getSectionTypesSelectionItems() {
        List<LabelStringValue> selectItems = new ArrayList<>();
        for (SectionTypes sectionTypes : SectionTypes.values()) {
            selectItems.add(new LabelStringValue(sectionTypes.getSectionType(), sectionTypes.getDisplayName()));
        }
        return selectItems;
    }

    private List<LabelValue> getWhatTerms() {
        return getTermsFromOntologySpace(OntologySpaceEnum.WHAT);
    }

    private List<LabelValue> getWhereTerms() {
        return getTermsFromOntologySpace(OntologySpaceEnum.WHERE);
    }

    private List<LabelValue> getWhoTerms() {
        return getTermsFromOntologySpace(OntologySpaceEnum.WHO);
    }

    private List<LabelValue> getHowTerms() {
        return getTermsFromOntologySpace(OntologySpaceEnum.HOW);
    }

    private List<LabelValue> getTermsFromOntologySpace(OntologySpaceEnum ontologySpace) {
        List<Stack<OntologyTerm>> allParentsPaths = getAllOntologyTermParentPathStacks(ontologySpace);
        sortOntologyTermParentPathsAlphabetically(allParentsPaths);

        return buildOntologyTermParentPathSelectItemList(allParentsPaths);
    }

    private List<Stack<OntologyTerm>> getAllOntologyTermParentPathStacks(
            OntologySpaceEnum ontologySpace) {

        List<Stack<OntologyTerm>> allParentsPaths = new ArrayList<>();
        for (OntologyTerm term : OntologyClientUtil
                .getAllOntologyTerms()) {
            // Just consider terms in the passed ontologySpace
            if (term.getOntologySpaceId() != ontologySpace.getSpaceId()) {
                continue;
            }

            Stack<OntologyTerm> parentsPath = getOntologyTermParentPath(term);
            allParentsPaths.add(parentsPath);
        }

        return allParentsPaths;

    }

    private void sortOntologyTermParentPathsAlphabetically(List<Stack<OntologyTerm>> allParentsPaths) {
        Collections.sort(allParentsPaths, new Comparator<Stack<OntologyTerm>>() {

            @Override
            public int compare(Stack<OntologyTerm> o1, Stack<OntologyTerm> o2) {
                return compareOntologyTermStacks((Stack<OntologyTerm>) o1.clone(), (Stack<OntologyTerm>) o2.clone());
            }

        });
    }

    private int compareOntologyTermStacks(Stack<OntologyTerm> stack1, Stack<OntologyTerm> stack2) {
        String stack1FirstItemName;
        try {
            stack1FirstItemName = stack1.pop().getName();
        } catch (EmptyStackException e) {
            return -1;
        }
        String stack2FirstItemName;
        try {
            stack2FirstItemName = stack2.pop().getName();
        } catch (EmptyStackException e) {
            return 1;
        }

        if (stack1FirstItemName.compareTo(stack2FirstItemName) == 0) {
            return compareOntologyTermStacks(stack1, stack2);
        }

        return stack1FirstItemName.compareTo(stack2FirstItemName);
    }

    private List<LabelValue> buildOntologyTermParentPathSelectItemList(
            List<Stack<OntologyTerm>> allParentsPaths) {
        List<LabelValue> termSelectItems = new ArrayList<>();

        for (Stack<OntologyTerm> ontologyTermParentsPath : allParentsPaths) {
            OntologyTerm childTerm = ontologyTermParentsPath.firstElement();
            String ontologyTermPathString = buildOntologyTermPathString(ontologyTermParentsPath);
            termSelectItems.add(new LabelValue(childTerm.getId_(), ontologyTermPathString));
        }

        return termSelectItems;
    }


    private Stack<OntologyTerm> getOntologyTermParentPath(OntologyTerm term) {

        Stack<OntologyTerm> parentsPath = new Stack<>();
        OntologyTerm current = term;
        while (current != null) {
            parentsPath.push(current);
            current = OntologyClientUtil.getOntologyTermParent(current);

        }
        return parentsPath;

    }

    private String buildOntologyTermPathString(Stack<OntologyTerm> parentsPath) {
        if (parentsPath.size() == 1) {
            return parentsPath.pop().getName();
        }

        // Build a path string in the form of "--|--|--|-- childTermName"
        OntologyTerm currentTerm = parentsPath.pop();
        StringBuilder nameStr = new StringBuilder();
        boolean firstItem = true;
        while (!parentsPath.isEmpty()) {
            currentTerm = parentsPath.pop();
            if (firstItem) {
                nameStr.append("-");
                firstItem = false;
            }
            nameStr.append("-|-");
        }
        nameStr.append("- ").append(currentTerm.getName());
        return nameStr.toString();
    }

    @Override
    public void setPageAttributes(PortletRequest request, Model model, TabEnum tab)
            throws PortalException, SystemException {
    }

}