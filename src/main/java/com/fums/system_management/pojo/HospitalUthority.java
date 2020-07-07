package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * hospital_uthority
 * @author 
 */
public class HospitalUthority implements Serializable {
    /**
     * 部门id
     */
    private Integer hospitalUthorityId;

    /**
     * 部门名称
     */
    private String hospitalUthorityName;

    /**
     * 部门代号
     */
    private String hospitalUthorityCode;

    /**
     * 部门状态(0:正常 1:失效)
     */
    private Integer hospitalUthorityState;

    /**
     * 部门创建时间
     */
    private Date hospitalUthorityCreateTime;

    /**
     * 部门更新时间
     */
    private Date hospitalUthorityUpdateTime;

    private static final long serialVersionUID = 1L;

    public Integer getHospitalUthorityId() {
        return hospitalUthorityId;
    }

    public void setHospitalUthorityId(Integer hospitalUthorityId) {
        this.hospitalUthorityId = hospitalUthorityId;
    }

    public String getHospitalUthorityName() {
        return hospitalUthorityName;
    }

    public void setHospitalUthorityName(String hospitalUthorityName) {
        this.hospitalUthorityName = hospitalUthorityName;
    }

    public String getHospitalUthorityCode() {
        return hospitalUthorityCode;
    }

    public void setHospitalUthorityCode(String hospitalUthorityCode) {
        this.hospitalUthorityCode = hospitalUthorityCode;
    }

    public Integer getHospitalUthorityState() {
        return hospitalUthorityState;
    }

    public void setHospitalUthorityState(Integer hospitalUthorityState) {
        this.hospitalUthorityState = hospitalUthorityState;
    }

    public Date getHospitalUthorityCreateTime() {
        return hospitalUthorityCreateTime;
    }

    public void setHospitalUthorityCreateTime(Date hospitalUthorityCreateTime) {
        this.hospitalUthorityCreateTime = hospitalUthorityCreateTime;
    }

    public Date getHospitalUthorityUpdateTime() {
        return hospitalUthorityUpdateTime;
    }

    public void setHospitalUthorityUpdateTime(Date hospitalUthorityUpdateTime) {
        this.hospitalUthorityUpdateTime = hospitalUthorityUpdateTime;
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
        HospitalUthority other = (HospitalUthority) that;
        return (this.getHospitalUthorityId() == null ? other.getHospitalUthorityId() == null : this.getHospitalUthorityId().equals(other.getHospitalUthorityId()))
            && (this.getHospitalUthorityName() == null ? other.getHospitalUthorityName() == null : this.getHospitalUthorityName().equals(other.getHospitalUthorityName()))
            && (this.getHospitalUthorityCode() == null ? other.getHospitalUthorityCode() == null : this.getHospitalUthorityCode().equals(other.getHospitalUthorityCode()))
            && (this.getHospitalUthorityState() == null ? other.getHospitalUthorityState() == null : this.getHospitalUthorityState().equals(other.getHospitalUthorityState()))
            && (this.getHospitalUthorityCreateTime() == null ? other.getHospitalUthorityCreateTime() == null : this.getHospitalUthorityCreateTime().equals(other.getHospitalUthorityCreateTime()))
            && (this.getHospitalUthorityUpdateTime() == null ? other.getHospitalUthorityUpdateTime() == null : this.getHospitalUthorityUpdateTime().equals(other.getHospitalUthorityUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHospitalUthorityId() == null) ? 0 : getHospitalUthorityId().hashCode());
        result = prime * result + ((getHospitalUthorityName() == null) ? 0 : getHospitalUthorityName().hashCode());
        result = prime * result + ((getHospitalUthorityCode() == null) ? 0 : getHospitalUthorityCode().hashCode());
        result = prime * result + ((getHospitalUthorityState() == null) ? 0 : getHospitalUthorityState().hashCode());
        result = prime * result + ((getHospitalUthorityCreateTime() == null) ? 0 : getHospitalUthorityCreateTime().hashCode());
        result = prime * result + ((getHospitalUthorityUpdateTime() == null) ? 0 : getHospitalUthorityUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hospitalUthorityId=").append(hospitalUthorityId);
        sb.append(", hospitalUthorityName=").append(hospitalUthorityName);
        sb.append(", hospitalUthorityCode=").append(hospitalUthorityCode);
        sb.append(", hospitalUthorityState=").append(hospitalUthorityState);
        sb.append(", hospitalUthorityCreateTime=").append(hospitalUthorityCreateTime);
        sb.append(", hospitalUthorityUpdateTime=").append(hospitalUthorityUpdateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}