package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * hospital_department_child
 * @author 
 */
public class HospitalDepartmentChild implements Serializable {
    /**
     * 科室下属科
     */
    private Integer hospitalDepartmentChildId;

    /**
     * 科室下属科名称
     */
    private String hospitalDepartmentChildName;

    /**
     * 科室下属科状态
     */
    private Integer hospitalDepartmentChildState;

    /**
     * 科室下属科代号
     */
    private String hospitalDepartmentChildCode;

    /**
     * 科室代号
     */
    private String hospitalDepartmentCode;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalDepartmentChildId() {
        return hospitalDepartmentChildId;
    }

    public void setHospitalDepartmentChildId(Integer hospitalDepartmentChildId) {
        this.hospitalDepartmentChildId = hospitalDepartmentChildId;
    }

    public String getHospitalDepartmentChildName() {
        return hospitalDepartmentChildName;
    }

    public void setHospitalDepartmentChildName(String hospitalDepartmentChildName) {
        this.hospitalDepartmentChildName = hospitalDepartmentChildName;
    }

    public Integer getHospitalDepartmentChildState() {
        return hospitalDepartmentChildState;
    }

    public void setHospitalDepartmentChildState(Integer hospitalDepartmentChildState) {
        this.hospitalDepartmentChildState = hospitalDepartmentChildState;
    }

    public String getHospitalDepartmentChildCode() {
        return hospitalDepartmentChildCode;
    }

    public void setHospitalDepartmentChildCode(String hospitalDepartmentChildCode) {
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode;
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
        HospitalDepartmentChild other = (HospitalDepartmentChild) that;
        return (this.getHospitalDepartmentChildId() == null ? other.getHospitalDepartmentChildId() == null : this.getHospitalDepartmentChildId().equals(other.getHospitalDepartmentChildId()))
            && (this.getHospitalDepartmentChildName() == null ? other.getHospitalDepartmentChildName() == null : this.getHospitalDepartmentChildName().equals(other.getHospitalDepartmentChildName()))
            && (this.getHospitalDepartmentChildState() == null ? other.getHospitalDepartmentChildState() == null : this.getHospitalDepartmentChildState().equals(other.getHospitalDepartmentChildState()))
            && (this.getHospitalDepartmentChildCode() == null ? other.getHospitalDepartmentChildCode() == null : this.getHospitalDepartmentChildCode().equals(other.getHospitalDepartmentChildCode()))
            && (this.getHospitalDepartmentCode() == null ? other.getHospitalDepartmentCode() == null : this.getHospitalDepartmentCode().equals(other.getHospitalDepartmentCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalDepartmentChildId() == null) ? 0 : getHospitalDepartmentChildId().hashCode());
        result = prime * result + ((getHospitalDepartmentChildName() == null) ? 0 : getHospitalDepartmentChildName().hashCode());
        result = prime * result + ((getHospitalDepartmentChildState() == null) ? 0 : getHospitalDepartmentChildState().hashCode());
        result = prime * result + ((getHospitalDepartmentChildCode() == null) ? 0 : getHospitalDepartmentChildCode().hashCode());
        result = prime * result + ((getHospitalDepartmentCode() == null) ? 0 : getHospitalDepartmentCode().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalDepartmentChildId=").append(hospitalDepartmentChildId);
        sb.append(", hospitalDepartmentChildName=").append(hospitalDepartmentChildName);
        sb.append(", hospitalDepartmentChildState=").append(hospitalDepartmentChildState);
        sb.append(", hospitalDepartmentChildCode=").append(hospitalDepartmentChildCode);
        sb.append(", hospitalDepartmentCode=").append(hospitalDepartmentCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}