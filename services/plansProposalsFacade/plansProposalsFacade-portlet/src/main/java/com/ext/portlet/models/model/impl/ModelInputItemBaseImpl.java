package com.ext.portlet.models.model.impl;

import com.ext.portlet.models.model.ModelInputItem;
import com.ext.portlet.models.service.ModelInputItemLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ModelInputItem service. Represents a row in the &quot;xcolab_ModelInputItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ModelInputItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelInputItemImpl
 * @see com.ext.portlet.models.model.ModelInputItem
 * @generated
 */
public abstract class ModelInputItemBaseImpl extends ModelInputItemModelImpl
    implements ModelInputItem {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a model input item model instance should use the {@link ModelInputItem} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            ModelInputItemLocalServiceUtil.addModelInputItem(this);
        } else {
            ModelInputItemLocalServiceUtil.updateModelInputItem(this);
        }
    }
}
