package com.ext.portlet.model.impl;

import com.ext.portlet.model.BalloonText;
import com.ext.portlet.service.BalloonTextLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the BalloonText service. Represents a row in the &quot;xcolab_BalloonText&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BalloonTextImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalloonTextImpl
 * @see com.ext.portlet.model.BalloonText
 * @generated
 */
public abstract class BalloonTextBaseImpl extends BalloonTextModelImpl
    implements BalloonText {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a balloon text model instance should use the {@link BalloonText} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BalloonTextLocalServiceUtil.addBalloonText(this);
        } else {
            BalloonTextLocalServiceUtil.updateBalloonText(this);
        }
    }
}
