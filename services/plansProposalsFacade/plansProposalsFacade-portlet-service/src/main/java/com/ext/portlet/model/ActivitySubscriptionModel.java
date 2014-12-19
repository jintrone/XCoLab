package com.ext.portlet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.AttachedModel;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ActivitySubscription service. Represents a row in the &quot;xcolab_ActivitySubscription&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.ActivitySubscriptionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ActivitySubscription
 * @see com.ext.portlet.model.impl.ActivitySubscriptionImpl
 * @see com.ext.portlet.model.impl.ActivitySubscriptionModelImpl
 * @generated
 */
public interface ActivitySubscriptionModel extends AttachedModel,
    BaseModel<ActivitySubscription> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a activity subscription model instance should use the {@link ActivitySubscription} interface instead.
     */

    /**
     * Returns the primary key of this activity subscription.
     *
     * @return the primary key of this activity subscription
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this activity subscription.
     *
     * @param primaryKey the primary key of this activity subscription
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the pk of this activity subscription.
     *
     * @return the pk of this activity subscription
     */
    public long getPk();

    /**
     * Sets the pk of this activity subscription.
     *
     * @param pk the pk of this activity subscription
     */
    public void setPk(long pk);

    /**
     * Returns the fully qualified class name of this activity subscription.
     *
     * @return the fully qualified class name of this activity subscription
     */
    @Override
    public String getClassName();

    public void setClassName(String className);

    /**
     * Returns the class name ID of this activity subscription.
     *
     * @return the class name ID of this activity subscription
     */
    @Override
    public long getClassNameId();

    /**
     * Sets the class name ID of this activity subscription.
     *
     * @param classNameId the class name ID of this activity subscription
     */
    @Override
    public void setClassNameId(long classNameId);

    /**
     * Returns the class p k of this activity subscription.
     *
     * @return the class p k of this activity subscription
     */
    @Override
    public long getClassPK();

    /**
     * Sets the class p k of this activity subscription.
     *
     * @param classPK the class p k of this activity subscription
     */
    @Override
    public void setClassPK(long classPK);

    /**
     * Returns the type of this activity subscription.
     *
     * @return the type of this activity subscription
     */
    public int getType();

    /**
     * Sets the type of this activity subscription.
     *
     * @param type the type of this activity subscription
     */
    public void setType(int type);

    /**
     * Returns the automatic subscription counter of this activity subscription.
     *
     * @return the automatic subscription counter of this activity subscription
     */
    public int getAutomaticSubscriptionCounter();

    /**
     * Sets the automatic subscription counter of this activity subscription.
     *
     * @param automaticSubscriptionCounter the automatic subscription counter of this activity subscription
     */
    public void setAutomaticSubscriptionCounter(
        int automaticSubscriptionCounter);

    /**
     * Returns the extra data of this activity subscription.
     *
     * @return the extra data of this activity subscription
     */
    @AutoEscape
    public String getExtraData();

    /**
     * Sets the extra data of this activity subscription.
     *
     * @param extraData the extra data of this activity subscription
     */
    public void setExtraData(String extraData);

    /**
     * Returns the receiver ID of this activity subscription.
     *
     * @return the receiver ID of this activity subscription
     */
    public long getReceiverId();

    /**
     * Sets the receiver ID of this activity subscription.
     *
     * @param receiverId the receiver ID of this activity subscription
     */
    public void setReceiverId(long receiverId);

    /**
     * Returns the create date of this activity subscription.
     *
     * @return the create date of this activity subscription
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this activity subscription.
     *
     * @param createDate the create date of this activity subscription
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this activity subscription.
     *
     * @return the modified date of this activity subscription
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this activity subscription.
     *
     * @param modifiedDate the modified date of this activity subscription
     */
    public void setModifiedDate(Date modifiedDate);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ActivitySubscription activitySubscription);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ActivitySubscription> toCacheModel();

    @Override
    public ActivitySubscription toEscapedModel();

    @Override
    public ActivitySubscription toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
