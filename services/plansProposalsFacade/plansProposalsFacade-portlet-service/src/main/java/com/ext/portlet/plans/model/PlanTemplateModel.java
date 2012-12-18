package com.ext.portlet.plans.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanTemplate service. Represents a row in the &quot;xcolab_PlanTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.plans.model.impl.PlanTemplateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.plans.model.impl.PlanTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplate
 * @see com.ext.portlet.plans.model.impl.PlanTemplateImpl
 * @see com.ext.portlet.plans.model.impl.PlanTemplateModelImpl
 * @generated
 */
public interface PlanTemplateModel extends BaseModel<PlanTemplate> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan template model instance should use the {@link PlanTemplate} interface instead.
     */

    /**
     * Returns the primary key of this plan template.
     *
     * @return the primary key of this plan template
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this plan template.
     *
     * @param primaryKey the primary key of this plan template
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this plan template.
     *
     * @return the ID of this plan template
     */
    public long getId();

    /**
     * Sets the ID of this plan template.
     *
     * @param id the ID of this plan template
     */
    public void setId(long id);

    /**
     * Returns the name of this plan template.
     *
     * @return the name of this plan template
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this plan template.
     *
     * @param name the name of this plan template
     */
    public void setName(String name);

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

    public int compareTo(PlanTemplate planTemplate);

    public int hashCode();

    public CacheModel<PlanTemplate> toCacheModel();

    public PlanTemplate toEscapedModel();

    public String toString();

    public String toXmlString();
}
