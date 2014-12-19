package com.ext.portlet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MessagingMessageConversion service. Represents a row in the &quot;xcolab_MessagingMessageConversion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.MessagingMessageConversionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.MessagingMessageConversionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessagingMessageConversion
 * @see com.ext.portlet.model.impl.MessagingMessageConversionImpl
 * @see com.ext.portlet.model.impl.MessagingMessageConversionModelImpl
 * @generated
 */
public interface MessagingMessageConversionModel extends BaseModel<MessagingMessageConversion> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a messaging message conversion model instance should use the {@link MessagingMessageConversion} interface instead.
     */

    /**
     * Returns the primary key of this messaging message conversion.
     *
     * @return the primary key of this messaging message conversion
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this messaging message conversion.
     *
     * @param primaryKey the primary key of this messaging message conversion
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the conversion ID of this messaging message conversion.
     *
     * @return the conversion ID of this messaging message conversion
     */
    public long getConversionId();

    /**
     * Sets the conversion ID of this messaging message conversion.
     *
     * @param conversionId the conversion ID of this messaging message conversion
     */
    public void setConversionId(long conversionId);

    /**
     * Returns the conversion type ID of this messaging message conversion.
     *
     * @return the conversion type ID of this messaging message conversion
     */
    public long getConversionTypeId();

    /**
     * Sets the conversion type ID of this messaging message conversion.
     *
     * @param conversionTypeId the conversion type ID of this messaging message conversion
     */
    public void setConversionTypeId(long conversionTypeId);

    /**
     * Returns the message ID of this messaging message conversion.
     *
     * @return the message ID of this messaging message conversion
     */
    public long getMessageId();

    /**
     * Sets the message ID of this messaging message conversion.
     *
     * @param messageId the message ID of this messaging message conversion
     */
    public void setMessageId(long messageId);

    /**
     * Returns the ip address of this messaging message conversion.
     *
     * @return the ip address of this messaging message conversion
     */
    @AutoEscape
    public String getIpAddress();

    /**
     * Sets the ip address of this messaging message conversion.
     *
     * @param ipAddress the ip address of this messaging message conversion
     */
    public void setIpAddress(String ipAddress);

    /**
     * Returns the extra data of this messaging message conversion.
     *
     * @return the extra data of this messaging message conversion
     */
    @AutoEscape
    public String getExtraData();

    /**
     * Sets the extra data of this messaging message conversion.
     *
     * @param extraData the extra data of this messaging message conversion
     */
    public void setExtraData(String extraData);

    /**
     * Returns the extra data2 of this messaging message conversion.
     *
     * @return the extra data2 of this messaging message conversion
     */
    @AutoEscape
    public String getExtraData2();

    /**
     * Sets the extra data2 of this messaging message conversion.
     *
     * @param extraData2 the extra data2 of this messaging message conversion
     */
    public void setExtraData2(String extraData2);

    /**
     * Returns the create date of this messaging message conversion.
     *
     * @return the create date of this messaging message conversion
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this messaging message conversion.
     *
     * @param createDate the create date of this messaging message conversion
     */
    public void setCreateDate(Date createDate);

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
    public int compareTo(MessagingMessageConversion messagingMessageConversion);

    @Override
    public int hashCode();

    @Override
    public CacheModel<MessagingMessageConversion> toCacheModel();

    @Override
    public MessagingMessageConversion toEscapedModel();

    @Override
    public MessagingMessageConversion toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
