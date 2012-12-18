package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanTeamHistory;
import com.ext.portlet.plans.service.PlanTeamHistoryLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanTeamHistory service. Represents a row in the &quot;xcolab_PlanTeamHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanTeamHistoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTeamHistoryImpl
 * @see com.ext.portlet.plans.model.PlanTeamHistory
 * @generated
 */
public abstract class PlanTeamHistoryBaseImpl extends PlanTeamHistoryModelImpl
    implements PlanTeamHistory {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan team history model instance should use the {@link PlanTeamHistory} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanTeamHistoryLocalServiceUtil.addPlanTeamHistory(this);
        } else {
            PlanTeamHistoryLocalServiceUtil.updatePlanTeamHistory(this);
        }
    }
}
