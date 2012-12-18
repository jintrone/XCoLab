package com.ext.portlet.contests.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ContestTeamMember}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ContestTeamMember
 * @generated
 */
public class ContestTeamMemberWrapper implements ContestTeamMember,
    ModelWrapper<ContestTeamMember> {
    private ContestTeamMember _contestTeamMember;

    public ContestTeamMemberWrapper(ContestTeamMember contestTeamMember) {
        _contestTeamMember = contestTeamMember;
    }

    public Class<?> getModelClass() {
        return ContestTeamMember.class;
    }

    public String getModelClassName() {
        return ContestTeamMember.class.getName();
    }

    /**
    * Returns the primary key of this contest team member.
    *
    * @return the primary key of this contest team member
    */
    public long getPrimaryKey() {
        return _contestTeamMember.getPrimaryKey();
    }

    /**
    * Sets the primary key of this contest team member.
    *
    * @param primaryKey the primary key of this contest team member
    */
    public void setPrimaryKey(long primaryKey) {
        _contestTeamMember.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this contest team member.
    *
    * @return the ID of this contest team member
    */
    public long getId() {
        return _contestTeamMember.getId();
    }

    /**
    * Sets the ID of this contest team member.
    *
    * @param id the ID of this contest team member
    */
    public void setId(long id) {
        _contestTeamMember.setId(id);
    }

    /**
    * Returns the contest ID of this contest team member.
    *
    * @return the contest ID of this contest team member
    */
    public long getContestId() {
        return _contestTeamMember.getContestId();
    }

    /**
    * Sets the contest ID of this contest team member.
    *
    * @param contestId the contest ID of this contest team member
    */
    public void setContestId(long contestId) {
        _contestTeamMember.setContestId(contestId);
    }

    /**
    * Returns the user ID of this contest team member.
    *
    * @return the user ID of this contest team member
    */
    public long getUserId() {
        return _contestTeamMember.getUserId();
    }

    /**
    * Sets the user ID of this contest team member.
    *
    * @param userId the user ID of this contest team member
    */
    public void setUserId(long userId) {
        _contestTeamMember.setUserId(userId);
    }

    /**
    * Returns the user uuid of this contest team member.
    *
    * @return the user uuid of this contest team member
    * @throws SystemException if a system exception occurred
    */
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _contestTeamMember.getUserUuid();
    }

    /**
    * Sets the user uuid of this contest team member.
    *
    * @param userUuid the user uuid of this contest team member
    */
    public void setUserUuid(java.lang.String userUuid) {
        _contestTeamMember.setUserUuid(userUuid);
    }

    /**
    * Returns the role of this contest team member.
    *
    * @return the role of this contest team member
    */
    public java.lang.String getRole() {
        return _contestTeamMember.getRole();
    }

    /**
    * Sets the role of this contest team member.
    *
    * @param role the role of this contest team member
    */
    public void setRole(java.lang.String role) {
        _contestTeamMember.setRole(role);
    }

    public boolean isNew() {
        return _contestTeamMember.isNew();
    }

    public void setNew(boolean n) {
        _contestTeamMember.setNew(n);
    }

    public boolean isCachedModel() {
        return _contestTeamMember.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _contestTeamMember.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _contestTeamMember.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _contestTeamMember.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _contestTeamMember.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _contestTeamMember.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _contestTeamMember.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ContestTeamMemberWrapper((ContestTeamMember) _contestTeamMember.clone());
    }

    public int compareTo(ContestTeamMember contestTeamMember) {
        return _contestTeamMember.compareTo(contestTeamMember);
    }

    @Override
    public int hashCode() {
        return _contestTeamMember.hashCode();
    }

    public com.liferay.portal.model.CacheModel<ContestTeamMember> toCacheModel() {
        return _contestTeamMember.toCacheModel();
    }

    public ContestTeamMember toEscapedModel() {
        return new ContestTeamMemberWrapper(_contestTeamMember.toEscapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _contestTeamMember.toString();
    }

    public java.lang.String toXmlString() {
        return _contestTeamMember.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _contestTeamMember.persist();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public ContestTeamMember getWrappedContestTeamMember() {
        return _contestTeamMember;
    }

    public ContestTeamMember getWrappedModel() {
        return _contestTeamMember;
    }

    public void resetOriginalValues() {
        _contestTeamMember.resetOriginalValues();
    }
}
