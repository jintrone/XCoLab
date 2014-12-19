package com.ext.portlet.model.impl;

import com.ext.portlet.model.ProposalVersion;
import com.ext.portlet.service.ProposalVersionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ProposalVersion service. Represents a row in the &quot;xcolab_ProposalVersion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProposalVersionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProposalVersionImpl
 * @see com.ext.portlet.model.ProposalVersion
 * @generated
 */
public abstract class ProposalVersionBaseImpl extends ProposalVersionModelImpl
    implements ProposalVersion {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a proposal version model instance should use the {@link ProposalVersion} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProposalVersionLocalServiceUtil.addProposalVersion(this);
        } else {
            ProposalVersionLocalServiceUtil.updateProposalVersion(this);
        }
    }
}
