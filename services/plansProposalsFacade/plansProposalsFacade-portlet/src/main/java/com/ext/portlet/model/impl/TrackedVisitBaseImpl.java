package com.ext.portlet.model.impl;

import com.ext.portlet.model.TrackedVisit;
import com.ext.portlet.service.TrackedVisitLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the TrackedVisit service. Represents a row in the &quot;xcolab_TrackedVisit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TrackedVisitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TrackedVisitImpl
 * @see com.ext.portlet.model.TrackedVisit
 * @generated
 */
public abstract class TrackedVisitBaseImpl extends TrackedVisitModelImpl
    implements TrackedVisit {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a tracked visit model instance should use the {@link TrackedVisit} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            TrackedVisitLocalServiceUtil.addTrackedVisit(this);
        } else {
            TrackedVisitLocalServiceUtil.updateTrackedVisit(this);
        }
    }
}
