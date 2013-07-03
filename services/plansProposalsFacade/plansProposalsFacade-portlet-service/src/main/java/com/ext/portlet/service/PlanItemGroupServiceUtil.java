package com.ext.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the plan item group remote service. This utility wraps {@link com.ext.portlet.service.impl.PlanItemGroupServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanItemGroupService
 * @see com.ext.portlet.service.base.PlanItemGroupServiceBaseImpl
 * @see com.ext.portlet.service.impl.PlanItemGroupServiceImpl
 * @generated
 */
public class PlanItemGroupServiceUtil {
    private static PlanItemGroupService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.service.impl.PlanItemGroupServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */
    public static void clearService() {
        _service = null;
    }

    public static PlanItemGroupService getService() {
        if (_service == null) {
            Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlanItemGroupService.class.getName());
            ClassLoader portletClassLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    "portletClassLoader");

            ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
                    PlanItemGroupService.class.getName(), portletClassLoader);

            _service = new PlanItemGroupServiceClp(classLoaderProxy);

            ClpSerializer.setClassLoader(portletClassLoader);

            ReferenceRegistry.registerReference(PlanItemGroupServiceUtil.class,
                "_service");
            MethodCache.remove(PlanItemGroupService.class);
        }

        return _service;
    }

    public void setService(PlanItemGroupService service) {
        MethodCache.remove(PlanItemGroupService.class);

        _service = service;

        ReferenceRegistry.registerReference(PlanItemGroupServiceUtil.class,
            "_service");
        MethodCache.remove(PlanItemGroupService.class);
    }
}
