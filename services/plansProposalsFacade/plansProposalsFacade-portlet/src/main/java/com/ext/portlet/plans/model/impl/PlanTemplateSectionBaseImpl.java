package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanTemplateSection;
import com.ext.portlet.plans.service.PlanTemplateSectionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanTemplateSection service. Represents a row in the &quot;xcolab_PlanTemplateSection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanTemplateSectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplateSectionImpl
 * @see com.ext.portlet.plans.model.PlanTemplateSection
 * @generated
 */
public abstract class PlanTemplateSectionBaseImpl
    extends PlanTemplateSectionModelImpl implements PlanTemplateSection {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan template section model instance should use the {@link PlanTemplateSection} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanTemplateSectionLocalServiceUtil.addPlanTemplateSection(this);
        } else {
            PlanTemplateSectionLocalServiceUtil.updatePlanTemplateSection(this);
        }
    }
}
