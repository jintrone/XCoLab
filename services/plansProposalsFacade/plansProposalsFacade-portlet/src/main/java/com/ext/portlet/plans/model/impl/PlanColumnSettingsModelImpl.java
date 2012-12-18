package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanColumnSettings;
import com.ext.portlet.plans.model.PlanColumnSettingsModel;
import com.ext.portlet.plans.model.PlanColumnSettingsSoap;

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
 * The base model implementation for the PlanColumnSettings service. Represents a row in the &quot;xcolab_PlanColumnSettings&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.plans.model.PlanColumnSettingsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanColumnSettingsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanColumnSettingsImpl
 * @see com.ext.portlet.plans.model.PlanColumnSettings
 * @see com.ext.portlet.plans.model.PlanColumnSettingsModel
 * @generated
 */
@JSON(strict = true)
public class PlanColumnSettingsModelImpl extends BaseModelImpl<PlanColumnSettings>
    implements PlanColumnSettingsModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan column settings model instance should use the {@link com.ext.portlet.plans.model.PlanColumnSettings} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_PlanColumnSettings";
    public static final Object[][] TABLE_COLUMNS = {
            { "planColumnSettingsId", Types.BIGINT },
            { "columnName", Types.VARCHAR },
            { "planUserSettingsId", Types.BIGINT },
            { "visible", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_PlanColumnSettings (planColumnSettingsId LONG not null primary key,columnName VARCHAR(75) null,planUserSettingsId LONG,visible BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_PlanColumnSettings";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.plans.model.PlanColumnSettings"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.plans.model.PlanColumnSettings"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.plans.model.PlanColumnSettings"),
            true);
    public static long COLUMNNAME_COLUMN_BITMASK = 1L;
    public static long PLANUSERSETTINGSID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.plans.model.PlanColumnSettings"));
    private static ClassLoader _classLoader = PlanColumnSettings.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            PlanColumnSettings.class
        };
    private long _planColumnSettingsId;
    private String _columnName;
    private String _originalColumnName;
    private long _planUserSettingsId;
    private long _originalPlanUserSettingsId;
    private boolean _setOriginalPlanUserSettingsId;
    private boolean _visible;
    private transient ExpandoBridge _expandoBridge;
    private long _columnBitmask;
    private PlanColumnSettings _escapedModelProxy;

    public PlanColumnSettingsModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PlanColumnSettings toModel(PlanColumnSettingsSoap soapModel) {
        PlanColumnSettings model = new PlanColumnSettingsImpl();

        model.setPlanColumnSettingsId(soapModel.getPlanColumnSettingsId());
        model.setColumnName(soapModel.getColumnName());
        model.setPlanUserSettingsId(soapModel.getPlanUserSettingsId());
        model.setVisible(soapModel.getVisible());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PlanColumnSettings> toModels(
        PlanColumnSettingsSoap[] soapModels) {
        List<PlanColumnSettings> models = new ArrayList<PlanColumnSettings>(soapModels.length);

        for (PlanColumnSettingsSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public long getPrimaryKey() {
        return _planColumnSettingsId;
    }

    public void setPrimaryKey(long primaryKey) {
        setPlanColumnSettingsId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_planColumnSettingsId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return PlanColumnSettings.class;
    }

    public String getModelClassName() {
        return PlanColumnSettings.class.getName();
    }

    @JSON
    public long getPlanColumnSettingsId() {
        return _planColumnSettingsId;
    }

    public void setPlanColumnSettingsId(long planColumnSettingsId) {
        _planColumnSettingsId = planColumnSettingsId;
    }

    @JSON
    public String getColumnName() {
        if (_columnName == null) {
            return StringPool.BLANK;
        } else {
            return _columnName;
        }
    }

    public void setColumnName(String columnName) {
        _columnBitmask |= COLUMNNAME_COLUMN_BITMASK;

        if (_originalColumnName == null) {
            _originalColumnName = _columnName;
        }

        _columnName = columnName;
    }

    public String getOriginalColumnName() {
        return GetterUtil.getString(_originalColumnName);
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
    public boolean getVisible() {
        return _visible;
    }

    public boolean isVisible() {
        return _visible;
    }

    public void setVisible(boolean visible) {
        _visible = visible;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public PlanColumnSettings toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (PlanColumnSettings) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        if (_expandoBridge == null) {
            _expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
                    PlanColumnSettings.class.getName(), getPrimaryKey());
        }

        return _expandoBridge;
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        getExpandoBridge().setAttributes(serviceContext);
    }

    @Override
    public Object clone() {
        PlanColumnSettingsImpl planColumnSettingsImpl = new PlanColumnSettingsImpl();

        planColumnSettingsImpl.setPlanColumnSettingsId(getPlanColumnSettingsId());
        planColumnSettingsImpl.setColumnName(getColumnName());
        planColumnSettingsImpl.setPlanUserSettingsId(getPlanUserSettingsId());
        planColumnSettingsImpl.setVisible(getVisible());

        planColumnSettingsImpl.resetOriginalValues();

        return planColumnSettingsImpl;
    }

    public int compareTo(PlanColumnSettings planColumnSettings) {
        long primaryKey = planColumnSettings.getPrimaryKey();

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

        PlanColumnSettings planColumnSettings = null;

        try {
            planColumnSettings = (PlanColumnSettings) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = planColumnSettings.getPrimaryKey();

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
        PlanColumnSettingsModelImpl planColumnSettingsModelImpl = this;

        planColumnSettingsModelImpl._originalColumnName = planColumnSettingsModelImpl._columnName;

        planColumnSettingsModelImpl._originalPlanUserSettingsId = planColumnSettingsModelImpl._planUserSettingsId;

        planColumnSettingsModelImpl._setOriginalPlanUserSettingsId = false;

        planColumnSettingsModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PlanColumnSettings> toCacheModel() {
        PlanColumnSettingsCacheModel planColumnSettingsCacheModel = new PlanColumnSettingsCacheModel();

        planColumnSettingsCacheModel.planColumnSettingsId = getPlanColumnSettingsId();

        planColumnSettingsCacheModel.columnName = getColumnName();

        String columnName = planColumnSettingsCacheModel.columnName;

        if ((columnName != null) && (columnName.length() == 0)) {
            planColumnSettingsCacheModel.columnName = null;
        }

        planColumnSettingsCacheModel.planUserSettingsId = getPlanUserSettingsId();

        planColumnSettingsCacheModel.visible = getVisible();

        return planColumnSettingsCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{planColumnSettingsId=");
        sb.append(getPlanColumnSettingsId());
        sb.append(", columnName=");
        sb.append(getColumnName());
        sb.append(", planUserSettingsId=");
        sb.append(getPlanUserSettingsId());
        sb.append(", visible=");
        sb.append(getVisible());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.plans.model.PlanColumnSettings");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>planColumnSettingsId</column-name><column-value><![CDATA[");
        sb.append(getPlanColumnSettingsId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>columnName</column-name><column-value><![CDATA[");
        sb.append(getColumnName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>planUserSettingsId</column-name><column-value><![CDATA[");
        sb.append(getPlanUserSettingsId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visible</column-name><column-value><![CDATA[");
        sb.append(getVisible());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
