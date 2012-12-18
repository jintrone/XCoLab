package com.ext.portlet.plans.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the plan property filter local service. This utility wraps {@link com.ext.portlet.plans.service.impl.PlanPropertyFilterLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanPropertyFilterLocalService
 * @see com.ext.portlet.plans.service.base.PlanPropertyFilterLocalServiceBaseImpl
 * @see com.ext.portlet.plans.service.impl.PlanPropertyFilterLocalServiceImpl
 * @generated
 */
public class PlanPropertyFilterLocalServiceUtil {
    private static PlanPropertyFilterLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.plans.service.impl.PlanPropertyFilterLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the plan property filter to the database. Also notifies the appropriate model listeners.
    *
    * @param planPropertyFilter the plan property filter
    * @return the plan property filter that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlanPropertyFilter addPlanPropertyFilter(
        com.ext.portlet.plans.model.PlanPropertyFilter planPropertyFilter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPlanPropertyFilter(planPropertyFilter);
    }

    /**
    * Creates a new plan property filter with the primary key. Does not add the plan property filter to the database.
    *
    * @param planPropertyFilterId the primary key for the new plan property filter
    * @return the new plan property filter
    */
    public static com.ext.portlet.plans.model.PlanPropertyFilter createPlanPropertyFilter(
        long planPropertyFilterId) {
        return getService().createPlanPropertyFilter(planPropertyFilterId);
    }

    /**
    * Deletes the plan property filter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param planPropertyFilterId the primary key of the plan property filter
    * @throws PortalException if a plan property filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static void deletePlanPropertyFilter(long planPropertyFilterId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deletePlanPropertyFilter(planPropertyFilterId);
    }

    /**
    * Deletes the plan property filter from the database. Also notifies the appropriate model listeners.
    *
    * @param planPropertyFilter the plan property filter
    * @throws SystemException if a system exception occurred
    */
    public static void deletePlanPropertyFilter(
        com.ext.portlet.plans.model.PlanPropertyFilter planPropertyFilter)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deletePlanPropertyFilter(planPropertyFilter);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.ext.portlet.plans.model.PlanPropertyFilter fetchPlanPropertyFilter(
        long planPropertyFilterId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPlanPropertyFilter(planPropertyFilterId);
    }

    /**
    * Returns the plan property filter with the primary key.
    *
    * @param planPropertyFilterId the primary key of the plan property filter
    * @return the plan property filter
    * @throws PortalException if a plan property filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlanPropertyFilter getPlanPropertyFilter(
        long planPropertyFilterId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanPropertyFilter(planPropertyFilterId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the plan property filters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan property filters
    * @param end the upper bound of the range of plan property filters (not inclusive)
    * @return the range of plan property filters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.plans.model.PlanPropertyFilter> getPlanPropertyFilters(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanPropertyFilters(start, end);
    }

    /**
    * Returns the number of plan property filters.
    *
    * @return the number of plan property filters
    * @throws SystemException if a system exception occurred
    */
    public static int getPlanPropertyFiltersCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanPropertyFiltersCount();
    }

    /**
    * Updates the plan property filter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planPropertyFilter the plan property filter
    * @return the plan property filter that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlanPropertyFilter updatePlanPropertyFilter(
        com.ext.portlet.plans.model.PlanPropertyFilter planPropertyFilter)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePlanPropertyFilter(planPropertyFilter);
    }

    /**
    * Updates the plan property filter in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planPropertyFilter the plan property filter
    * @param merge whether to merge the plan property filter with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the plan property filter that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlanPropertyFilter updatePlanPropertyFilter(
        com.ext.portlet.plans.model.PlanPropertyFilter planPropertyFilter,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePlanPropertyFilter(planPropertyFilter, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static com.ext.portlet.plans.model.PlanPropertyFilter getByPlanPlanUserSettingsIdPropertyName(
        java.lang.Long planUserSettingsId, java.lang.String propertyName)
        throws com.ext.portlet.plans.NoSuchPlanPropertyFilterException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getByPlanPlanUserSettingsIdPropertyName(planUserSettingsId,
            propertyName);
    }

    public static void clearService() {
        _service = null;
    }

    public static PlanPropertyFilterLocalService getService() {
        if (_service == null) {
            Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlanPropertyFilterLocalService.class.getName());
            ClassLoader portletClassLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    "portletClassLoader");

            ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
                    PlanPropertyFilterLocalService.class.getName(),
                    portletClassLoader);

            _service = new PlanPropertyFilterLocalServiceClp(classLoaderProxy);

            ClpSerializer.setClassLoader(portletClassLoader);

            ReferenceRegistry.registerReference(PlanPropertyFilterLocalServiceUtil.class,
                "_service");
            MethodCache.remove(PlanPropertyFilterLocalService.class);
        }

        return _service;
    }

    public void setService(PlanPropertyFilterLocalService service) {
        MethodCache.remove(PlanPropertyFilterLocalService.class);

        _service = service;

        ReferenceRegistry.registerReference(PlanPropertyFilterLocalServiceUtil.class,
            "_service");
        MethodCache.remove(PlanPropertyFilterLocalService.class);
    }
}
