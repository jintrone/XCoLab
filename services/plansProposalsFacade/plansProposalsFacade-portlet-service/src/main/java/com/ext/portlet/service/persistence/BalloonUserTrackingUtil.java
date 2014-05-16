package com.ext.portlet.service.persistence;

import com.ext.portlet.model.BalloonUserTracking;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the balloon user tracking service. This utility wraps {@link BalloonUserTrackingPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalloonUserTrackingPersistence
 * @see BalloonUserTrackingPersistenceImpl
 * @generated
 */
public class BalloonUserTrackingUtil {
    private static BalloonUserTrackingPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(BalloonUserTracking balloonUserTracking) {
        getPersistence().clearCache(balloonUserTracking);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<BalloonUserTracking> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<BalloonUserTracking> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<BalloonUserTracking> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static BalloonUserTracking update(
        BalloonUserTracking balloonUserTracking) throws SystemException {
        return getPersistence().update(balloonUserTracking);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static BalloonUserTracking update(
        BalloonUserTracking balloonUserTracking, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(balloonUserTracking, serviceContext);
    }

    /**
    * Returns all the balloon user trackings where email = &#63;.
    *
    * @param email the email
    * @return the matching balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findByEmail(
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email);
    }

    /**
    * Returns a range of all the balloon user trackings where email = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param email the email
    * @param start the lower bound of the range of balloon user trackings
    * @param end the upper bound of the range of balloon user trackings (not inclusive)
    * @return the range of matching balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findByEmail(
        java.lang.String email, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email, start, end);
    }

    /**
    * Returns an ordered range of all the balloon user trackings where email = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param email the email
    * @param start the lower bound of the range of balloon user trackings
    * @param end the upper bound of the range of balloon user trackings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findByEmail(
        java.lang.String email, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail(email, start, end, orderByComparator);
    }

    /**
    * Returns the first balloon user tracking in the ordered set where email = &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching balloon user tracking
    * @throws com.ext.portlet.NoSuchBalloonUserTrackingException if a matching balloon user tracking could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking findByEmail_First(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchBalloonUserTrackingException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail_First(email, orderByComparator);
    }

    /**
    * Returns the first balloon user tracking in the ordered set where email = &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching balloon user tracking, or <code>null</code> if a matching balloon user tracking could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking fetchByEmail_First(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmail_First(email, orderByComparator);
    }

    /**
    * Returns the last balloon user tracking in the ordered set where email = &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching balloon user tracking
    * @throws com.ext.portlet.NoSuchBalloonUserTrackingException if a matching balloon user tracking could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking findByEmail_Last(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchBalloonUserTrackingException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmail_Last(email, orderByComparator);
    }

    /**
    * Returns the last balloon user tracking in the ordered set where email = &#63;.
    *
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching balloon user tracking, or <code>null</code> if a matching balloon user tracking could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking fetchByEmail_Last(
        java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmail_Last(email, orderByComparator);
    }

    /**
    * Returns the balloon user trackings before and after the current balloon user tracking in the ordered set where email = &#63;.
    *
    * @param uuid the primary key of the current balloon user tracking
    * @param email the email
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next balloon user tracking
    * @throws com.ext.portlet.NoSuchBalloonUserTrackingException if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking[] findByEmail_PrevAndNext(
        java.lang.String uuid, java.lang.String email,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchBalloonUserTrackingException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmail_PrevAndNext(uuid, email, orderByComparator);
    }

    /**
    * Removes all the balloon user trackings where email = &#63; from the database.
    *
    * @param email the email
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmail(java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmail(email);
    }

    /**
    * Returns the number of balloon user trackings where email = &#63;.
    *
    * @param email the email
    * @return the number of matching balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmail(java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmail(email);
    }

    /**
    * Caches the balloon user tracking in the entity cache if it is enabled.
    *
    * @param balloonUserTracking the balloon user tracking
    */
    public static void cacheResult(
        com.ext.portlet.model.BalloonUserTracking balloonUserTracking) {
        getPersistence().cacheResult(balloonUserTracking);
    }

    /**
    * Caches the balloon user trackings in the entity cache if it is enabled.
    *
    * @param balloonUserTrackings the balloon user trackings
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.model.BalloonUserTracking> balloonUserTrackings) {
        getPersistence().cacheResult(balloonUserTrackings);
    }

    /**
    * Creates a new balloon user tracking with the primary key. Does not add the balloon user tracking to the database.
    *
    * @param uuid the primary key for the new balloon user tracking
    * @return the new balloon user tracking
    */
    public static com.ext.portlet.model.BalloonUserTracking create(
        java.lang.String uuid) {
        return getPersistence().create(uuid);
    }

    /**
    * Removes the balloon user tracking with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param uuid the primary key of the balloon user tracking
    * @return the balloon user tracking that was removed
    * @throws com.ext.portlet.NoSuchBalloonUserTrackingException if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking remove(
        java.lang.String uuid)
        throws com.ext.portlet.NoSuchBalloonUserTrackingException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(uuid);
    }

    public static com.ext.portlet.model.BalloonUserTracking updateImpl(
        com.ext.portlet.model.BalloonUserTracking balloonUserTracking)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(balloonUserTracking);
    }

    /**
    * Returns the balloon user tracking with the primary key or throws a {@link com.ext.portlet.NoSuchBalloonUserTrackingException} if it could not be found.
    *
    * @param uuid the primary key of the balloon user tracking
    * @return the balloon user tracking
    * @throws com.ext.portlet.NoSuchBalloonUserTrackingException if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking findByPrimaryKey(
        java.lang.String uuid)
        throws com.ext.portlet.NoSuchBalloonUserTrackingException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(uuid);
    }

    /**
    * Returns the balloon user tracking with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param uuid the primary key of the balloon user tracking
    * @return the balloon user tracking, or <code>null</code> if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonUserTracking fetchByPrimaryKey(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(uuid);
    }

    /**
    * Returns all the balloon user trackings.
    *
    * @return the balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the balloon user trackings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of balloon user trackings
    * @param end the upper bound of the range of balloon user trackings (not inclusive)
    * @return the range of balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the balloon user trackings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of balloon user trackings
    * @param end the upper bound of the range of balloon user trackings (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonUserTracking> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the balloon user trackings from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of balloon user trackings.
    *
    * @return the number of balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static BalloonUserTrackingPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (BalloonUserTrackingPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.service.ClpSerializer.getServletContextName(),
                    BalloonUserTrackingPersistence.class.getName());

            ReferenceRegistry.registerReference(BalloonUserTrackingUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(BalloonUserTrackingPersistence persistence) {
    }
}
