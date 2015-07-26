package org.xcolab.portlets.contestmanagement.beans;

import com.ext.portlet.NoSuchFocusAreaException;
import com.ext.portlet.model.FocusArea;
import com.ext.portlet.model.OntologySpace;
import com.ext.portlet.model.OntologyTerm;
import com.ext.portlet.model.PlanSectionDefinition;
import com.ext.portlet.model.PlanTemplateSection;
import com.ext.portlet.service.FocusAreaLocalServiceUtil;
import com.ext.portlet.service.OntologySpaceLocalServiceUtil;
import com.ext.portlet.service.OntologyTermLocalServiceUtil;
import com.ext.portlet.service.PlanTemplateSectionLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.Validator;
import org.xcolab.enums.OntologySpaceEnum;
import org.xcolab.utils.OntologyTermToFocusAreaMapper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Thomas on 2/13/2015.
 */
public class SectionDefinitionBean implements Serializable{
    private final static Log _log = LogFactoryUtil.getLog(SectionDefinitionBean.class);

    private Long id;
    private Long sectionDefinitionId;
    private String type = "";
    private String title = "";
    private String defaultText = "";
    private String helpText = "";
    private Integer characterLimit = 200;
    private long focusAreaId = 0L;
    private Long level;
    private String content = "";
    private boolean locked = false;
    private boolean deletable = true;
    private boolean isSectionNew = false;
    private boolean templateSection = false;
    private boolean contestIntegrationRelevance = false;
    private int weight;

    private List<Long> whatTermIds = new ArrayList<>();
    private List<Long> whereTermIds = new ArrayList<>();
    private List<Long> whoTermIds = new ArrayList<>();
    private List<Long> howTermIds = new ArrayList<>();

    public SectionDefinitionBean() {
    }

    public SectionDefinitionBean(PlanSectionDefinition planSectionDefinition) throws PortalException, SystemException {
        initPlanSectionDefinition(planSectionDefinition);
    }

    public SectionDefinitionBean(PlanSectionDefinition planSectionDefinition, Long planTemplateId) throws Exception{
        initPlanSectionDefinition(planSectionDefinition);

        List<PlanTemplateSection> planTemplateSections =
                PlanTemplateSectionLocalServiceUtil.findByPlanTemplateId(planTemplateId);

        // TODO very inefficient, add finder to service layer
        for(PlanTemplateSection planTemplateSection : planTemplateSections){
            if(planTemplateSection.getPlanSectionId() == planSectionDefinition.getId()) {
                initPlanTemplateSection(planTemplateSection);
                break;
            }
        }

        initPlanSectionDefinition(planSectionDefinition);

    }

    private void initPlanTemplateSection(PlanTemplateSection planTemplateSection){
        this.weight = planTemplateSection.getWeight();
    }

    private void initPlanSectionDefinition(PlanSectionDefinition planSectionDefinition) throws SystemException, PortalException {
        this.sectionDefinitionId = planSectionDefinition.getId();
        this.type = planSectionDefinition.getType();
        this.title = planSectionDefinition.getTitle();
        this.defaultText = planSectionDefinition.getDefaultText();
        this.helpText = planSectionDefinition.getHelpText();
        this.characterLimit = planSectionDefinition.getCharacterLimit();
        this.focusAreaId = planSectionDefinition.getFocusAreaId();
        this.locked = planSectionDefinition.getLocked();
        this.level = planSectionDefinition.getTier();
        this.contestIntegrationRelevance = planSectionDefinition.getContestIntegrationRelevance();
        this.focusAreaId = planSectionDefinition.getFocusAreaId();

        try {
            initOntologyTermIdsWithFocusAreaId();
        } catch (NoSuchFocusAreaException e){
            _log.warn(e);
        }
    }

    private void initOntologyTermIdsWithFocusAreaId() throws SystemException, PortalException {
        if (this.focusAreaId != 0) {
            FocusArea focusArea = FocusAreaLocalServiceUtil.getFocusArea(this.focusAreaId);

            OntologySpace space = OntologySpaceLocalServiceUtil.getOntologySpace(OntologySpaceEnum.WHAT.getSpaceId());
            List<OntologyTerm> terms = FocusAreaLocalServiceUtil.getAllOntologyTermsFromFocusAreaWithOntologySpace(focusArea, space);
            this.whatTermIds = getIdsFromOntologyTerms(terms);

            space = OntologySpaceLocalServiceUtil.getOntologySpace(OntologySpaceEnum.WHERE.getSpaceId());
            terms = FocusAreaLocalServiceUtil.getAllOntologyTermsFromFocusAreaWithOntologySpace(focusArea, space);
            this.whereTermIds = getIdsFromOntologyTerms(terms);

            space = OntologySpaceLocalServiceUtil.getOntologySpace(OntologySpaceEnum.WHO.getSpaceId());
            terms = FocusAreaLocalServiceUtil.getAllOntologyTermsFromFocusAreaWithOntologySpace(focusArea, space);
            this.whoTermIds = getIdsFromOntologyTerms(terms);

            space = OntologySpaceLocalServiceUtil.getOntologySpace(OntologySpaceEnum.HOW.getSpaceId());
            terms = FocusAreaLocalServiceUtil.getAllOntologyTermsFromFocusAreaWithOntologySpace(focusArea, space);
            this.howTermIds = getIdsFromOntologyTerms(terms);
        }
    }

    public SectionDefinitionBean(String title) {
        this.title = title;
    }

    public SectionDefinitionBean(String title, boolean deletable) {
        this.title = title;
        this.deletable = deletable;
    }

    public SectionDefinitionBean(String title, Integer characterLimit, String helpText, String content) {
        this.title = title;
        this.characterLimit = characterLimit;
        this.helpText = helpText;
        this.content = content;
    }

    public SectionDefinitionBean(String title, Integer characterLimit, String helpText, String content, boolean deletable) {
        this.title = title;
        this.characterLimit = characterLimit;
        this.helpText = helpText;
        this.content = content;
        this.deletable = deletable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCharacterLimit() {
        return characterLimit;
    }

    public void setCharacterLimit(Integer characterLimit) {
        this.characterLimit = characterLimit;
    }

    public String getHelpText() {
        return helpText;
    }

    public void setHelpText(String helpText) {
        this.helpText = helpText;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDeletable() {
        return deletable;
    }

    public boolean isSectionNew() {
        return isSectionNew;
    }

    public void setSectionNew(boolean isSectionNew) {
        this.isSectionNew = isSectionNew;
    }

    public boolean isTemplateSection() {
        return templateSection;
    }

    public void setTemplateSection(boolean templateSection) {
        this.templateSection = templateSection;
    }

    public void setDeletable(boolean deletable) {
        this.deletable = deletable;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(String defaultText) {
        this.defaultText = defaultText;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Long getSectionDefinitionId() {
        return sectionDefinitionId;
    }

    public void setSectionDefinitionId(Long sectionDefinitionId) {
        this.sectionDefinitionId = sectionDefinitionId;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public boolean isContestIntegrationRelevance() {
        return contestIntegrationRelevance;
    }

    public void setContestIntegrationRelevance(boolean contestIntegrationRelevance) {
        this.contestIntegrationRelevance = contestIntegrationRelevance;
    }

    public List<Long> getWhatTermIds() {
        return whatTermIds;
    }

    public void setWhatTermIds(List<Long> whatTermIds) {
        this.whatTermIds = whatTermIds;
    }

    public List<Long> getWhereTermIds() {
        return whereTermIds;
    }

    public void setWhereTermIds(List<Long> whereTermIds) {
        this.whereTermIds = whereTermIds;
    }

    public List<Long> getWhoTermIds() {
        return whoTermIds;
    }

    public void setWhoTermIds(List<Long> whoTermIds) {
        this.whoTermIds = whoTermIds;
    }

    public List<Long> getHowTermIds() {
        return howTermIds;
    }

    public void setHowTermIds(List<Long> howTermIds) {
        this.howTermIds = howTermIds;
    }

    public void setFocusAreaId(long focusAreaId) {
        this.focusAreaId = focusAreaId;
    }

    public long getFocusAreaId(){
        try {
            if (ontologyTermsSet()) {
                focusAreaId = getFocusAreaViaOntologyTerms().getId();
            }
            return focusAreaId;
        } catch (Exception e) {
            _log.warn("Could not get focus area id", e);
        }

        return 0L;
    }

    private boolean ontologyTermsSet() {
        return (getWhatTermIds().size() > 0 && getWhereTermIds().size() > 0 && getWhoTermIds().size() > 0 && getHowTermIds().size() > 0);
    }

    public static final Comparator<SectionDefinitionBean> sectionListComparator = new MyComparator();

    static class MyComparator implements Comparator<SectionDefinitionBean>{

        @Override
        public int compare(SectionDefinitionBean o1, SectionDefinitionBean o2) {
            return o1.getWeight() - o2.getWeight();
        }
    }

    private FocusArea getFocusAreaViaOntologyTerms() throws SystemException, PortalException {
        List<OntologyTerm> termsToBeMatched = getAllSelectedOntologyTerms();

        OntologyTermToFocusAreaMapper focusAreaMapper = new OntologyTermToFocusAreaMapper(termsToBeMatched);
        FocusArea focusArea = focusAreaMapper.getFocusAreaMatchingTermsExactly();

        if (Validator.isNull(focusArea)) {
            focusArea = createNewFocusAreaWithTerms(termsToBeMatched);
        }

        return focusArea;
    }

    private FocusArea createNewFocusAreaWithTerms(List<OntologyTerm> focusAreaOntologyTerms) throws SystemException, PortalException {
        FocusArea newFocusArea = FocusAreaLocalServiceUtil.createFocusArea(CounterLocalServiceUtil.increment(FocusArea.class.getName()));
        newFocusArea.setName("created for planSectionDefinition '" + this.title + "'");
        for (OntologyTerm ontologyTerm : focusAreaOntologyTerms) {
            FocusAreaLocalServiceUtil.addTerm(newFocusArea, ontologyTerm.getId());
        }

        FocusAreaLocalServiceUtil.store(newFocusArea);
        return newFocusArea;
    }

    private List<Long> getIdsFromOntologyTerms(List<OntologyTerm> ontologyTerms) {
        List<Long> ids = new ArrayList<>(ontologyTerms.size());
        for (OntologyTerm term : ontologyTerms) {
            ids.add(term.getId());
        }

        return ids;
    }

    private List<OntologyTerm> getAllSelectedOntologyTerms() throws SystemException, PortalException {
        List[] ontologyTermIdLists = new List[] {
                getWhatTermIds(), getWhereTermIds(), getWhoTermIds(), getHowTermIds()
        };

        List<OntologyTerm> selectedOntologyTerms = new ArrayList<>();
        for (List<Long> ontologyTermIds : ontologyTermIdLists) {
            for (Long ontologyTermId : ontologyTermIds) {
                selectedOntologyTerms.add(OntologyTermLocalServiceUtil.getOntologyTerm(ontologyTermId));
            }
        }

        return selectedOntologyTerms;
    }
}
