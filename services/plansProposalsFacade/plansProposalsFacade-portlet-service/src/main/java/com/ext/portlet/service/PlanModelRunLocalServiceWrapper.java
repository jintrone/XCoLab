package com.ext.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlanModelRunLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanModelRunLocalService
 * @generated
 */
public class PlanModelRunLocalServiceWrapper implements PlanModelRunLocalService,
    ServiceWrapper<PlanModelRunLocalService> {
    private PlanModelRunLocalService _planModelRunLocalService;

    public PlanModelRunLocalServiceWrapper(
        PlanModelRunLocalService planModelRunLocalService) {
        _planModelRunLocalService = planModelRunLocalService;
    }

    /**
    * Adds the plan model run to the database. Also notifies the appropriate model listeners.
    *
    * @param planModelRun the plan model run
    * @return the plan model run that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.PlanModelRun addPlanModelRun(
        com.ext.portlet.model.PlanModelRun planModelRun)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.addPlanModelRun(planModelRun);
    }

    /**
    * Creates a new plan model run with the primary key. Does not add the plan model run to the database.
    *
    * @param id the primary key for the new plan model run
    * @return the new plan model run
    */
    @Override
    public com.ext.portlet.model.PlanModelRun createPlanModelRun(long id) {
        return _planModelRunLocalService.createPlanModelRun(id);
    }

    /**
    * Deletes the plan model run with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the plan model run
    * @return the plan model run that was removed
    * @throws PortalException if a plan model run with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.PlanModelRun deletePlanModelRun(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.deletePlanModelRun(id);
    }

    /**
    * Deletes the plan model run from the database. Also notifies the appropriate model listeners.
    *
    * @param planModelRun the plan model run
    * @return the plan model run that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.PlanModelRun deletePlanModelRun(
        com.ext.portlet.model.PlanModelRun planModelRun)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.deletePlanModelRun(planModelRun);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _planModelRunLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.PlanModelRunModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.PlanModelRunModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun fetchPlanModelRun(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.fetchPlanModelRun(id);
    }

    /**
    * Returns the plan model run with the primary key.
    *
    * @param id the primary key of the plan model run
    * @return the plan model run
    * @throws PortalException if a plan model run with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.PlanModelRun getPlanModelRun(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getPlanModelRun(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the plan model runs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.PlanModelRunModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of plan model runs
    * @param end the upper bound of the range of plan model runs (not inclusive)
    * @return the range of plan model runs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.ext.portlet.model.PlanModelRun> getPlanModelRuns(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getPlanModelRuns(start, end);
    }

    /**
    * Returns the number of plan model runs.
    *
    * @return the number of plan model runs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPlanModelRunsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getPlanModelRunsCount();
    }

    /**
    * Updates the plan model run in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planModelRun the plan model run
    * @return the plan model run that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.PlanModelRun updatePlanModelRun(
        com.ext.portlet.model.PlanModelRun planModelRun)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.updatePlanModelRun(planModelRun);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _planModelRunLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _planModelRunLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _planModelRunLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun createPlanModelRun(
        com.ext.portlet.model.PlanItem plan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.createPlanModelRun(plan);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun getCurrentForPlan(
        com.ext.portlet.model.PlanItem plan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getCurrentForPlan(plan);
    }

    @Override
    public java.util.List<com.ext.portlet.model.PlanModelRun> getAllForPlan(
        com.ext.portlet.model.PlanItem plan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getAllForPlan(plan);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun getForPlan(
        com.ext.portlet.model.PlanItem plan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getForPlan(plan);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun createNewVersionForPlan(
        com.ext.portlet.model.PlanItem plan)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.createNewVersionForPlan(plan);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun createNewVersionForPlan(
        com.ext.portlet.model.PlanItem plan, boolean store)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.createNewVersionForPlan(plan, store);
    }

    @Override
    public com.ext.portlet.model.PlanModelRun createNewVersionForPlanFrom(
        com.ext.portlet.model.PlanItem plan,
        com.ext.portlet.model.PlanModelRun from, boolean store)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.createNewVersionForPlanFrom(plan,
            from, store);
    }

    @Override
    public void store(com.ext.portlet.model.PlanModelRun pmr)
        throws com.liferay.portal.kernel.exception.SystemException {
        _planModelRunLocalService.store(pmr);
    }

    @Override
    public com.liferay.portal.model.User getUpdateAuthor(
        com.ext.portlet.model.PlanModelRun pmr)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planModelRunLocalService.getUpdateAuthor(pmr);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PlanModelRunLocalService getWrappedPlanModelRunLocalService() {
        return _planModelRunLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPlanModelRunLocalService(
        PlanModelRunLocalService planModelRunLocalService) {
        _planModelRunLocalService = planModelRunLocalService;
    }

    @Override
    public PlanModelRunLocalService getWrappedService() {
        return _planModelRunLocalService;
    }

    @Override
    public void setWrappedService(
        PlanModelRunLocalService planModelRunLocalService) {
        _planModelRunLocalService = planModelRunLocalService;
    }
}
