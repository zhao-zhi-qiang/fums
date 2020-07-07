package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * symptom
 * @author 
 */
public class Symptom implements Serializable {
    /**
     * 主键
     */
    private Integer symId;

    /**
     * 患者id
     */
    private Integer patientId;

    /**
     * 症状名称
     */
    private String symptomsName;

    /**
     * 内容
     */
    private String details;

    private static final long serialVersionUID = 1L;

    public Integer getSymId() {
        return symId;
    }

    public void setSymId(Integer symId) {
        this.symId = symId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getSymptomsName() {
        return symptomsName;
    }

    public void setSymptomsName(String symptomsName) {
        this.symptomsName = symptomsName;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        Symptom other = (Symptom) that;
        return (this.getSymId() == null ? other.getSymId() == null : this.getSymId().equals(other.getSymId()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getSymptomsName() == null ? other.getSymptomsName() == null : this.getSymptomsName().equals(other.getSymptomsName()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSymId() == null) ? 0 : getSymId().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getSymptomsName() == null) ? 0 : getSymptomsName().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", symId=").append(symId);
        sb.append(", patientId=").append(patientId);
        sb.append(", symptomsName=").append(symptomsName);
        sb.append(", details=").append(details);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}