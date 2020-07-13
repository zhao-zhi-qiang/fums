package com.fums.followmanagement.pojo;

import java.util.Date;

public class FollowPatient {
    private Integer id;

    private Integer hospitalDepartmentId;

    private Integer followUpId;

    private Integer patientId;

    private Date dateOfNextFollowUp;

    private Integer delState;

    private Date setOfDate;

    private Integer followUpSetdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHospitalDepartmentId() {
        return hospitalDepartmentId;
    }

    public void setHospitalDepartmentId(Integer hospitalDepartmentId) {
        this.hospitalDepartmentId = hospitalDepartmentId;
    }

    public Integer getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(Integer followUpId) {
        this.followUpId = followUpId;
    }

    public Integer getPatientId(Integer patientId) {
        return this.patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Date getDateOfNextFollowUp() {
        return dateOfNextFollowUp;
    }

    public void setDateOfNextFollowUp(Date dateOfNextFollowUp) {
        this.dateOfNextFollowUp = dateOfNextFollowUp;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
    }

    public Date getSetOfDate() {
        return setOfDate;
    }

    public void setSetOfDate(Date setOfDate) {
        this.setOfDate = setOfDate;
    }

    public Integer getFollowUpSetdate() {
        return followUpSetdate;
    }

    public void setFollowUpSetdate(Integer followUpSetdate) {
        this.followUpSetdate = followUpSetdate;
    }
}