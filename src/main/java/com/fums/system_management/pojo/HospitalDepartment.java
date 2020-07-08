package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * hospital_department
 * @author 
 */
public class HospitalDepartment implements Serializable {
    /**
     * 科室id
     */
    private Integer hospitalDepartmentId;

    /**
     * 科室名称
     */
    private String hospitalDepartmentName;

    /**
     * 科室状态
     */
    private Integer hospitalDepartmentState;

    /**
     * 科室代号
     */
    private String hospitalDepartmentCode;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalDepartmentId() {
        return hospitalDepartmentId;
    }

    public void setHospitalDepartmentId(Integer hospitalDepartmentId) {
        this.hospitalDepartmentId = hospitalDepartmentId;
    }

    public String getHospitalDepartmentName() {
        return hospitalDepartmentName;
    }

    public void setHospitalDepartmentName(String hospitalDepartmentName) {
        this.hospitalDepartmentName = hospitalDepartmentName;
    }

    public Integer getHospitalDepartmentState() {
        return hospitalDepartmentState;
    }

    public void setHospitalDepartmentState(Integer hospitalDepartmentState) {
        this.hospitalDepartmentState = hospitalDepartmentState;
    }

    public String getHospitalDepartmentCode() {
        return hospitalDepartmentCode;
    }

    public void setHospitalDepartmentCode(String hospitalDepartmentCode) {
        this.hospitalDepartmentCode = hospitalDepartmentCode;
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
        HospitalDepartment other = (HospitalDepartment) that;
        return (this.getHospitalDepartmentId() == null ? other.getHospitalDepartmentId() == null : this.getHospitalDepartmentId().equals(other.getHospitalDepartmentId()))
            && (this.getHospitalDepartmentName() == null ? other.getHospitalDepartmentName() == null : this.getHospitalDepartmentName().equals(other.getHospitalDepartmentName()))
            && (this.getHospitalDepartmentState() == null ? other.getHospitalDepartmentState() == null : this.getHospitalDepartmentState().equals(other.getHospitalDepartmentState()))
            && (this.getHospitalDepartmentCode() == null ? other.getHospitalDepartmentCode() == null : this.getHospitalDepartmentCode().equals(other.getHospitalDepartmentCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalDepartmentId() == null) ? 0 : getHospitalDepartmentId().hashCode());
        result = prime * result + ((getHospitalDepartmentName() == null) ? 0 : getHospitalDepartmentName().hashCode());
        result = prime * result + ((getHospitalDepartmentState() == null) ? 0 : getHospitalDepartmentState().hashCode());
        result = prime * result + ((getHospitalDepartmentCode() == null) ? 0 : getHospitalDepartmentCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalDepartmentId=").append(hospitalDepartmentId);
        sb.append(", hospitalDepartmentName=").append(hospitalDepartmentName);
        sb.append(", hospitalDepartmentState=").append(hospitalDepartmentState);
        sb.append(", hospitalDepartmentCode=").append(hospitalDepartmentCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}