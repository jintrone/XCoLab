package com.ext.portlet.models.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ModelOutputChartOrder service. Represents a row in the &quot;xcolab_ModelOutputChartOrder&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.models.model.impl.ModelOutputChartOrderModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.models.model.impl.ModelOutputChartOrderImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelOutputChartOrder
 * @see com.ext.portlet.models.model.impl.ModelOutputChartOrderImpl
 * @see com.ext.portlet.models.model.impl.ModelOutputChartOrderModelImpl
 * @generated
 */
public interface ModelOutputChartOrderModel extends BaseModel<ModelOutputChartOrder> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a model output chart order model instance should use the {@link ModelOutputChartOrder} interface instead.
     */

    /**
     * Returns the primary key of this model output chart order.
     *
     * @return the primary key of this model output chart order
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this model output chart order.
     *
     * @param primaryKey the primary key of this model output chart order
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the model output chart order p k of this model output chart order.
     *
     * @return the model output chart order p k of this model output chart order
     */
    public long getModelOutputChartOrderPK();

    /**
     * Sets the model output chart order p k of this model output chart order.
     *
     * @param modelOutputChartOrderPK the model output chart order p k of this model output chart order
     */
    public void setModelOutputChartOrderPK(long modelOutputChartOrderPK);

    /**
     * Returns the model ID of this model output chart order.
     *
     * @return the model ID of this model output chart order
     */
    public long getModelId();

    /**
     * Sets the model ID of this model output chart order.
     *
     * @param modelId the model ID of this model output chart order
     */
    public void setModelId(long modelId);

    /**
     * Returns the model output label of this model output chart order.
     *
     * @return the model output label of this model output chart order
     */
    @AutoEscape
    public String getModelOutputLabel();

    /**
     * Sets the model output label of this model output chart order.
     *
     * @param modelOutputLabel the model output label of this model output chart order
     */
    public void setModelOutputLabel(String modelOutputLabel);

    /**
     * Returns the model output chart order of this model output chart order.
     *
     * @return the model output chart order of this model output chart order
     */
    public int getModelOutputChartOrder();

    /**
     * Sets the model output chart order of this model output chart order.
     *
     * @param modelOutputChartOrder the model output chart order of this model output chart order
     */
    public void setModelOutputChartOrder(int modelOutputChartOrder);

    /**
     * Returns the model index range policy of this model output chart order.
     *
     * @return the model index range policy of this model output chart order
     */
    @AutoEscape
    public String getModelIndexRangePolicy();

    /**
     * Sets the model index range policy of this model output chart order.
     *
     * @param modelIndexRangePolicy the model index range policy of this model output chart order
     */
    public void setModelIndexRangePolicy(String modelIndexRangePolicy);

    /**
     * Returns the model index range message of this model output chart order.
     *
     * @return the model index range message of this model output chart order
     */
    @AutoEscape
    public String getModelIndexRangeMessage();

    /**
     * Sets the model index range message of this model output chart order.
     *
     * @param modelIndexRangeMessage the model index range message of this model output chart order
     */
    public void setModelIndexRangeMessage(String modelIndexRangeMessage);

    /**
     * Returns the model index error policy of this model output chart order.
     *
     * @return the model index error policy of this model output chart order
     */
    @AutoEscape
    public String getModelIndexErrorPolicy();

    /**
     * Sets the model index error policy of this model output chart order.
     *
     * @param modelIndexErrorPolicy the model index error policy of this model output chart order
     */
    public void setModelIndexErrorPolicy(String modelIndexErrorPolicy);

    /**
     * Returns the model index error message of this model output chart order.
     *
     * @return the model index error message of this model output chart order
     */
    @AutoEscape
    public String getModelIndexErrorMessage();

    /**
     * Sets the model index error message of this model output chart order.
     *
     * @param modelIndexErrorMessage the model index error message of this model output chart order
     */
    public void setModelIndexErrorMessage(String modelIndexErrorMessage);

    /**
     * Returns the model chart is visible of this model output chart order.
     *
     * @return the model chart is visible of this model output chart order
     */
    public boolean getModelChartIsVisible();

    /**
     * Returns <code>true</code> if this model output chart order is model chart is visible.
     *
     * @return <code>true</code> if this model output chart order is model chart is visible; <code>false</code> otherwise
     */
    public boolean isModelChartIsVisible();

    /**
     * Sets whether this model output chart order is model chart is visible.
     *
     * @param modelChartIsVisible the model chart is visible of this model output chart order
     */
    public void setModelChartIsVisible(boolean modelChartIsVisible);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(ModelOutputChartOrder modelOutputChartOrder);

    public int hashCode();

    public CacheModel<ModelOutputChartOrder> toCacheModel();

    public ModelOutputChartOrder toEscapedModel();

    public String toString();

    public String toXmlString();
}
