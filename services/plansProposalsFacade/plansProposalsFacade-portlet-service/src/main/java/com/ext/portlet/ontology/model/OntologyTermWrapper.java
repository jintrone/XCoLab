package com.ext.portlet.ontology.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OntologyTerm}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       OntologyTerm
 * @generated
 */
public class OntologyTermWrapper implements OntologyTerm,
    ModelWrapper<OntologyTerm> {
    private OntologyTerm _ontologyTerm;

    public OntologyTermWrapper(OntologyTerm ontologyTerm) {
        _ontologyTerm = ontologyTerm;
    }

    public Class<?> getModelClass() {
        return OntologyTerm.class;
    }

    public String getModelClassName() {
        return OntologyTerm.class.getName();
    }

    /**
    * Returns the primary key of this ontology term.
    *
    * @return the primary key of this ontology term
    */
    public long getPrimaryKey() {
        return _ontologyTerm.getPrimaryKey();
    }

    /**
    * Sets the primary key of this ontology term.
    *
    * @param primaryKey the primary key of this ontology term
    */
    public void setPrimaryKey(long primaryKey) {
        _ontologyTerm.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ID of this ontology term.
    *
    * @return the ID of this ontology term
    */
    public long getId() {
        return _ontologyTerm.getId();
    }

    /**
    * Sets the ID of this ontology term.
    *
    * @param id the ID of this ontology term
    */
    public void setId(long id) {
        _ontologyTerm.setId(id);
    }

    /**
    * Returns the parent ID of this ontology term.
    *
    * @return the parent ID of this ontology term
    */
    public long getParentId() {
        return _ontologyTerm.getParentId();
    }

    /**
    * Sets the parent ID of this ontology term.
    *
    * @param parentId the parent ID of this ontology term
    */
    public void setParentId(long parentId) {
        _ontologyTerm.setParentId(parentId);
    }

    /**
    * Returns the ontology space ID of this ontology term.
    *
    * @return the ontology space ID of this ontology term
    */
    public long getOntologySpaceId() {
        return _ontologyTerm.getOntologySpaceId();
    }

    /**
    * Sets the ontology space ID of this ontology term.
    *
    * @param ontologySpaceId the ontology space ID of this ontology term
    */
    public void setOntologySpaceId(long ontologySpaceId) {
        _ontologyTerm.setOntologySpaceId(ontologySpaceId);
    }

    /**
    * Returns the name of this ontology term.
    *
    * @return the name of this ontology term
    */
    public java.lang.String getName() {
        return _ontologyTerm.getName();
    }

    /**
    * Sets the name of this ontology term.
    *
    * @param name the name of this ontology term
    */
    public void setName(java.lang.String name) {
        _ontologyTerm.setName(name);
    }

    /**
    * Returns the description url of this ontology term.
    *
    * @return the description url of this ontology term
    */
    public java.lang.String getDescriptionUrl() {
        return _ontologyTerm.getDescriptionUrl();
    }

    /**
    * Sets the description url of this ontology term.
    *
    * @param descriptionUrl the description url of this ontology term
    */
    public void setDescriptionUrl(java.lang.String descriptionUrl) {
        _ontologyTerm.setDescriptionUrl(descriptionUrl);
    }

    public boolean isNew() {
        return _ontologyTerm.isNew();
    }

    public void setNew(boolean n) {
        _ontologyTerm.setNew(n);
    }

    public boolean isCachedModel() {
        return _ontologyTerm.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _ontologyTerm.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _ontologyTerm.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _ontologyTerm.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ontologyTerm.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ontologyTerm.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ontologyTerm.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new OntologyTermWrapper((OntologyTerm) _ontologyTerm.clone());
    }

    public int compareTo(OntologyTerm ontologyTerm) {
        return _ontologyTerm.compareTo(ontologyTerm);
    }

    @Override
    public int hashCode() {
        return _ontologyTerm.hashCode();
    }

    public com.liferay.portal.model.CacheModel<OntologyTerm> toCacheModel() {
        return _ontologyTerm.toCacheModel();
    }

    public OntologyTerm toEscapedModel() {
        return new OntologyTermWrapper(_ontologyTerm.toEscapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ontologyTerm.toString();
    }

    public java.lang.String toXmlString() {
        return _ontologyTerm.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ontologyTerm.persist();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public OntologyTerm getWrappedOntologyTerm() {
        return _ontologyTerm;
    }

    public OntologyTerm getWrappedModel() {
        return _ontologyTerm;
    }

    public void resetOriginalValues() {
        _ontologyTerm.resetOriginalValues();
    }
}
