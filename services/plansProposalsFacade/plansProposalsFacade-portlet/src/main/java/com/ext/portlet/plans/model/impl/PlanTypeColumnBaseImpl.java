package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanTypeColumn;
import com.ext.portlet.plans.service.PlanTypeColumnLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanTypeColumn service. Represents a row in the &quot;xcolab_PlanTypeColumn&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanTypeColumnImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTypeColumnImpl
 * @see com.ext.portlet.plans.model.PlanTypeColumn
 * @generated
 */
public abstract class PlanTypeColumnBaseImpl extends PlanTypeColumnModelImpl
    implements PlanTypeColumn {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan type column model instance should use the {@link PlanTypeColumn} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanTypeColumnLocalServiceUtil.addPlanTypeColumn(this);
        } else {
            PlanTypeColumnLocalServiceUtil.updatePlanTypeColumn(this);
        }
    }
}
