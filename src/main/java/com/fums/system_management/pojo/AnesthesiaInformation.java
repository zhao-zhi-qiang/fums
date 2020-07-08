package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * anesthesia_information
 * @author 
 */
public class AnesthesiaInformation implements Serializable {
    /**
     * 麻醉信息id
     */
    private Integer anesthesiaId;

    /**
     * 麻醉方式
     */
    private String anesthesiaWay;

    /**
     * 麻醉科室
     */
    private String hospitalDepartmentChildCode;

    /**
     * 麻醉准备时间
     */
    private Date anesthesiaReadinessTime;

    /**
     * 麻醉开始时间
     */
    private Date anesthesiaStartTime;

    /**
     * 麻醉结束时间
     */
    private Date anesthesiaEndTime;

    /**
     * 麻醉剂量
     */
    private String anesthesiaDosage;

    private static final long serialVersionUID = 1L;

    public Integer getAnesthesiaId() {
        return anesthesiaId;
    }

    public void setAnesthesiaId(Integer anesthesiaId) {
        this.anesthesiaId = anesthesiaId;
    }

    public String getAnesthesiaWay() {
        return anesthesiaWay;
    }

    public void setAnesthesiaWay(String anesthesiaWay) {
        this.anesthesiaWay = anesthesiaWay;
    }

    public String getHospitalDepartmentChildCode() {
        return hospitalDepartmentChildCode;
    }

    public void setHospitalDepartmentChildCode(String hospitalDepartmentChildCode) {
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode;
    }

    public Date getAnesthesiaReadinessTime() {
        return anesthesiaReadinessTime;
    }

    public void setAnesthesiaReadinessTime(Date anesthesiaReadinessTime) {
        this.anesthesiaReadinessTime = anesthesiaReadinessTime;
    }

    public Date getAnesthesiaStartTime() {
        return anesthesiaStartTime;
    }

    public void setAnesthesiaStartTime(Date anesthesiaStartTime) {
        this.anesthesiaStartTime = anesthesiaStartTime;
    }

    public Date getAnesthesiaEndTime() {
        return anesthesiaEndTime;
    }

    public void setAnesthesiaEndTime(Date anesthesiaEndTime) {
        this.anesthesiaEndTime = anesthesiaEndTime;
    }

    public String getAnesthesiaDosage() {
        return anesthesiaDosage;
    }

    public void setAnesthesiaDosage(String anesthesiaDosage) {
        this.anesthesiaDosage = anesthesiaDosage;
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
        AnesthesiaInformation other = (AnesthesiaInformation) that;
        return (this.getAnesthesiaId() == null ? other.getAnesthesiaId() == null : this.getAnesthesiaId().equals(other.getAnesthesiaId()))
            && (this.getAnesthesiaWay() == null ? other.getAnesthesiaWay() == null : this.getAnesthesiaWay().equals(other.getAnesthesiaWay()))
            && (this.getHospitalDepartmentChildCode() == null ? other.getHospitalDepartmentChildCode() == null : this.getHospitalDepartmentChildCode().equals(other.getHospitalDepartmentChildCode()))
            && (this.getAnesthesiaReadinessTime() == null ? other.getAnesthesiaReadinessTime() == null : this.getAnesthesiaReadinessTime().equals(other.getAnesthesiaReadinessTime()))
            && (this.getAnesthesiaStartTime() == null ? other.getAnesthesiaStartTime() == null : this.getAnesthesiaStartTime().equals(other.getAnesthesiaStartTime()))
            && (this.getAnesthesiaEndTime() == null ? other.getAnesthesiaEndTime() == null : this.getAnesthesiaEndTime().equals(other.getAnesthesiaEndTime()))
            && (this.getAnesthesiaDosage() == null ? other.getAnesthesiaDosage() == null : this.getAnesthesiaDosage().equals(other.getAnesthesiaDosage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAnesthesiaId() == null) ? 0 : getAnesthesiaId().hashCode());
        result = prime * result + ((getAnesthesiaWay() == null) ? 0 : getAnesthesiaWay().hashCode());
        result = prime * result + ((getHospitalDepartmentChildCode() == null) ? 0 : getHospitalDepartmentChildCode().hashCode());
        result = prime * result + ((getAnesthesiaReadinessTime() == null) ? 0 : getAnesthesiaReadinessTime().hashCode());
        result = prime * result + ((getAnesthesiaStartTime() == null) ? 0 : getAnesthesiaStartTime().hashCode());
        result = prime * result + ((getAnesthesiaEndTime() == null) ? 0 : getAnesthesiaEndTime().hashCode());
        result = prime * result + ((getAnesthesiaDosage() == null) ? 0 : getAnesthesiaDosage().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", anesthesiaId=").append(anesthesiaId);
        sb.append(", anesthesiaWay=").append(anesthesiaWay);
        sb.append(", hospitalDepartmentChildCode=").append(hospitalDepartmentChildCode);
        sb.append(", anesthesiaReadinessTime=").append(anesthesiaReadinessTime);
        sb.append(", anesthesiaStartTime=").append(anesthesiaStartTime);
        sb.append(", anesthesiaEndTime=").append(anesthesiaEndTime);
        sb.append(", anesthesiaDosage=").append(anesthesiaDosage);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}