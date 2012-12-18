package com.ext.portlet.ontology.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ext.portlet.ontology.service.http.FocusAreaServiceSoap}.
 *
 * @author    Brian Wing Shun Chan
 * @see       com.ext.portlet.ontology.service.http.FocusAreaServiceSoap
 * @generated
 */
public class FocusAreaSoap implements Serializable {
    private long _id;
    private String _name;

    public FocusAreaSoap() {
    }

    public static FocusAreaSoap toSoapModel(FocusArea model) {
        FocusAreaSoap soapModel = new FocusAreaSoap();

        soapModel.setId(model.getId());
        soapModel.setName(model.getName());

        return soapModel;
    }

    public static FocusAreaSoap[] toSoapModels(FocusArea[] models) {
        FocusAreaSoap[] soapModels = new FocusAreaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FocusAreaSoap[][] toSoapModels(FocusArea[][] models) {
        FocusAreaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FocusAreaSoap[models.length][models[0].length];
        } else {
            soapModels = new FocusAreaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FocusAreaSoap[] toSoapModels(List<FocusArea> models) {
        List<FocusAreaSoap> soapModels = new ArrayList<FocusAreaSoap>(models.size());

        for (FocusArea model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FocusAreaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }
}
