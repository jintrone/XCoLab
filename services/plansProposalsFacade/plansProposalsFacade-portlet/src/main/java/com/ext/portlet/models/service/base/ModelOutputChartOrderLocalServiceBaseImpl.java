package com.ext.portlet.models.service.base;

import com.ext.portlet.models.model.ModelOutputChartOrder;
import com.ext.portlet.models.service.ModelCategoryLocalService;
import com.ext.portlet.models.service.ModelCategoryService;
import com.ext.portlet.models.service.ModelDiscussionLocalService;
import com.ext.portlet.models.service.ModelDiscussionService;
import com.ext.portlet.models.service.ModelGlobalPreferenceLocalService;
import com.ext.portlet.models.service.ModelGlobalPreferenceService;
import com.ext.portlet.models.service.ModelInputGroupLocalService;
import com.ext.portlet.models.service.ModelInputGroupService;
import com.ext.portlet.models.service.ModelInputItemLocalService;
import com.ext.portlet.models.service.ModelInputItemService;
import com.ext.portlet.models.service.ModelOutputChartOrderLocalService;
import com.ext.portlet.models.service.ModelOutputChartOrderService;
import com.ext.portlet.models.service.ModelOutputItemLocalService;
import com.ext.portlet.models.service.ModelOutputItemService;
import com.ext.portlet.models.service.ModelPositionLocalService;
import com.ext.portlet.models.service.ModelPositionService;
import com.ext.portlet.models.service.persistence.ModelCategoryPersistence;
import com.ext.portlet.models.service.persistence.ModelDiscussionPersistence;
import com.ext.portlet.models.service.persistence.ModelGlobalPreferencePersistence;
import com.ext.portlet.models.service.persistence.ModelInputGroupPersistence;
import com.ext.portlet.models.service.persistence.ModelInputItemPersistence;
import com.ext.portlet.models.service.persistence.ModelOutputChartOrderPersistence;
import com.ext.portlet.models.service.persistence.ModelOutputItemPersistence;
import com.ext.portlet.models.service.persistence.ModelPositionPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the model output chart order local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ext.portlet.models.service.impl.ModelOutputChartOrderLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.models.service.impl.ModelOutputChartOrderLocalServiceImpl
 * @see com.ext.portlet.models.service.ModelOutputChartOrderLocalServiceUtil
 * @generated
 */
public abstract class ModelOutputChartOrderLocalServiceBaseImpl
    implements ModelOutputChartOrderLocalService, IdentifiableBean {
    private static Log _log = LogFactoryUtil.getLog(ModelOutputChartOrderLocalServiceBaseImpl.class);
    @BeanReference(type = ModelCategoryLocalService.class)
    protected ModelCategoryLocalService modelCategoryLocalService;
    @BeanReference(type = ModelCategoryService.class)
    protected ModelCategoryService modelCategoryService;
    @BeanReference(type = ModelCategoryPersistence.class)
    protected ModelCategoryPersistence modelCategoryPersistence;
    @BeanReference(type = ModelDiscussionLocalService.class)
    protected ModelDiscussionLocalService modelDiscussionLocalService;
    @BeanReference(type = ModelDiscussionService.class)
    protected ModelDiscussionService modelDiscussionService;
    @BeanReference(type = ModelDiscussionPersistence.class)
    protected ModelDiscussionPersistence modelDiscussionPersistence;
    @BeanReference(type = ModelGlobalPreferenceLocalService.class)
    protected ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService;
    @BeanReference(type = ModelGlobalPreferenceService.class)
    protected ModelGlobalPreferenceService modelGlobalPreferenceService;
    @BeanReference(type = ModelGlobalPreferencePersistence.class)
    protected ModelGlobalPreferencePersistence modelGlobalPreferencePersistence;
    @BeanReference(type = ModelInputGroupLocalService.class)
    protected ModelInputGroupLocalService modelInputGroupLocalService;
    @BeanReference(type = ModelInputGroupService.class)
    protected ModelInputGroupService modelInputGroupService;
    @BeanReference(type = ModelInputGroupPersistence.class)
    protected ModelInputGroupPersistence modelInputGroupPersistence;
    @BeanReference(type = ModelInputItemLocalService.class)
    protected ModelInputItemLocalService modelInputItemLocalService;
    @BeanReference(type = ModelInputItemService.class)
    protected ModelInputItemService modelInputItemService;
    @BeanReference(type = ModelInputItemPersistence.class)
    protected ModelInputItemPersistence modelInputItemPersistence;
    @BeanReference(type = ModelOutputChartOrderLocalService.class)
    protected ModelOutputChartOrderLocalService modelOutputChartOrderLocalService;
    @BeanReference(type = ModelOutputChartOrderService.class)
    protected ModelOutputChartOrderService modelOutputChartOrderService;
    @BeanReference(type = ModelOutputChartOrderPersistence.class)
    protected ModelOutputChartOrderPersistence modelOutputChartOrderPersistence;
    @BeanReference(type = ModelOutputItemLocalService.class)
    protected ModelOutputItemLocalService modelOutputItemLocalService;
    @BeanReference(type = ModelOutputItemService.class)
    protected ModelOutputItemService modelOutputItemService;
    @BeanReference(type = ModelOutputItemPersistence.class)
    protected ModelOutputItemPersistence modelOutputItemPersistence;
    @BeanReference(type = ModelPositionLocalService.class)
    protected ModelPositionLocalService modelPositionLocalService;
    @BeanReference(type = ModelPositionService.class)
    protected ModelPositionService modelPositionService;
    @BeanReference(type = ModelPositionPersistence.class)
    protected ModelPositionPersistence modelPositionPersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.ext.portlet.models.service.ModelOutputChartOrderLocalServiceUtil} to access the model output chart order local service.
     */

    /**
     * Adds the model output chart order to the database. Also notifies the appropriate model listeners.
     *
     * @param modelOutputChartOrder the model output chart order
     * @return the model output chart order that was added
     * @throws SystemException if a system exception occurred
     */
    public ModelOutputChartOrder addModelOutputChartOrder(
        ModelOutputChartOrder modelOutputChartOrder) throws SystemException {
        modelOutputChartOrder.setNew(true);

        modelOutputChartOrder = modelOutputChartOrderPersistence.update(modelOutputChartOrder,
                false);

        Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

        if (indexer != null) {
            try {
                indexer.reindex(modelOutputChartOrder);
            } catch (SearchException se) {
                if (_log.isWarnEnabled()) {
                    _log.warn(se, se);
                }
            }
        }

        return modelOutputChartOrder;
    }

    /**
     * Creates a new model output chart order with the primary key. Does not add the model output chart order to the database.
     *
     * @param modelOutputChartOrderPK the primary key for the new model output chart order
     * @return the new model output chart order
     */
    public ModelOutputChartOrder createModelOutputChartOrder(
        long modelOutputChartOrderPK) {
        return modelOutputChartOrderPersistence.create(modelOutputChartOrderPK);
    }

    /**
     * Deletes the model output chart order with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param modelOutputChartOrderPK the primary key of the model output chart order
     * @throws PortalException if a model output chart order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public void deleteModelOutputChartOrder(long modelOutputChartOrderPK)
        throws PortalException, SystemException {
        ModelOutputChartOrder modelOutputChartOrder = modelOutputChartOrderPersistence.remove(modelOutputChartOrderPK);

        Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

        if (indexer != null) {
            try {
                indexer.delete(modelOutputChartOrder);
            } catch (SearchException se) {
                if (_log.isWarnEnabled()) {
                    _log.warn(se, se);
                }
            }
        }
    }

    /**
     * Deletes the model output chart order from the database. Also notifies the appropriate model listeners.
     *
     * @param modelOutputChartOrder the model output chart order
     * @throws SystemException if a system exception occurred
     */
    public void deleteModelOutputChartOrder(
        ModelOutputChartOrder modelOutputChartOrder) throws SystemException {
        modelOutputChartOrderPersistence.remove(modelOutputChartOrder);

        Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

        if (indexer != null) {
            try {
                indexer.delete(modelOutputChartOrder);
            } catch (SearchException se) {
                if (_log.isWarnEnabled()) {
                    _log.warn(se, se);
                }
            }
        }
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return modelOutputChartOrderPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return modelOutputChartOrderPersistence.findWithDynamicQuery(dynamicQuery,
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return modelOutputChartOrderPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return modelOutputChartOrderPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public ModelOutputChartOrder fetchModelOutputChartOrder(
        long modelOutputChartOrderPK) throws SystemException {
        return modelOutputChartOrderPersistence.fetchByPrimaryKey(modelOutputChartOrderPK);
    }

    /**
     * Returns the model output chart order with the primary key.
     *
     * @param modelOutputChartOrderPK the primary key of the model output chart order
     * @return the model output chart order
     * @throws PortalException if a model output chart order with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ModelOutputChartOrder getModelOutputChartOrder(
        long modelOutputChartOrderPK) throws PortalException, SystemException {
        return modelOutputChartOrderPersistence.findByPrimaryKey(modelOutputChartOrderPK);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return modelOutputChartOrderPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the model output chart orders.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of model output chart orders
     * @param end the upper bound of the range of model output chart orders (not inclusive)
     * @return the range of model output chart orders
     * @throws SystemException if a system exception occurred
     */
    public List<ModelOutputChartOrder> getModelOutputChartOrders(int start,
        int end) throws SystemException {
        return modelOutputChartOrderPersistence.findAll(start, end);
    }

    /**
     * Returns the number of model output chart orders.
     *
     * @return the number of model output chart orders
     * @throws SystemException if a system exception occurred
     */
    public int getModelOutputChartOrdersCount() throws SystemException {
        return modelOutputChartOrderPersistence.countAll();
    }

    /**
     * Updates the model output chart order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param modelOutputChartOrder the model output chart order
     * @return the model output chart order that was updated
     * @throws SystemException if a system exception occurred
     */
    public ModelOutputChartOrder updateModelOutputChartOrder(
        ModelOutputChartOrder modelOutputChartOrder) throws SystemException {
        return updateModelOutputChartOrder(modelOutputChartOrder, true);
    }

    /**
     * Updates the model output chart order in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param modelOutputChartOrder the model output chart order
     * @param merge whether to merge the model output chart order with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the model output chart order that was updated
     * @throws SystemException if a system exception occurred
     */
    public ModelOutputChartOrder updateModelOutputChartOrder(
        ModelOutputChartOrder modelOutputChartOrder, boolean merge)
        throws SystemException {
        modelOutputChartOrder.setNew(false);

        modelOutputChartOrder = modelOutputChartOrderPersistence.update(modelOutputChartOrder,
                merge);

        Indexer indexer = IndexerRegistryUtil.getIndexer(getModelClassName());

        if (indexer != null) {
            try {
                indexer.reindex(modelOutputChartOrder);
            } catch (SearchException se) {
                if (_log.isWarnEnabled()) {
                    _log.warn(se, se);
                }
            }
        }

        return modelOutputChartOrder;
    }

    /**
     * Returns the model category local service.
     *
     * @return the model category local service
     */
    public ModelCategoryLocalService getModelCategoryLocalService() {
        return modelCategoryLocalService;
    }

    /**
     * Sets the model category local service.
     *
     * @param modelCategoryLocalService the model category local service
     */
    public void setModelCategoryLocalService(
        ModelCategoryLocalService modelCategoryLocalService) {
        this.modelCategoryLocalService = modelCategoryLocalService;
    }

    /**
     * Returns the model category remote service.
     *
     * @return the model category remote service
     */
    public ModelCategoryService getModelCategoryService() {
        return modelCategoryService;
    }

    /**
     * Sets the model category remote service.
     *
     * @param modelCategoryService the model category remote service
     */
    public void setModelCategoryService(
        ModelCategoryService modelCategoryService) {
        this.modelCategoryService = modelCategoryService;
    }

    /**
     * Returns the model category persistence.
     *
     * @return the model category persistence
     */
    public ModelCategoryPersistence getModelCategoryPersistence() {
        return modelCategoryPersistence;
    }

    /**
     * Sets the model category persistence.
     *
     * @param modelCategoryPersistence the model category persistence
     */
    public void setModelCategoryPersistence(
        ModelCategoryPersistence modelCategoryPersistence) {
        this.modelCategoryPersistence = modelCategoryPersistence;
    }

    /**
     * Returns the model discussion local service.
     *
     * @return the model discussion local service
     */
    public ModelDiscussionLocalService getModelDiscussionLocalService() {
        return modelDiscussionLocalService;
    }

    /**
     * Sets the model discussion local service.
     *
     * @param modelDiscussionLocalService the model discussion local service
     */
    public void setModelDiscussionLocalService(
        ModelDiscussionLocalService modelDiscussionLocalService) {
        this.modelDiscussionLocalService = modelDiscussionLocalService;
    }

    /**
     * Returns the model discussion remote service.
     *
     * @return the model discussion remote service
     */
    public ModelDiscussionService getModelDiscussionService() {
        return modelDiscussionService;
    }

    /**
     * Sets the model discussion remote service.
     *
     * @param modelDiscussionService the model discussion remote service
     */
    public void setModelDiscussionService(
        ModelDiscussionService modelDiscussionService) {
        this.modelDiscussionService = modelDiscussionService;
    }

    /**
     * Returns the model discussion persistence.
     *
     * @return the model discussion persistence
     */
    public ModelDiscussionPersistence getModelDiscussionPersistence() {
        return modelDiscussionPersistence;
    }

    /**
     * Sets the model discussion persistence.
     *
     * @param modelDiscussionPersistence the model discussion persistence
     */
    public void setModelDiscussionPersistence(
        ModelDiscussionPersistence modelDiscussionPersistence) {
        this.modelDiscussionPersistence = modelDiscussionPersistence;
    }

    /**
     * Returns the model global preference local service.
     *
     * @return the model global preference local service
     */
    public ModelGlobalPreferenceLocalService getModelGlobalPreferenceLocalService() {
        return modelGlobalPreferenceLocalService;
    }

    /**
     * Sets the model global preference local service.
     *
     * @param modelGlobalPreferenceLocalService the model global preference local service
     */
    public void setModelGlobalPreferenceLocalService(
        ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService) {
        this.modelGlobalPreferenceLocalService = modelGlobalPreferenceLocalService;
    }

    /**
     * Returns the model global preference remote service.
     *
     * @return the model global preference remote service
     */
    public ModelGlobalPreferenceService getModelGlobalPreferenceService() {
        return modelGlobalPreferenceService;
    }

    /**
     * Sets the model global preference remote service.
     *
     * @param modelGlobalPreferenceService the model global preference remote service
     */
    public void setModelGlobalPreferenceService(
        ModelGlobalPreferenceService modelGlobalPreferenceService) {
        this.modelGlobalPreferenceService = modelGlobalPreferenceService;
    }

    /**
     * Returns the model global preference persistence.
     *
     * @return the model global preference persistence
     */
    public ModelGlobalPreferencePersistence getModelGlobalPreferencePersistence() {
        return modelGlobalPreferencePersistence;
    }

    /**
     * Sets the model global preference persistence.
     *
     * @param modelGlobalPreferencePersistence the model global preference persistence
     */
    public void setModelGlobalPreferencePersistence(
        ModelGlobalPreferencePersistence modelGlobalPreferencePersistence) {
        this.modelGlobalPreferencePersistence = modelGlobalPreferencePersistence;
    }

    /**
     * Returns the model input group local service.
     *
     * @return the model input group local service
     */
    public ModelInputGroupLocalService getModelInputGroupLocalService() {
        return modelInputGroupLocalService;
    }

    /**
     * Sets the model input group local service.
     *
     * @param modelInputGroupLocalService the model input group local service
     */
    public void setModelInputGroupLocalService(
        ModelInputGroupLocalService modelInputGroupLocalService) {
        this.modelInputGroupLocalService = modelInputGroupLocalService;
    }

    /**
     * Returns the model input group remote service.
     *
     * @return the model input group remote service
     */
    public ModelInputGroupService getModelInputGroupService() {
        return modelInputGroupService;
    }

    /**
     * Sets the model input group remote service.
     *
     * @param modelInputGroupService the model input group remote service
     */
    public void setModelInputGroupService(
        ModelInputGroupService modelInputGroupService) {
        this.modelInputGroupService = modelInputGroupService;
    }

    /**
     * Returns the model input group persistence.
     *
     * @return the model input group persistence
     */
    public ModelInputGroupPersistence getModelInputGroupPersistence() {
        return modelInputGroupPersistence;
    }

    /**
     * Sets the model input group persistence.
     *
     * @param modelInputGroupPersistence the model input group persistence
     */
    public void setModelInputGroupPersistence(
        ModelInputGroupPersistence modelInputGroupPersistence) {
        this.modelInputGroupPersistence = modelInputGroupPersistence;
    }

    /**
     * Returns the model input item local service.
     *
     * @return the model input item local service
     */
    public ModelInputItemLocalService getModelInputItemLocalService() {
        return modelInputItemLocalService;
    }

    /**
     * Sets the model input item local service.
     *
     * @param modelInputItemLocalService the model input item local service
     */
    public void setModelInputItemLocalService(
        ModelInputItemLocalService modelInputItemLocalService) {
        this.modelInputItemLocalService = modelInputItemLocalService;
    }

    /**
     * Returns the model input item remote service.
     *
     * @return the model input item remote service
     */
    public ModelInputItemService getModelInputItemService() {
        return modelInputItemService;
    }

    /**
     * Sets the model input item remote service.
     *
     * @param modelInputItemService the model input item remote service
     */
    public void setModelInputItemService(
        ModelInputItemService modelInputItemService) {
        this.modelInputItemService = modelInputItemService;
    }

    /**
     * Returns the model input item persistence.
     *
     * @return the model input item persistence
     */
    public ModelInputItemPersistence getModelInputItemPersistence() {
        return modelInputItemPersistence;
    }

    /**
     * Sets the model input item persistence.
     *
     * @param modelInputItemPersistence the model input item persistence
     */
    public void setModelInputItemPersistence(
        ModelInputItemPersistence modelInputItemPersistence) {
        this.modelInputItemPersistence = modelInputItemPersistence;
    }

    /**
     * Returns the model output chart order local service.
     *
     * @return the model output chart order local service
     */
    public ModelOutputChartOrderLocalService getModelOutputChartOrderLocalService() {
        return modelOutputChartOrderLocalService;
    }

    /**
     * Sets the model output chart order local service.
     *
     * @param modelOutputChartOrderLocalService the model output chart order local service
     */
    public void setModelOutputChartOrderLocalService(
        ModelOutputChartOrderLocalService modelOutputChartOrderLocalService) {
        this.modelOutputChartOrderLocalService = modelOutputChartOrderLocalService;
    }

    /**
     * Returns the model output chart order remote service.
     *
     * @return the model output chart order remote service
     */
    public ModelOutputChartOrderService getModelOutputChartOrderService() {
        return modelOutputChartOrderService;
    }

    /**
     * Sets the model output chart order remote service.
     *
     * @param modelOutputChartOrderService the model output chart order remote service
     */
    public void setModelOutputChartOrderService(
        ModelOutputChartOrderService modelOutputChartOrderService) {
        this.modelOutputChartOrderService = modelOutputChartOrderService;
    }

    /**
     * Returns the model output chart order persistence.
     *
     * @return the model output chart order persistence
     */
    public ModelOutputChartOrderPersistence getModelOutputChartOrderPersistence() {
        return modelOutputChartOrderPersistence;
    }

    /**
     * Sets the model output chart order persistence.
     *
     * @param modelOutputChartOrderPersistence the model output chart order persistence
     */
    public void setModelOutputChartOrderPersistence(
        ModelOutputChartOrderPersistence modelOutputChartOrderPersistence) {
        this.modelOutputChartOrderPersistence = modelOutputChartOrderPersistence;
    }

    /**
     * Returns the model output item local service.
     *
     * @return the model output item local service
     */
    public ModelOutputItemLocalService getModelOutputItemLocalService() {
        return modelOutputItemLocalService;
    }

    /**
     * Sets the model output item local service.
     *
     * @param modelOutputItemLocalService the model output item local service
     */
    public void setModelOutputItemLocalService(
        ModelOutputItemLocalService modelOutputItemLocalService) {
        this.modelOutputItemLocalService = modelOutputItemLocalService;
    }

    /**
     * Returns the model output item remote service.
     *
     * @return the model output item remote service
     */
    public ModelOutputItemService getModelOutputItemService() {
        return modelOutputItemService;
    }

    /**
     * Sets the model output item remote service.
     *
     * @param modelOutputItemService the model output item remote service
     */
    public void setModelOutputItemService(
        ModelOutputItemService modelOutputItemService) {
        this.modelOutputItemService = modelOutputItemService;
    }

    /**
     * Returns the model output item persistence.
     *
     * @return the model output item persistence
     */
    public ModelOutputItemPersistence getModelOutputItemPersistence() {
        return modelOutputItemPersistence;
    }

    /**
     * Sets the model output item persistence.
     *
     * @param modelOutputItemPersistence the model output item persistence
     */
    public void setModelOutputItemPersistence(
        ModelOutputItemPersistence modelOutputItemPersistence) {
        this.modelOutputItemPersistence = modelOutputItemPersistence;
    }

    /**
     * Returns the model position local service.
     *
     * @return the model position local service
     */
    public ModelPositionLocalService getModelPositionLocalService() {
        return modelPositionLocalService;
    }

    /**
     * Sets the model position local service.
     *
     * @param modelPositionLocalService the model position local service
     */
    public void setModelPositionLocalService(
        ModelPositionLocalService modelPositionLocalService) {
        this.modelPositionLocalService = modelPositionLocalService;
    }

    /**
     * Returns the model position remote service.
     *
     * @return the model position remote service
     */
    public ModelPositionService getModelPositionService() {
        return modelPositionService;
    }

    /**
     * Sets the model position remote service.
     *
     * @param modelPositionService the model position remote service
     */
    public void setModelPositionService(
        ModelPositionService modelPositionService) {
        this.modelPositionService = modelPositionService;
    }

    /**
     * Returns the model position persistence.
     *
     * @return the model position persistence
     */
    public ModelPositionPersistence getModelPositionPersistence() {
        return modelPositionPersistence;
    }

    /**
     * Sets the model position persistence.
     *
     * @param modelPositionPersistence the model position persistence
     */
    public void setModelPositionPersistence(
        ModelPositionPersistence modelPositionPersistence) {
        this.modelPositionPersistence = modelPositionPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        PersistedModelLocalServiceRegistryUtil.register("com.ext.portlet.models.model.ModelOutputChartOrder",
            modelOutputChartOrderLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.ext.portlet.models.model.ModelOutputChartOrder");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    protected Class<?> getModelClass() {
        return ModelOutputChartOrder.class;
    }

    protected String getModelClassName() {
        return ModelOutputChartOrder.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = modelOutputChartOrderPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
