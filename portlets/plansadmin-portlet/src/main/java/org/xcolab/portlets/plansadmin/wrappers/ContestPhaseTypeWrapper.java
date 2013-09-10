package org.xcolab.portlets.plansadmin.wrappers;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.xcolab.portlets.plansadmin.ContestPhaseTypeBean;

import com.ext.portlet.model.ContestPhaseType;
import com.ext.portlet.service.ContestPhaseTypeLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

public class ContestPhaseTypeWrapper {
    private ContestPhaseType contestPhaseType;
    private ContestPhaseTypeBean contestPhaseTypeBean;
    
    public ContestPhaseTypeWrapper(ContestPhaseType contestPhaseType, ContestPhaseTypeBean contestPhaseTypeBean) {
        super();
        this.contestPhaseType = contestPhaseType;
        this.contestPhaseTypeBean = contestPhaseTypeBean;
    }

    public Long getId() {
        return contestPhaseType.getId();
    }
    public String getName() {
        return contestPhaseType.getName();
    }

    public void setName(String name) {
        contestPhaseType.setName(name);
    }

    public String getDescription() {
        return contestPhaseType.getDescription();
    }

    public void setDescription(String description) {
        contestPhaseType.setDescription(description);
    }

    public String getStatus() {
        return contestPhaseType.getStatus();
    }

    public void setStatus(String status) {
        contestPhaseType.setStatus(status);
    }
    
    public void save(ActionEvent e) throws SystemException {
        if (contestPhaseType.getId() <= 0) {
            long id = CounterLocalServiceUtil.increment(ContestPhaseType.class.getName());
            if (id < 100) {
                id = CounterLocalServiceUtil.increment(ContestPhaseType.class.getName(), 100);
            }
            contestPhaseType.setId(id);
            ContestPhaseTypeLocalServiceUtil.addContestPhaseType(contestPhaseType);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Contest phase type added"));
        }
        else {FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Contest phase type updated"));
            ContestPhaseTypeLocalServiceUtil.updateContestPhaseType(contestPhaseType);
        }
        contestPhaseTypeBean.refresh();
    }
    

}
