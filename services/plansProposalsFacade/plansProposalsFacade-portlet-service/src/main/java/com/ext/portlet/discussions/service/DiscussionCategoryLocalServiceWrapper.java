package com.ext.portlet.discussions.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link DiscussionCategoryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DiscussionCategoryLocalService
 * @generated
 */
public class DiscussionCategoryLocalServiceWrapper
    implements DiscussionCategoryLocalService,
        ServiceWrapper<DiscussionCategoryLocalService> {
    private DiscussionCategoryLocalService _discussionCategoryLocalService;

    public DiscussionCategoryLocalServiceWrapper(
        DiscussionCategoryLocalService discussionCategoryLocalService) {
        _discussionCategoryLocalService = discussionCategoryLocalService;
    }

    /**
    * Adds the discussion category to the database. Also notifies the appropriate model listeners.
    *
    * @param discussionCategory the discussion category
    * @return the discussion category that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.discussions.model.DiscussionCategory addDiscussionCategory(
        com.ext.portlet.discussions.model.DiscussionCategory discussionCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.addDiscussionCategory(discussionCategory);
    }

    /**
    * Creates a new discussion category with the primary key. Does not add the discussion category to the database.
    *
    * @param pk the primary key for the new discussion category
    * @return the new discussion category
    */
    public com.ext.portlet.discussions.model.DiscussionCategory createDiscussionCategory(
        long pk) {
        return _discussionCategoryLocalService.createDiscussionCategory(pk);
    }

    /**
    * Deletes the discussion category with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pk the primary key of the discussion category
    * @throws PortalException if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteDiscussionCategory(long pk)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _discussionCategoryLocalService.deleteDiscussionCategory(pk);
    }

    /**
    * Deletes the discussion category from the database. Also notifies the appropriate model listeners.
    *
    * @param discussionCategory the discussion category
    * @throws SystemException if a system exception occurred
    */
    public void deleteDiscussionCategory(
        com.ext.portlet.discussions.model.DiscussionCategory discussionCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        _discussionCategoryLocalService.deleteDiscussionCategory(discussionCategory);
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
        return _discussionCategoryLocalService.dynamicQuery(dynamicQuery);
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
        return _discussionCategoryLocalService.dynamicQuery(dynamicQuery,
            start, end);
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
        return _discussionCategoryLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return _discussionCategoryLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.discussions.model.DiscussionCategory fetchDiscussionCategory(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.fetchDiscussionCategory(pk);
    }

    /**
    * Returns the discussion category with the primary key.
    *
    * @param pk the primary key of the discussion category
    * @return the discussion category
    * @throws PortalException if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.discussions.model.DiscussionCategory getDiscussionCategory(
        long pk)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getDiscussionCategory(pk);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the discussion categories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of discussion categories
    * @param end the upper bound of the range of discussion categories (not inclusive)
    * @return the range of discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.discussions.model.DiscussionCategory> getDiscussionCategories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getDiscussionCategories(start,
            end);
    }

    /**
    * Returns the number of discussion categories.
    *
    * @return the number of discussion categories
    * @throws SystemException if a system exception occurred
    */
    public int getDiscussionCategoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getDiscussionCategoriesCount();
    }

    /**
    * Updates the discussion category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param discussionCategory the discussion category
    * @return the discussion category that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.discussions.model.DiscussionCategory updateDiscussionCategory(
        com.ext.portlet.discussions.model.DiscussionCategory discussionCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.updateDiscussionCategory(discussionCategory);
    }

    /**
    * Updates the discussion category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param discussionCategory the discussion category
    * @param merge whether to merge the discussion category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the discussion category that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.discussions.model.DiscussionCategory updateDiscussionCategory(
        com.ext.portlet.discussions.model.DiscussionCategory discussionCategory,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.updateDiscussionCategory(discussionCategory,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _discussionCategoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _discussionCategoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.util.List<com.ext.portlet.discussions.model.DiscussionCategory> getCategoriesByCategoryGroupId(
        java.lang.Long categoryGroupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getCategoriesByCategoryGroupId(categoryGroupId);
    }

    public com.ext.portlet.discussions.model.DiscussionCategory getDiscussionCategoryById(
        java.lang.Long categoryId)
        throws com.ext.portlet.discussions.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getDiscussionCategoryById(categoryId);
    }

    public com.ext.portlet.discussions.model.DiscussionCategory createDebateCategory(
        java.lang.Long categoryGroupId, java.lang.String name,
        java.lang.String description, com.liferay.portal.model.User author)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.createDebateCategory(categoryGroupId,
            name, description, author);
    }

    public java.util.List<com.ext.portlet.discussions.model.DiscussionMessage> getThreads(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getThreads(dCategory);
    }

    public com.ext.portlet.discussions.model.DiscussionMessage addThread(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory,
        java.lang.String subject, java.lang.String body,
        com.liferay.portal.model.User author)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.addThread(dCategory, subject,
            body, author);
    }

    public void store(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        _discussionCategoryLocalService.store(dCategory);
    }

    public com.liferay.portal.model.User getAuthor(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getAuthor(dCategory);
    }

    public com.liferay.portal.model.User getLastActivityAuthor(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getLastActivityAuthor(dCategory);
    }

    public void delete(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        _discussionCategoryLocalService.delete(dCategory);
    }

    public void update(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory,
        java.lang.String name, java.lang.String description)
        throws com.liferay.portal.kernel.exception.SystemException {
        _discussionCategoryLocalService.update(dCategory, name, description);
    }

    public com.ext.portlet.discussions.model.DiscussionCategoryGroup getCategoryGroup(
        com.ext.portlet.discussions.model.DiscussionCategory dCategory)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _discussionCategoryLocalService.getCategoryGroup(dCategory);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public DiscussionCategoryLocalService getWrappedDiscussionCategoryLocalService() {
        return _discussionCategoryLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedDiscussionCategoryLocalService(
        DiscussionCategoryLocalService discussionCategoryLocalService) {
        _discussionCategoryLocalService = discussionCategoryLocalService;
    }

    public DiscussionCategoryLocalService getWrappedService() {
        return _discussionCategoryLocalService;
    }

    public void setWrappedService(
        DiscussionCategoryLocalService discussionCategoryLocalService) {
        _discussionCategoryLocalService = discussionCategoryLocalService;
    }
}
