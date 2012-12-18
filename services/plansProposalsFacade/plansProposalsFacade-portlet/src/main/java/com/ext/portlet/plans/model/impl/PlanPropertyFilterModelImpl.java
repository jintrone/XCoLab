package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanPropertyFilter;
import com.ext.portlet.plans.model.PlanPropertyFilterModel;
import com.ext.portlet.plans.model.PlanPropertyFilterSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the PlanPropertyFilter service. Represents a row in the &quot;xcolab_PlanPropertyFilter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.plans.model.PlanPropertyFilterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanPropertyFilterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanPropertyFilterImpl
 * @see com.ext.portlet.plans.model.PlanPropertyFilter
 * @see com.ext.portlet.plans.model.PlanPropertyFilterModel
 * @generated
 */
@JSON(strict = true)
public class PlanPropertyFilterModelImpl extends BaseModelImpl<PlanPropertyFilter>
    implements PlanPropertyFilterModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan property filter model instance should use the {@link com.ext.portlet.plans.model.PlanPropertyFilter} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_PlanPropertyFilter";
    public static final Object[][] TABLE_COLUMNS = {
            { "planPropertyFilterId", Types.BIGINT },
            { "propertyName", Types.VARCHAR },
            { "planUserSettingsId", Types.BIGINT },
            { "value", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_PlanPropertyFilter (planPropertyFilterId LONG not null primary key,propertyName VARCHAR(75) null,planUserSettingsId LONG,value VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_PlanPropertyFilter";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.plans.model.PlanPropertyFilter"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.plans.model.PlanPropertyFilter"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.plans.model.PlanPropertyFilter"),
            true);
    public static long PLANUSERSETTINGSID_COLUMN_BITMASK = 1L;
    public static long PROPERTYNAME_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.plans.model.PlanPropertyFilter"));
    private static ClassLoader _classLoader = PlanPropertyFilter.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            PlanPropertyFilter.class
        };
    private long _planPropertyFilterId;
    private String _propertyName;
    private String _originalPropertyName;
    private long _planUserSettingsId;
    private long _originalPlanUserSettingsId;
    private boolean _setOriginalPlanUserSettingsId;
    private String _value;
    private transient ExpandoBridge _expandoBridge;
    private long _columnBitmask;
    private PlanPropertyFilter _escapedModelProxy;

    public PlanPropertyFilterModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PlanPropertyFilter toModel(PlanPropertyFilterSoap soapModel) {
        PlanPropertyFilter model = new PlanPropertyFilterImpl();

        model.setPlanPropertyFilterId(soapModel.getPlanPropertyFilterId());
        model.setPropertyName(soapModel.getPropertyName());
        model.setPlanUserSettingsId(soapModel.getPlanUserSettingsId());
        model.setValue(soapModel.getValue());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PlanPropertyFilter> toModels(
        PlanPropertyFilterSoap[] soapModels) {
        List<PlanPropertyFilter> models = new ArrayList<PlanPropertyFilter>(soapModels.length);

        for (PlanPropertyFilterSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public long getPrimaryKey() {
        return _planPropertyFilterId;
    }

    public void setPrimaryKey(long primaryKey) {
        setPlanPropertyFilterId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_planPropertyFilterId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return PlanPropertyFilter.class;
    }

    public String getModelClassName() {
        return PlanPropertyFilter.class.getName();
    }

    @JSON
    public long getPlanPropertyFilterId() {
        return _planPropertyFilterId;
    }

    public void setPlanPropertyFilterId(long planPropertyFilterId) {
        _planPropertyFilterId = planPropertyFilterId;
    }

    @JSON
    public String getPropertyName() {
        if (_propertyName == null) {
            return StringPool.BLANK;
        } else {
            return _propertyName;
        }
    }

    public void setPropertyName(String propertyName) {
        _columnBitmask |= PROPERTYNAME_COLUMN_BITMASK;

        if (_originalPropertyName == null) {
            _originalPropertyName = _propertyName;
        }

        _propertyName = propertyName;
    }

    public String getOriginalPropertyName() {
        return GetterUtil.getString(_originalPropertyName);
    }

    @JSON
    public long getPlanUserSettingsId() {
        return _planUserSettingsId;
    }

    public void setPlanUserSettingsId(long planUserSettingsId) {
        _columnBitmask |= PLANUSERSETTINGSID_COLUMN_BITMASK;

        if (!_setOriginalPlanUserSettingsId) {
            _setOriginalPlanUserSettingsId = true;

            _originalPlanUserSettingsId = _planUserSettingsId;
        }

        _planUserSettingsId = planUserSettingsId;
    }

    public long getOriginalPlanUserSettingsId() {
        return _originalPlanUserSettingsId;
    }

    @JSON
    public String getValue() {
        if (_value == null) {
            return StringPool.BLANK;
        } else {
            return _value;
        }
    }

    public void setValue(String value) {
        _value = value;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public PlanPropertyFilter toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (PlanPropertyFilter) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        if (_expandoBridge == null) {
            _expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
                    PlanPropertyFilter.class.getName(), getPrimaryKey());
        }

        return _expandoBridge;
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        getExpandoBridge().setAttributes(serviceContext);
    }

    @Override
    public Object clone() {
        PlanPropertyFilterImpl planPropertyFilterImpl = new PlanPropertyFilterImpl();

        planPropertyFilterImpl.setPlanPropertyFilterId(getPlanPropertyFilterId());
        planPropertyFilterImpl.setPropertyName(getPropertyName());
        planPropertyFilterImpl.setPlanUserSettingsId(getPlanUserSettingsId());
        planPropertyFilterImpl.setValue(getValue());

        planPropertyFilterImpl.resetOriginalValues();

        return planPropertyFilterImpl;
    }

    public int compareTo(PlanPropertyFilter planPropertyFilter) {
        long primaryKey = planPropertyFilter.getPrimaryKey();

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

        PlanPropertyFilter planPropertyFilter = null;

        try {
            planPropertyFilter = (PlanPropertyFilter) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = planPropertyFilter.getPrimaryKey();

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
        PlanPropertyFilterModelImpl planPropertyFilterModelImpl = this;

        planPropertyFilterModelImpl._originalPropertyName = planPropertyFilterModelImpl._propertyName;

        planPropertyFilterModelImpl._originalPlanUserSettingsId = planPropertyFilterModelImpl._planUserSettingsId;

        planPropertyFilterModelImpl._setOriginalPlanUserSettingsId = false;

        planPropertyFilterModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PlanPropertyFilter> toCacheModel() {
        PlanPropertyFilterCacheModel planPropertyFilterCacheModel = new PlanPropertyFilterCacheModel();

        planPropertyFilterCacheModel.planPropertyFilterId = getPlanPropertyFilterId();

        planPropertyFilterCacheModel.propertyName = getPropertyName();

        String propertyName = planPropertyFilterCacheModel.propertyName;

        if ((propertyName != null) && (propertyName.length() == 0)) {
            planPropertyFilterCacheModel.propertyName = null;
        }

        planPropertyFilterCacheModel.planUserSettingsId = getPlanUserSettingsId();

        planPropertyFilterCacheModel.value = getValue();

        String value = planPropertyFilterCacheModel.value;

        if ((value != null) && (value.length() == 0)) {
            planPropertyFilterCacheModel.value = null;
        }

        return planPropertyFilterCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{planPropertyFilterId=");
        sb.append(getPlanPropertyFilterId());
        sb.append(", propertyName=");
        sb.append(getPropertyName());
        sb.append(", planUserSettingsId=");
        sb.append(getPlanUserSettingsId());
        sb.append(", value=");
        sb.append(getValue());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.plans.model.PlanPropertyFilter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>planPropertyFilterId</column-name><column-value><![CDATA[");
        sb.append(getPlanPropertyFilterId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>propertyName</column-name><column-value><![CDATA[");
        sb.append(getPropertyName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>planUserSettingsId</column-name><column-value><![CDATA[");
        sb.append(getPlanUserSettingsId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>value</column-name><column-value><![CDATA[");
        sb.append(getValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
