package com.ext.portlet.discussions.model.impl;

import com.ext.portlet.discussions.model.DiscussionMessageFlag;
import com.ext.portlet.discussions.model.DiscussionMessageFlagModel;
import com.ext.portlet.discussions.model.DiscussionMessageFlagSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the DiscussionMessageFlag service. Represents a row in the &quot;xcolab_DiscussionMessageFlag&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.discussions.model.DiscussionMessageFlagModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiscussionMessageFlagImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionMessageFlagImpl
 * @see com.ext.portlet.discussions.model.DiscussionMessageFlag
 * @see com.ext.portlet.discussions.model.DiscussionMessageFlagModel
 * @generated
 */
@JSON(strict = true)
public class DiscussionMessageFlagModelImpl extends BaseModelImpl<DiscussionMessageFlag>
    implements DiscussionMessageFlagModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a discussion message flag model instance should use the {@link com.ext.portlet.discussions.model.DiscussionMessageFlag} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_DiscussionMessageFlag";
    public static final Object[][] TABLE_COLUMNS = {
            { "pk", Types.BIGINT },
            { "messageId", Types.BIGINT },
            { "flagType", Types.VARCHAR },
            { "data_", Types.VARCHAR },
            { "created", Types.TIMESTAMP },
            { "userId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_DiscussionMessageFlag (pk LONG not null primary key,messageId LONG,flagType VARCHAR(75) null,data_ VARCHAR(75) null,created DATE null,userId LONG)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_DiscussionMessageFlag";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.discussions.model.DiscussionMessageFlag"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.discussions.model.DiscussionMessageFlag"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.discussions.model.DiscussionMessageFlag"),
            true);
    public static long MESSAGEID_COLUMN_BITMASK = 1L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.discussions.model.DiscussionMessageFlag"));
    private static ClassLoader _classLoader = DiscussionMessageFlag.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            DiscussionMessageFlag.class
        };
    private long _pk;
    private long _messageId;
    private long _originalMessageId;
    private boolean _setOriginalMessageId;
    private String _flagType;
    private String _data;
    private Date _created;
    private long _userId;
    private String _userUuid;
    private transient ExpandoBridge _expandoBridge;
    private long _columnBitmask;
    private DiscussionMessageFlag _escapedModelProxy;

    public DiscussionMessageFlagModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static DiscussionMessageFlag toModel(
        DiscussionMessageFlagSoap soapModel) {
        DiscussionMessageFlag model = new DiscussionMessageFlagImpl();

        model.setPk(soapModel.getPk());
        model.setMessageId(soapModel.getMessageId());
        model.setFlagType(soapModel.getFlagType());
        model.setData(soapModel.getData());
        model.setCreated(soapModel.getCreated());
        model.setUserId(soapModel.getUserId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<DiscussionMessageFlag> toModels(
        DiscussionMessageFlagSoap[] soapModels) {
        List<DiscussionMessageFlag> models = new ArrayList<DiscussionMessageFlag>(soapModels.length);

        for (DiscussionMessageFlagSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public long getPrimaryKey() {
        return _pk;
    }

    public void setPrimaryKey(long primaryKey) {
        setPk(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_pk);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return DiscussionMessageFlag.class;
    }

    public String getModelClassName() {
        return DiscussionMessageFlag.class.getName();
    }

    @JSON
    public long getPk() {
        return _pk;
    }

    public void setPk(long pk) {
        _pk = pk;
    }

    @JSON
    public long getMessageId() {
        return _messageId;
    }

    public void setMessageId(long messageId) {
        _columnBitmask |= MESSAGEID_COLUMN_BITMASK;

        if (!_setOriginalMessageId) {
            _setOriginalMessageId = true;

            _originalMessageId = _messageId;
        }

        _messageId = messageId;
    }

    public long getOriginalMessageId() {
        return _originalMessageId;
    }

    @JSON
    public String getFlagType() {
        if (_flagType == null) {
            return StringPool.BLANK;
        } else {
            return _flagType;
        }
    }

    public void setFlagType(String flagType) {
        _flagType = flagType;
    }

    @JSON
    public String getData() {
        if (_data == null) {
            return StringPool.BLANK;
        } else {
            return _data;
        }
    }

    public void setData(String data) {
        _data = data;
    }

    @JSON
    public Date getCreated() {
        return _created;
    }

    public void setCreated(Date created) {
        _created = created;
    }

    @JSON
    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public DiscussionMessageFlag toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (DiscussionMessageFlag) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        if (_expandoBridge == null) {
            _expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
                    DiscussionMessageFlag.class.getName(), getPrimaryKey());
        }

        return _expandoBridge;
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        getExpandoBridge().setAttributes(serviceContext);
    }

    @Override
    public Object clone() {
        DiscussionMessageFlagImpl discussionMessageFlagImpl = new DiscussionMessageFlagImpl();

        discussionMessageFlagImpl.setPk(getPk());
        discussionMessageFlagImpl.setMessageId(getMessageId());
        discussionMessageFlagImpl.setFlagType(getFlagType());
        discussionMessageFlagImpl.setData(getData());
        discussionMessageFlagImpl.setCreated(getCreated());
        discussionMessageFlagImpl.setUserId(getUserId());

        discussionMessageFlagImpl.resetOriginalValues();

        return discussionMessageFlagImpl;
    }

    public int compareTo(DiscussionMessageFlag discussionMessageFlag) {
        long primaryKey = discussionMessageFlag.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        DiscussionMessageFlag discussionMessageFlag = null;

        try {
            discussionMessageFlag = (DiscussionMessageFlag) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = discussionMessageFlag.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        DiscussionMessageFlagModelImpl discussionMessageFlagModelImpl = this;

        discussionMessageFlagModelImpl._originalMessageId = discussionMessageFlagModelImpl._messageId;

        discussionMessageFlagModelImpl._setOriginalMessageId = false;

        discussionMessageFlagModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<DiscussionMessageFlag> toCacheModel() {
        DiscussionMessageFlagCacheModel discussionMessageFlagCacheModel = new DiscussionMessageFlagCacheModel();

        discussionMessageFlagCacheModel.pk = getPk();

        discussionMessageFlagCacheModel.messageId = getMessageId();

        discussionMessageFlagCacheModel.flagType = getFlagType();

        String flagType = discussionMessageFlagCacheModel.flagType;

        if ((flagType != null) && (flagType.length() == 0)) {
            discussionMessageFlagCacheModel.flagType = null;
        }

        discussionMessageFlagCacheModel.data = getData();

        String data = discussionMessageFlagCacheModel.data;

        if ((data != null) && (data.length() == 0)) {
            discussionMessageFlagCacheModel.data = null;
        }

        Date created = getCreated();

        if (created != null) {
            discussionMessageFlagCacheModel.created = created.getTime();
        } else {
            discussionMessageFlagCacheModel.created = Long.MIN_VALUE;
        }

        discussionMessageFlagCacheModel.userId = getUserId();

        return discussionMessageFlagCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{pk=");
        sb.append(getPk());
        sb.append(", messageId=");
        sb.append(getMessageId());
        sb.append(", flagType=");
        sb.append(getFlagType());
        sb.append(", data=");
        sb.append(getData());
        sb.append(", created=");
        sb.append(getCreated());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.discussions.model.DiscussionMessageFlag");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>pk</column-name><column-value><![CDATA[");
        sb.append(getPk());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messageId</column-name><column-value><![CDATA[");
        sb.append(getMessageId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>flagType</column-name><column-value><![CDATA[");
        sb.append(getFlagType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>data</column-name><column-value><![CDATA[");
        sb.append(getData());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>created</column-name><column-value><![CDATA[");
        sb.append(getCreated());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
