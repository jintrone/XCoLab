package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlansFilterPosition;
import com.ext.portlet.plans.model.PlansFilterPositionModel;
import com.ext.portlet.plans.model.PlansFilterPositionSoap;
import com.ext.portlet.plans.service.persistence.PlansFilterPositionPK;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the PlansFilterPosition service. Represents a row in the &quot;xcolab_PlansFilterPosition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.plans.model.PlansFilterPositionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlansFilterPositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlansFilterPositionImpl
 * @see com.ext.portlet.plans.model.PlansFilterPosition
 * @see com.ext.portlet.plans.model.PlansFilterPositionModel
 * @generated
 */
@JSON(strict = true)
public class PlansFilterPositionModelImpl extends BaseModelImpl<PlansFilterPosition>
    implements PlansFilterPositionModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plans filter position model instance should use the {@link com.ext.portlet.plans.model.PlansFilterPosition} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_PlansFilterPosition";
    public static final Object[][] TABLE_COLUMNS = {
            { "userId", Types.BIGINT },
            { "planTypeId", Types.BIGINT },
            { "positionId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_PlansFilterPosition (userId LONG not null,planTypeId LONG not null,positionId LONG not null,primary key (userId, planTypeId, positionId))";
    public static final String TABLE_SQL_DROP = "drop table xcolab_PlansFilterPosition";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.plans.model.PlansFilterPosition"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.plans.model.PlansFilterPosition"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.plans.model.PlansFilterPosition"),
            true);
    public static long PLANTYPEID_COLUMN_BITMASK = 1L;
    public static long USERID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.plans.model.PlansFilterPosition"));
    private static ClassLoader _classLoader = PlansFilterPosition.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            PlansFilterPosition.class
        };
    private long _userId;
    private String _userUuid;
    private long _originalUserId;
    private boolean _setOriginalUserId;
    private long _planTypeId;
    private long _originalPlanTypeId;
    private boolean _setOriginalPlanTypeId;
    private long _positionId;
    private long _columnBitmask;
    private PlansFilterPosition _escapedModelProxy;

    public PlansFilterPositionModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PlansFilterPosition toModel(PlansFilterPositionSoap soapModel) {
        PlansFilterPosition model = new PlansFilterPositionImpl();

        model.setUserId(soapModel.getUserId());
        model.setPlanTypeId(soapModel.getPlanTypeId());
        model.setPositionId(soapModel.getPositionId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PlansFilterPosition> toModels(
        PlansFilterPositionSoap[] soapModels) {
        List<PlansFilterPosition> models = new ArrayList<PlansFilterPosition>(soapModels.length);

        for (PlansFilterPositionSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public PlansFilterPositionPK getPrimaryKey() {
        return new PlansFilterPositionPK(_userId, _planTypeId, _positionId);
    }

    public void setPrimaryKey(PlansFilterPositionPK primaryKey) {
        setUserId(primaryKey.userId);
        setPlanTypeId(primaryKey.planTypeId);
        setPositionId(primaryKey.positionId);
    }

    public Serializable getPrimaryKeyObj() {
        return new PlansFilterPositionPK(_userId, _planTypeId, _positionId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((PlansFilterPositionPK) primaryKeyObj);
    }

    public Class<?> getModelClass() {
        return PlansFilterPosition.class;
    }

    public String getModelClassName() {
        return PlansFilterPosition.class.getName();
    }

    @JSON
    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _columnBitmask |= USERID_COLUMN_BITMASK;

        if (!_setOriginalUserId) {
            _setOriginalUserId = true;

            _originalUserId = _userId;
        }

        _userId = userId;
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getOriginalUserId() {
        return _originalUserId;
    }

    @JSON
    public long getPlanTypeId() {
        return _planTypeId;
    }

    public void setPlanTypeId(long planTypeId) {
        _columnBitmask |= PLANTYPEID_COLUMN_BITMASK;

        if (!_setOriginalPlanTypeId) {
            _setOriginalPlanTypeId = true;

            _originalPlanTypeId = _planTypeId;
        }

        _planTypeId = planTypeId;
    }

    public long getOriginalPlanTypeId() {
        return _originalPlanTypeId;
    }

    @JSON
    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public PlansFilterPosition toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (PlansFilterPosition) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        PlansFilterPositionImpl plansFilterPositionImpl = new PlansFilterPositionImpl();

        plansFilterPositionImpl.setUserId(getUserId());
        plansFilterPositionImpl.setPlanTypeId(getPlanTypeId());
        plansFilterPositionImpl.setPositionId(getPositionId());

        plansFilterPositionImpl.resetOriginalValues();

        return plansFilterPositionImpl;
    }

    public int compareTo(PlansFilterPosition plansFilterPosition) {
        PlansFilterPositionPK primaryKey = plansFilterPosition.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        PlansFilterPosition plansFilterPosition = null;

        try {
            plansFilterPosition = (PlansFilterPosition) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        PlansFilterPositionPK primaryKey = plansFilterPosition.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
        PlansFilterPositionModelImpl plansFilterPositionModelImpl = this;

        plansFilterPositionModelImpl._originalUserId = plansFilterPositionModelImpl._userId;

        plansFilterPositionModelImpl._setOriginalUserId = false;

        plansFilterPositionModelImpl._originalPlanTypeId = plansFilterPositionModelImpl._planTypeId;

        plansFilterPositionModelImpl._setOriginalPlanTypeId = false;

        plansFilterPositionModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PlansFilterPosition> toCacheModel() {
        PlansFilterPositionCacheModel plansFilterPositionCacheModel = new PlansFilterPositionCacheModel();

        plansFilterPositionCacheModel.userId = getUserId();

        plansFilterPositionCacheModel.planTypeId = getPlanTypeId();

        plansFilterPositionCacheModel.positionId = getPositionId();

        return plansFilterPositionCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{userId=");
        sb.append(getUserId());
        sb.append(", planTypeId=");
        sb.append(getPlanTypeId());
        sb.append(", positionId=");
        sb.append(getPositionId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.plans.model.PlansFilterPosition");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>planTypeId</column-name><column-value><![CDATA[");
        sb.append(getPlanTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionId</column-name><column-value><![CDATA[");
        sb.append(getPositionId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
