package com.ext.portlet.plans.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link PlanTeamHistoryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       PlanTeamHistoryLocalService
 * @generated
 */
public class PlanTeamHistoryLocalServiceWrapper
    implements PlanTeamHistoryLocalService,
        ServiceWrapper<PlanTeamHistoryLocalService> {
    private PlanTeamHistoryLocalService _planTeamHistoryLocalService;

    public PlanTeamHistoryLocalServiceWrapper(
        PlanTeamHistoryLocalService planTeamHistoryLocalService) {
        _planTeamHistoryLocalService = planTeamHistoryLocalService;
    }

    /**
    * Adds the plan team history to the database. Also notifies the appropriate model listeners.
    *
    * @param planTeamHistory the plan team history
    * @return the plan team history that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTeamHistory addPlanTeamHistory(
        com.ext.portlet.plans.model.PlanTeamHistory planTeamHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.addPlanTeamHistory(planTeamHistory);
    }

    /**
    * Creates a new plan team history with the primary key. Does not add the plan team history to the database.
    *
    * @param id the primary key for the new plan team history
    * @return the new plan team history
    */
    public com.ext.portlet.plans.model.PlanTeamHistory createPlanTeamHistory(
        long id) {
        return _planTeamHistoryLocalService.createPlanTeamHistory(id);
    }

    /**
    * Deletes the plan team history with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the plan team history
    * @throws PortalException if a plan team history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deletePlanTeamHistory(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _planTeamHistoryLocalService.deletePlanTeamHistory(id);
    }

    /**
    * Deletes the plan team history from the database. Also notifies the appropriate model listeners.
    *
    * @param planTeamHistory the plan team history
    * @throws SystemException if a system exception occurred
    */
    public void deletePlanTeamHistory(
        com.ext.portlet.plans.model.PlanTeamHistory planTeamHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        _planTeamHistoryLocalService.deletePlanTeamHistory(planTeamHistory);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.dynamicQuery(dynamicQuery, start,
            end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.plans.model.PlanTeamHistory fetchPlanTeamHistory(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.fetchPlanTeamHistory(id);
    }

    /**
    * Returns the plan team history with the primary key.
    *
    * @param id the primary key of the plan team history
    * @return the plan team history
    * @throws PortalException if a plan team history with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTeamHistory getPlanTeamHistory(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getPlanTeamHistory(id);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the plan team histories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan team histories
    * @param end the upper bound of the range of plan team histories (not inclusive)
    * @return the range of plan team histories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanTeamHistory> getPlanTeamHistories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getPlanTeamHistories(start, end);
    }

    /**
    * Returns the number of plan team histories.
    *
    * @return the number of plan team histories
    * @throws SystemException if a system exception occurred
    */
    public int getPlanTeamHistoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getPlanTeamHistoriesCount();
    }

    /**
    * Updates the plan team history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planTeamHistory the plan team history
    * @return the plan team history that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTeamHistory updatePlanTeamHistory(
        com.ext.portlet.plans.model.PlanTeamHistory planTeamHistory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.updatePlanTeamHistory(planTeamHistory);
    }

    /**
    * Updates the plan team history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planTeamHistory the plan team history
    * @param merge whether to merge the plan team history with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the plan team history that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTeamHistory updatePlanTeamHistory(
        com.ext.portlet.plans.model.PlanTeamHistory planTeamHistory,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.updatePlanTeamHistory(planTeamHistory,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _planTeamHistoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _planTeamHistoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    public com.ext.portlet.plans.model.PlanTeamHistory newHistoryItem(
        java.lang.Long planId, java.lang.Long userId, java.lang.String action,
        java.lang.Long updateAuthorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.newHistoryItem(planId, userId,
            action, updateAuthorId);
    }

    public com.ext.portlet.plans.model.PlanTeamHistory newHistoryItem(
        java.lang.Long planId, java.lang.Long userId, java.lang.String action,
        java.lang.String payload, java.lang.Long updateAuthorId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.newHistoryItem(planId, userId,
            action, payload, updateAuthorId);
    }

    public com.ext.portlet.plans.model.PlanTeamHistory getLastUserActionInPlan(
        java.lang.Long planId, java.lang.Long userId)
        throws com.ext.portlet.plans.NoSuchPlanTeamHistoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getLastUserActionInPlan(planId,
            userId);
    }

    public void store(com.ext.portlet.plans.model.PlanTeamHistory pth)
        throws com.liferay.portal.kernel.exception.SystemException {
        _planTeamHistoryLocalService.store(pth);
    }

    public com.liferay.portal.model.User getUser(
        com.ext.portlet.plans.model.PlanTeamHistory pth)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getUser(pth);
    }

    public com.ext.portlet.plans.model.PlanItem getPlan(
        com.ext.portlet.plans.model.PlanTeamHistory pth)
        throws com.ext.portlet.plans.NoSuchPlanItemException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTeamHistoryLocalService.getPlan(pth);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public PlanTeamHistoryLocalService getWrappedPlanTeamHistoryLocalService() {
        return _planTeamHistoryLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedPlanTeamHistoryLocalService(
        PlanTeamHistoryLocalService planTeamHistoryLocalService) {
        _planTeamHistoryLocalService = planTeamHistoryLocalService;
    }

    public PlanTeamHistoryLocalService getWrappedService() {
        return _planTeamHistoryLocalService;
    }

    public void setWrappedService(
        PlanTeamHistoryLocalService planTeamHistoryLocalService) {
        _planTeamHistoryLocalService = planTeamHistoryLocalService;
    }
}
