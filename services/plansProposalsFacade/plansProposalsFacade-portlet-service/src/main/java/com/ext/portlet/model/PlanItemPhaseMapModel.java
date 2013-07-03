package com.ext.portlet.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanItemPhaseMap service. Represents a row in the &quot;xcolab_PlanItemPhaseMap&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.PlanItemPhaseMapModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.PlanItemPhaseMapImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanItemPhaseMap
 * @see com.ext.portlet.model.impl.PlanItemPhaseMapImpl
 * @see com.ext.portlet.model.impl.PlanItemPhaseMapModelImpl
 * @generated
 */
public interface PlanItemPhaseMapModel extends BaseModel<PlanItemPhaseMap> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan item phase map model instance should use the {@link PlanItemPhaseMap} interface instead.
     */

    /**
     * Returns the primary key of this plan item phase map.
     *
     * @return the primary key of this plan item phase map
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this plan item phase map.
     *
     * @param primaryKey the primary key of this plan item phase map
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the ID of this plan item phase map.
     *
     * @return the ID of this plan item phase map
     */
    public long getId();

    /**
     * Sets the ID of this plan item phase map.
     *
     * @param id the ID of this plan item phase map
     */
    public void setId(long id);

    /**
     * Returns the plan ID of this plan item phase map.
     *
     * @return the plan ID of this plan item phase map
     */
    public long getPlanId();

    /**
     * Sets the plan ID of this plan item phase map.
     *
     * @param planId the plan ID of this plan item phase map
     */
    public void setPlanId(long planId);

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

    public int compareTo(PlanItemPhaseMap planItemPhaseMap);

    public int hashCode();

    public CacheModel<PlanItemPhaseMap> toCacheModel();

    public PlanItemPhaseMap toEscapedModel();

    public String toString();

    public String toXmlString();
}
