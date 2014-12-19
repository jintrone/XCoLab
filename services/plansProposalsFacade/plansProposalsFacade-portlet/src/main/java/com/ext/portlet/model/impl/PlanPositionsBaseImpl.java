package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanPositions;
import com.ext.portlet.service.PlanPositionsLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanPositions service. Represents a row in the &quot;xcolab_PlanPositions&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanPositionsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanPositionsImpl
 * @see com.ext.portlet.model.PlanPositions
 * @generated
 */
public abstract class PlanPositionsBaseImpl extends PlanPositionsModelImpl
    implements PlanPositions {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan positions model instance should use the {@link PlanPositions} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanPositionsLocalServiceUtil.addPlanPositions(this);
        } else {
            PlanPositionsLocalServiceUtil.updatePlanPositions(this);
        }
    }
}
