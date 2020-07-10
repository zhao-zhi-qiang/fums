package com.fums.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * follow_patient
 * @author 
 */
public class FollowPatient implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 科室id
     */
    private Integer hospitalDepartmentId;

    /**
     * 随访组id
     */
    private Integer followUpId;

    /**
     * 患者id
     */
    private Integer patientId;

    /**
     * 下次随访日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfNextFollowUp;

    /**
     * 状态(0：正常，1：删除)
     */
    private Integer delState;

    /**
     * 入组日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date setOfDate;

    /**
     * 随访状态(0：未随访，1：已随访)
     */
    private Integer followUpSetdate;

    private String patientName;
    private String patientUnique;
    private String sex;
    private String followUpName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientUnique() {
        return patientUnique;
    }

    public void setPatientUnique(String patientUnique) {
        this.patientUnique = patientUnique;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFollowUpName() {
        return followUpName;
    }

    public void setFollowUpName(String followUpName) {
        this.followUpName = followUpName;
    }

    private static final long serialVersionUID = 1L;

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

    public Integer getPatientId() {
        return patientId;
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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        FollowPatient other = (FollowPatient) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHospitalDepartmentId() == null ? other.getHospitalDepartmentId() == null : this.getHospitalDepartmentId().equals(other.getHospitalDepartmentId()))
            && (this.getFollowUpId() == null ? other.getFollowUpId() == null : this.getFollowUpId().equals(other.getFollowUpId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getDateOfNextFollowUp() == null ? other.getDateOfNextFollowUp() == null : this.getDateOfNextFollowUp().equals(other.getDateOfNextFollowUp()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()))
            && (this.getSetOfDate() == null ? other.getSetOfDate() == null : this.getSetOfDate().equals(other.getSetOfDate()))
            && (this.getFollowUpSetdate() == null ? other.getFollowUpSetdate() == null : this.getFollowUpSetdate().equals(other.getFollowUpSetdate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHospitalDepartmentId() == null) ? 0 : getHospitalDepartmentId().hashCode());
        result = prime * result + ((getFollowUpId() == null) ? 0 : getFollowUpId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getDateOfNextFollowUp() == null) ? 0 : getDateOfNextFollowUp().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        result = prime * result + ((getSetOfDate() == null) ? 0 : getSetOfDate().hashCode());
        result = prime * result + ((getFollowUpSetdate() == null) ? 0 : getFollowUpSetdate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hospitalDepartmentId=").append(hospitalDepartmentId);
        sb.append(", followUpId=").append(followUpId);
        sb.append(", patientId=").append(patientId);
        sb.append(", dateOfNextFollowUp=").append(dateOfNextFollowUp);
        sb.append(", delState=").append(delState);
        sb.append(", setOfDate=").append(setOfDate);
        sb.append(", followUpSetdate=").append(followUpSetdate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}