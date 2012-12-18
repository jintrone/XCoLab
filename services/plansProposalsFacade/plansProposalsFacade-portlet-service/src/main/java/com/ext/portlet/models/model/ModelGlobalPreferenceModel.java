package com.ext.portlet.models.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ModelGlobalPreference service. Represents a row in the &quot;xcolab_ModelGlobalPreference&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.models.model.impl.ModelGlobalPreferenceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.models.model.impl.ModelGlobalPreferenceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelGlobalPreference
 * @see com.ext.portlet.models.model.impl.ModelGlobalPreferenceImpl
 * @see com.ext.portlet.models.model.impl.ModelGlobalPreferenceModelImpl
 * @generated
 */
public interface ModelGlobalPreferenceModel extends BaseModel<ModelGlobalPreference> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a model global preference model instance should use the {@link ModelGlobalPreference} interface instead.
     */

    /**
     * Returns the primary key of this model global preference.
     *
     * @return the primary key of this model global preference
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this model global preference.
     *
     * @param primaryKey the primary key of this model global preference
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the model global preference p k of this model global preference.
     *
     * @return the model global preference p k of this model global preference
     */
    public long getModelGlobalPreferencePK();

    /**
     * Sets the model global preference p k of this model global preference.
     *
     * @param modelGlobalPreferencePK the model global preference p k of this model global preference
     */
    public void setModelGlobalPreferencePK(long modelGlobalPreferencePK);

    /**
     * Returns the model ID of this model global preference.
     *
     * @return the model ID of this model global preference
     */
    public long getModelId();

    /**
     * Sets the model ID of this model global preference.
     *
     * @param modelId the model ID of this model global preference
     */
    public void setModelId(long modelId);

    /**
     * Returns the visible of this model global preference.
     *
     * @return the visible of this model global preference
     */
    public boolean getVisible();

    /**
     * Returns <code>true</code> if this model global preference is visible.
     *
     * @return <code>true</code> if this model global preference is visible; <code>false</code> otherwise
     */
    public boolean isVisible();

    /**
     * Sets whether this model global preference is visible.
     *
     * @param visible the visible of this model global preference
     */
    public void setVisible(boolean visible);

    /**
     * Returns the weight of this model global preference.
     *
     * @return the weight of this model global preference
     */
    public int getWeight();

    /**
     * Sets the weight of this model global preference.
     *
     * @param weight the weight of this model global preference
     */
    public void setWeight(int weight);

    /**
     * Returns the expert evaluation page ID of this model global preference.
     *
     * @return the expert evaluation page ID of this model global preference
     */
    public long getExpertEvaluationPageId();

    /**
     * Sets the expert evaluation page ID of this model global preference.
     *
     * @param expertEvaluationPageId the expert evaluation page ID of this model global preference
     */
    public void setExpertEvaluationPageId(long expertEvaluationPageId);

    /**
     * Returns the model category ID of this model global preference.
     *
     * @return the model category ID of this model global preference
     */
    public long getModelCategoryId();

    /**
     * Sets the model category ID of this model global preference.
     *
     * @param modelCategoryId the model category ID of this model global preference
     */
    public void setModelCategoryId(long modelCategoryId);

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

    public int compareTo(ModelGlobalPreference modelGlobalPreference);

    public int hashCode();

    public CacheModel<ModelGlobalPreference> toCacheModel();

    public ModelGlobalPreference toEscapedModel();

    public String toString();

    public String toXmlString();
}
