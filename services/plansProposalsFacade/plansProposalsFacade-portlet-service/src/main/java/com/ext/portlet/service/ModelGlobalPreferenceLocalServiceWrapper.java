package com.ext.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ModelGlobalPreferenceLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ModelGlobalPreferenceLocalService
 * @generated
 */
public class ModelGlobalPreferenceLocalServiceWrapper
    implements ModelGlobalPreferenceLocalService,
        ServiceWrapper<ModelGlobalPreferenceLocalService> {
    private ModelGlobalPreferenceLocalService _modelGlobalPreferenceLocalService;

    public ModelGlobalPreferenceLocalServiceWrapper(
        ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService) {
        _modelGlobalPreferenceLocalService = modelGlobalPreferenceLocalService;
    }

    /**
    * Adds the model global preference to the database. Also notifies the appropriate model listeners.
    *
    * @param modelGlobalPreference the model global preference
    * @return the model global preference that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ModelGlobalPreference addModelGlobalPreference(
        com.ext.portlet.model.ModelGlobalPreference modelGlobalPreference)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.addModelGlobalPreference(modelGlobalPreference);
    }

    /**
    * Creates a new model global preference with the primary key. Does not add the model global preference to the database.
    *
    * @param modelGlobalPreferencePK the primary key for the new model global preference
    * @return the new model global preference
    */
    public com.ext.portlet.model.ModelGlobalPreference createModelGlobalPreference(
        long modelGlobalPreferencePK) {
        return _modelGlobalPreferenceLocalService.createModelGlobalPreference(modelGlobalPreferencePK);
    }

    /**
    * Deletes the model global preference with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param modelGlobalPreferencePK the primary key of the model global preference
    * @throws PortalException if a model global preference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteModelGlobalPreference(long modelGlobalPreferencePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.deleteModelGlobalPreference(modelGlobalPreferencePK);
    }

    /**
    * Deletes the model global preference from the database. Also notifies the appropriate model listeners.
    *
    * @param modelGlobalPreference the model global preference
    * @throws SystemException if a system exception occurred
    */
    public void deleteModelGlobalPreference(
        com.ext.portlet.model.ModelGlobalPreference modelGlobalPreference)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.deleteModelGlobalPreference(modelGlobalPreference);
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
        return _modelGlobalPreferenceLocalService.dynamicQuery(dynamicQuery);
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
        return _modelGlobalPreferenceLocalService.dynamicQuery(dynamicQuery,
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
        return _modelGlobalPreferenceLocalService.dynamicQuery(dynamicQuery,
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
        return _modelGlobalPreferenceLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.model.ModelGlobalPreference fetchModelGlobalPreference(
        long modelGlobalPreferencePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.fetchModelGlobalPreference(modelGlobalPreferencePK);
    }

    /**
    * Returns the model global preference with the primary key.
    *
    * @param modelGlobalPreferencePK the primary key of the model global preference
    * @return the model global preference
    * @throws PortalException if a model global preference with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ModelGlobalPreference getModelGlobalPreference(
        long modelGlobalPreferencePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getModelGlobalPreference(modelGlobalPreferencePK);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the model global preferences.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of model global preferences
    * @param end the upper bound of the range of model global preferences (not inclusive)
    * @return the range of model global preferences
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.ModelGlobalPreference> getModelGlobalPreferences(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getModelGlobalPreferences(start,
            end);
    }

    /**
    * Returns the number of model global preferences.
    *
    * @return the number of model global preferences
    * @throws SystemException if a system exception occurred
    */
    public int getModelGlobalPreferencesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getModelGlobalPreferencesCount();
    }

    /**
    * Updates the model global preference in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param modelGlobalPreference the model global preference
    * @return the model global preference that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ModelGlobalPreference updateModelGlobalPreference(
        com.ext.portlet.model.ModelGlobalPreference modelGlobalPreference)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.updateModelGlobalPreference(modelGlobalPreference);
    }

    /**
    * Updates the model global preference in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param modelGlobalPreference the model global preference
    * @param merge whether to merge the model global preference with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the model global preference that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ModelGlobalPreference updateModelGlobalPreference(
        com.ext.portlet.model.ModelGlobalPreference modelGlobalPreference,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.updateModelGlobalPreference(modelGlobalPreference,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _modelGlobalPreferenceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _modelGlobalPreferenceLocalService.setBeanIdentifier(beanIdentifier);
    }

    public boolean isVisible(edu.mit.cci.roma.client.Simulation s)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.isVisible(s);
    }

    public void setVisible(edu.mit.cci.roma.client.Simulation s,
        boolean visible)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.setVisible(s, visible);
    }

    public int getWeight(edu.mit.cci.roma.client.Simulation s)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getWeight(s);
    }

    public void setWeight(edu.mit.cci.roma.client.Simulation s, int weight)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.setWeight(s, weight);
    }

    public java.lang.Long getExpertEvaluationPageId(
        edu.mit.cci.roma.client.Simulation s)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getExpertEvaluationPageId(s);
    }

    public void setExpertEvaluationPageId(
        edu.mit.cci.roma.client.Simulation s, java.lang.Long pageId)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.setExpertEvaluationPageId(s, pageId);
    }

    public java.util.List<com.ext.portlet.model.ModelGlobalPreference> findByCategory(
        com.ext.portlet.model.ModelCategory category)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.findByCategory(category);
    }

    public com.ext.portlet.model.ModelCategory getCategory(
        edu.mit.cci.roma.client.Simulation sim)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _modelGlobalPreferenceLocalService.getCategory(sim);
    }

    public void updateModelCategory(com.ext.portlet.model.ModelCategory cat,
        edu.mit.cci.roma.client.Simulation sim)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreferenceLocalService.updateModelCategory(cat, sim);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public ModelGlobalPreferenceLocalService getWrappedModelGlobalPreferenceLocalService() {
        return _modelGlobalPreferenceLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedModelGlobalPreferenceLocalService(
        ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService) {
        _modelGlobalPreferenceLocalService = modelGlobalPreferenceLocalService;
    }

    public ModelGlobalPreferenceLocalService getWrappedService() {
        return _modelGlobalPreferenceLocalService;
    }

    public void setWrappedService(
        ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService) {
        _modelGlobalPreferenceLocalService = modelGlobalPreferenceLocalService;
    }
}
