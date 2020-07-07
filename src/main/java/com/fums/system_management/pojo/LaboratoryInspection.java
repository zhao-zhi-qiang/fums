package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * laboratory_inspection
 * @author 
 */
public class LaboratoryInspection implements Serializable {
    /**
     * id
     */
    private Integer laboratoryInspectionId;

    /**
     * 患者id
     */
    private Integer patientId;

    /**
     * 检查名称
     */
    private String checkTheName;

    private static final long serialVersionUID = 1L;

    public Integer getLaboratoryInspectionId() {
        return laboratoryInspectionId;
    }

    public void setLaboratoryInspectionId(Integer laboratoryInspectionId) {
        this.laboratoryInspectionId = laboratoryInspectionId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getCheckTheName() {
        return checkTheName;
    }

    public void setCheckTheName(String checkTheName) {
        this.checkTheName = checkTheName;
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
        LaboratoryInspection other = (LaboratoryInspection) that;
        return (this.getLaboratoryInspectionId() == null ? other.getLaboratoryInspectionId() == null : this.getLaboratoryInspectionId().equals(other.getLaboratoryInspectionId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getCheckTheName() == null ? other.getCheckTheName() == null : this.getCheckTheName().equals(other.getCheckTheName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLaboratoryInspectionId() == null) ? 0 : getLaboratoryInspectionId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getCheckTheName() == null) ? 0 : getCheckTheName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", laboratoryInspectionId=").append(laboratoryInspectionId);
        sb.append(", patientId=").append(patientId);
        sb.append(", checkTheName=").append(checkTheName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}