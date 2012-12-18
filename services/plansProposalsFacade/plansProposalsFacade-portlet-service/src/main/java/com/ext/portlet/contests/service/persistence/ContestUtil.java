package com.ext.portlet.contests.service.persistence;

import com.ext.portlet.contests.model.Contest;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the contest service. This utility wraps {@link ContestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContestPersistence
 * @see ContestPersistenceImpl
 * @generated
 */
public class ContestUtil {
    private static ContestPersistence _persistence;

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
    public static void clearCache(Contest contest) {
        getPersistence().clearCache(contest);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Contest> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Contest> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Contest> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Contest update(Contest contest, boolean merge)
        throws SystemException {
        return getPersistence().update(contest, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Contest update(Contest contest, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(contest, merge, serviceContext);
    }

    /**
    * Caches the contest in the entity cache if it is enabled.
    *
    * @param contest the contest
    */
    public static void cacheResult(
        com.ext.portlet.contests.model.Contest contest) {
        getPersistence().cacheResult(contest);
    }

    /**
    * Caches the contests in the entity cache if it is enabled.
    *
    * @param contests the contests
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.contests.model.Contest> contests) {
        getPersistence().cacheResult(contests);
    }

    /**
    * Creates a new contest with the primary key. Does not add the contest to the database.
    *
    * @param ContestPK the primary key for the new contest
    * @return the new contest
    */
    public static com.ext.portlet.contests.model.Contest create(long ContestPK) {
        return getPersistence().create(ContestPK);
    }

    /**
    * Removes the contest with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ContestPK the primary key of the contest
    * @return the contest that was removed
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest remove(long ContestPK)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(ContestPK);
    }

    public static com.ext.portlet.contests.model.Contest updateImpl(
        com.ext.portlet.contests.model.Contest contest, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(contest, merge);
    }

    /**
    * Returns the contest with the primary key or throws a {@link com.ext.portlet.contests.NoSuchContestException} if it could not be found.
    *
    * @param ContestPK the primary key of the contest
    * @return the contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByPrimaryKey(
        long ContestPK)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(ContestPK);
    }

    /**
    * Returns the contest with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ContestPK the primary key of the contest
    * @return the contest, or <code>null</code> if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest fetchByPrimaryKey(
        long ContestPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(ContestPK);
    }

    /**
    * Returns all the contests where PlanTypeId = &#63;.
    *
    * @param PlanTypeId the plan type ID
    * @return the matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByType(
        long PlanTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByType(PlanTypeId);
    }

    /**
    * Returns a range of all the contests where PlanTypeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param PlanTypeId the plan type ID
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @return the range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByType(
        long PlanTypeId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByType(PlanTypeId, start, end);
    }

    /**
    * Returns an ordered range of all the contests where PlanTypeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param PlanTypeId the plan type ID
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByType(
        long PlanTypeId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByType(PlanTypeId, start, end, orderByComparator);
    }

    /**
    * Returns the first contest in the ordered set where PlanTypeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param PlanTypeId the plan type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByType_First(
        long PlanTypeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByType_First(PlanTypeId, orderByComparator);
    }

    /**
    * Returns the last contest in the ordered set where PlanTypeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param PlanTypeId the plan type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByType_Last(
        long PlanTypeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByType_Last(PlanTypeId, orderByComparator);
    }

    /**
    * Returns the contests before and after the current contest in the ordered set where PlanTypeId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPK the primary key of the current contest
    * @param PlanTypeId the plan type ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest[] findByType_PrevAndNext(
        long ContestPK, long PlanTypeId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByType_PrevAndNext(ContestPK, PlanTypeId,
            orderByComparator);
    }

    /**
    * Returns the contest where contestActive = &#63; or throws a {@link com.ext.portlet.contests.NoSuchContestException} if it could not be found.
    *
    * @param contestActive the contest active
    * @return the matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findBycontestActive(
        boolean contestActive)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBycontestActive(contestActive);
    }

    /**
    * Returns the contest where contestActive = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param contestActive the contest active
    * @return the matching contest, or <code>null</code> if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest fetchBycontestActive(
        boolean contestActive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBycontestActive(contestActive);
    }

    /**
    * Returns the contest where contestActive = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param contestActive the contest active
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching contest, or <code>null</code> if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest fetchBycontestActive(
        boolean contestActive, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBycontestActive(contestActive, retrieveFromCache);
    }

    /**
    * Returns all the contests where contestActive = &#63; and featured = &#63;.
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @return the matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFeatured(
        boolean contestActive, boolean featured)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActiveFeatured(contestActive, featured);
    }

    /**
    * Returns a range of all the contests where contestActive = &#63; and featured = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @return the range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFeatured(
        boolean contestActive, boolean featured, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFeatured(contestActive, featured, start, end);
    }

    /**
    * Returns an ordered range of all the contests where contestActive = &#63; and featured = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFeatured(
        boolean contestActive, boolean featured, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFeatured(contestActive, featured, start, end,
            orderByComparator);
    }

    /**
    * Returns the first contest in the ordered set where contestActive = &#63; and featured = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFeatured_First(
        boolean contestActive, boolean featured,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFeatured_First(contestActive, featured,
            orderByComparator);
    }

    /**
    * Returns the last contest in the ordered set where contestActive = &#63; and featured = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFeatured_Last(
        boolean contestActive, boolean featured,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFeatured_Last(contestActive, featured,
            orderByComparator);
    }

    /**
    * Returns the contests before and after the current contest in the ordered set where contestActive = &#63; and featured = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPK the primary key of the current contest
    * @param contestActive the contest active
    * @param featured the featured
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest[] findByActiveFeatured_PrevAndNext(
        long ContestPK, boolean contestActive, boolean featured,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFeatured_PrevAndNext(ContestPK, contestActive,
            featured, orderByComparator);
    }

    /**
    * Returns all the contests where contestActive = &#63; and flag = &#63;.
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @return the matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlag(
        boolean contestActive, int flag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActiveFlag(contestActive, flag);
    }

    /**
    * Returns a range of all the contests where contestActive = &#63; and flag = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @return the range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlag(
        boolean contestActive, int flag, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActiveFlag(contestActive, flag, start, end);
    }

    /**
    * Returns an ordered range of all the contests where contestActive = &#63; and flag = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlag(
        boolean contestActive, int flag, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlag(contestActive, flag, start, end,
            orderByComparator);
    }

    /**
    * Returns the first contest in the ordered set where contestActive = &#63; and flag = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFlag_First(
        boolean contestActive, int flag,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlag_First(contestActive, flag,
            orderByComparator);
    }

    /**
    * Returns the last contest in the ordered set where contestActive = &#63; and flag = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFlag_Last(
        boolean contestActive, int flag,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlag_Last(contestActive, flag, orderByComparator);
    }

    /**
    * Returns the contests before and after the current contest in the ordered set where contestActive = &#63; and flag = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPK the primary key of the current contest
    * @param contestActive the contest active
    * @param flag the flag
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest[] findByActiveFlag_PrevAndNext(
        long ContestPK, boolean contestActive, int flag,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlag_PrevAndNext(ContestPK, contestActive,
            flag, orderByComparator);
    }

    /**
    * Returns all the contests where contestActive = &#63; and flagText = &#63;.
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @return the matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlagText(
        boolean contestActive, java.lang.String flagText)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByActiveFlagText(contestActive, flagText);
    }

    /**
    * Returns a range of all the contests where contestActive = &#63; and flagText = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @return the range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlagText(
        boolean contestActive, java.lang.String flagText, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlagText(contestActive, flagText, start, end);
    }

    /**
    * Returns an ordered range of all the contests where contestActive = &#63; and flagText = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findByActiveFlagText(
        boolean contestActive, java.lang.String flagText, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlagText(contestActive, flagText, start, end,
            orderByComparator);
    }

    /**
    * Returns the first contest in the ordered set where contestActive = &#63; and flagText = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFlagText_First(
        boolean contestActive, java.lang.String flagText,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlagText_First(contestActive, flagText,
            orderByComparator);
    }

    /**
    * Returns the last contest in the ordered set where contestActive = &#63; and flagText = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a matching contest could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest findByActiveFlagText_Last(
        boolean contestActive, java.lang.String flagText,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlagText_Last(contestActive, flagText,
            orderByComparator);
    }

    /**
    * Returns the contests before and after the current contest in the ordered set where contestActive = &#63; and flagText = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPK the primary key of the current contest
    * @param contestActive the contest active
    * @param flagText the flag text
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contest
    * @throws com.ext.portlet.contests.NoSuchContestException if a contest with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.Contest[] findByActiveFlagText_PrevAndNext(
        long ContestPK, boolean contestActive, java.lang.String flagText,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByActiveFlagText_PrevAndNext(ContestPK, contestActive,
            flagText, orderByComparator);
    }

    /**
    * Returns all the contests.
    *
    * @return the contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the contests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @return the range of contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the contests.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contests
    * @param end the upper bound of the range of contests (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of contests
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.Contest> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the contests where PlanTypeId = &#63; from the database.
    *
    * @param PlanTypeId the plan type ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByType(long PlanTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByType(PlanTypeId);
    }

    /**
    * Removes the contest where contestActive = &#63; from the database.
    *
    * @param contestActive the contest active
    * @throws SystemException if a system exception occurred
    */
    public static void removeBycontestActive(boolean contestActive)
        throws com.ext.portlet.contests.NoSuchContestException,
            com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBycontestActive(contestActive);
    }

    /**
    * Removes all the contests where contestActive = &#63; and featured = &#63; from the database.
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @throws SystemException if a system exception occurred
    */
    public static void removeByActiveFeatured(boolean contestActive,
        boolean featured)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByActiveFeatured(contestActive, featured);
    }

    /**
    * Removes all the contests where contestActive = &#63; and flag = &#63; from the database.
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @throws SystemException if a system exception occurred
    */
    public static void removeByActiveFlag(boolean contestActive, int flag)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByActiveFlag(contestActive, flag);
    }

    /**
    * Removes all the contests where contestActive = &#63; and flagText = &#63; from the database.
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @throws SystemException if a system exception occurred
    */
    public static void removeByActiveFlagText(boolean contestActive,
        java.lang.String flagText)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByActiveFlagText(contestActive, flagText);
    }

    /**
    * Removes all the contests from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of contests where PlanTypeId = &#63;.
    *
    * @param PlanTypeId the plan type ID
    * @return the number of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static int countByType(long PlanTypeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByType(PlanTypeId);
    }

    /**
    * Returns the number of contests where contestActive = &#63;.
    *
    * @param contestActive the contest active
    * @return the number of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static int countBycontestActive(boolean contestActive)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBycontestActive(contestActive);
    }

    /**
    * Returns the number of contests where contestActive = &#63; and featured = &#63;.
    *
    * @param contestActive the contest active
    * @param featured the featured
    * @return the number of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static int countByActiveFeatured(boolean contestActive,
        boolean featured)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByActiveFeatured(contestActive, featured);
    }

    /**
    * Returns the number of contests where contestActive = &#63; and flag = &#63;.
    *
    * @param contestActive the contest active
    * @param flag the flag
    * @return the number of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static int countByActiveFlag(boolean contestActive, int flag)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByActiveFlag(contestActive, flag);
    }

    /**
    * Returns the number of contests where contestActive = &#63; and flagText = &#63;.
    *
    * @param contestActive the contest active
    * @param flagText the flag text
    * @return the number of matching contests
    * @throws SystemException if a system exception occurred
    */
    public static int countByActiveFlagText(boolean contestActive,
        java.lang.String flagText)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByActiveFlagText(contestActive, flagText);
    }

    /**
    * Returns the number of contests.
    *
    * @return the number of contests
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ContestPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ContestPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.contests.service.ClpSerializer.getServletContextName(),
                    ContestPersistence.class.getName());

            ReferenceRegistry.registerReference(ContestUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    public void setPersistence(ContestPersistence persistence) {
        _persistence = persistence;

        ReferenceRegistry.registerReference(ContestUtil.class, "_persistence");
    }
}
