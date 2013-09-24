package org.xcolab.portlets.proposals.wrappers;

import java.util.Date;

import com.ext.portlet.NoSuchProposalAttributeException;
import com.ext.portlet.model.Proposal;
import com.ext.portlet.model.ProposalAttribute;
import com.ext.portlet.service.ProposalLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.expando.model.ExpandoBridge;

public class ProposalWrapper {
    private Proposal proposal;
    
    public ProposalWrapper(Proposal proposal) {
        this.proposal = proposal;
    }

    public Class<?> getModelClass() {
        return proposal.getModelClass();
    }

    public long getProposalId() {
        return proposal.getProposalId();
    }

    public Date getCreateDate() {
        return proposal.getCreateDate();
    }

    public void setCreateDate(Date createDate) {
        proposal.setCreateDate(createDate);
    }

    public int getCurrentVersion() {
        return proposal.getCurrentVersion();
    }

    public void setCurrentVersion(int currentVersion) {
        proposal.setCurrentVersion(currentVersion);
    }

    public long getAuthorId() {
        return proposal.getAuthorId();
    }

    public void setAuthorId(long authorId) {
        proposal.setAuthorId(authorId);
    }

    public boolean getVisible() {
        return proposal.getVisible();
    }

    public boolean isVisible() {
        return proposal.isVisible();
    }

    public long getDiscussionId() {
        return proposal.getDiscussionId();
    }

    public void setDiscussionId(long discussionId) {
        proposal.setDiscussionId(discussionId);
    }

    public long getJudgeDiscussionId() {
        return proposal.getJudgeDiscussionId();
    }

    public void setJudgeDiscussionId(long judgeDiscussionId) {
        proposal.setJudgeDiscussionId(judgeDiscussionId);
    }

    public long getFellowDiscussionId() {
        return proposal.getFellowDiscussionId();
    }

    public void setFellowDiscussionId(long fellowDiscussionId) {
        proposal.setFellowDiscussionId(fellowDiscussionId);
    }

    public long getAdvisorDiscussionId() {
        return proposal.getAdvisorDiscussionId();
    }

    public void setAdvisorDiscussionId(long advisorDiscussionId) {
        proposal.setAdvisorDiscussionId(advisorDiscussionId);
    }

    public long getGroupId() {
        return proposal.getGroupId();
    }

    public void setGroupId(long groupId) {
        proposal.setGroupId(groupId);
    }

    public void setCachedModel(boolean cachedModel) {
        proposal.setCachedModel(cachedModel);
    }

    public ExpandoBridge getExpandoBridge() {
        return proposal.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        proposal.setExpandoBridgeAttributes(serviceContext);
    }
    
    public String getPitch() throws PortalException, SystemException {
        return getAttributeValueString("PITCH", "");
    }


    public String getName() throws PortalException, SystemException {
        return getAttributeValueString("NAME", "");
    }
    
    public boolean isFeatured() {
        // TODO
        return false;
    }
    
    public int getRibbon() {
        // TODO
        return 0;
    }
    
    public String getTeam() {
        // TODO
        return null;
    }
    
    public User getAuthor() throws PortalException, SystemException {
        return UserLocalServiceUtil.getUser(proposal.getAuthorId());
    }
    
    public long getSupportersCount() {
        // TODO
        return 0;
    }

    public long getCommentsCount() {
        // TODO
        return 0;
    }
    
    public Date getLastModifiedDate() {
        // TODO
        return new Date();
    }
    
    public boolean isOpen() {
        // TODO
        return true;
    }
    
    private String getAttributeValueString(String attributeName, String defaultVal) throws PortalException, SystemException {
        return getAttributeValueString(attributeName, 0, defaultVal);
    }

    
    private String getAttributeValueString(String attributeName, long additionalId, String defaultVal) throws PortalException, SystemException {
        ProposalAttribute pa = getAttributeOrNull(attributeName, additionalId);
        return pa == null ? defaultVal : pa.getStringValue();
        
    }

    private long getAttributeValueLong(String attributeName, long additionalId, long defaultVal) throws PortalException, SystemException {
        ProposalAttribute pa = getAttributeOrNull(attributeName, additionalId);
        return pa == null ? defaultVal : pa.getNumericValue();
        
    }

    private double getAttributeValueReal(String attributeName, long additionalId, double defaultVal) throws PortalException, SystemException {
        ProposalAttribute pa = getAttributeOrNull(attributeName, additionalId);
        return pa == null ? defaultVal : pa.getRealValue();
    }
    
    private ProposalAttribute getAttributeOrNull(String attributeName, long additionalId) throws PortalException, SystemException {
        try {
            return ProposalLocalServiceUtil.getAttribute(proposal.getProposalId(), attributeName, additionalId);
        }
        catch (NoSuchProposalAttributeException e) {
            return null;
        }
    }
    
    

}
