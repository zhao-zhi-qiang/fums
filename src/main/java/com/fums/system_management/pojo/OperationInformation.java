package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * operation_information
 * @author 
 */
public class OperationInformation implements Serializable {
    /**
     * id
     */
    private Integer operationId;

    /**
     * 手术名称
     */
    private String operationName;

    /**
     * 手术日期
     */
    private Date operationTime;

    /**
     * 手术执行科室
     */
    private String operationDepartment;

    /**
     * 手术开始时间
     */
    private Date operationStart;

    /**
     * 手术结束时间
     */
    private Date operationEnd;

    /**
     * 手术工作量
     */
    private Integer operationWork;

    /**
     * 手术部位
     */
    private String operationSite;

    /**
     * 麻醉信息id
     */
    private Integer anesthesiaId;

    private static final long serialVersionUID = 1L;

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationDepartment() {
        return operationDepartment;
    }

    public void setOperationDepartment(String operationDepartment) {
        this.operationDepartment = operationDepartment;
    }

    public Date getOperationStart() {
        return operationStart;
    }

    public void setOperationStart(Date operationStart) {
        this.operationStart = operationStart;
    }

    public Date getOperationEnd() {
        return operationEnd;
    }

    public void setOperationEnd(Date operationEnd) {
        this.operationEnd = operationEnd;
    }

    public Integer getOperationWork() {
        return operationWork;
    }

    public void setOperationWork(Integer operationWork) {
        this.operationWork = operationWork;
    }

    public String getOperationSite() {
        return operationSite;
    }

    public void setOperationSite(String operationSite) {
        this.operationSite = operationSite;
    }

    public Integer getAnesthesiaId() {
        return anesthesiaId;
    }

    public void setAnesthesiaId(Integer anesthesiaId) {
        this.anesthesiaId = anesthesiaId;
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
        OperationInformation other = (OperationInformation) that;
        return (this.getOperationId() == null ? other.getOperationId() == null : this.getOperationId().equals(other.getOperationId()))
            && (this.getOperationName() == null ? other.getOperationName() == null : this.getOperationName().equals(other.getOperationName()))
            && (this.getOperationTime() == null ? other.getOperationTime() == null : this.getOperationTime().equals(other.getOperationTime()))
            && (this.getOperationDepartment() == null ? other.getOperationDepartment() == null : this.getOperationDepartment().equals(other.getOperationDepartment()))
            && (this.getOperationStart() == null ? other.getOperationStart() == null : this.getOperationStart().equals(other.getOperationStart()))
            && (this.getOperationEnd() == null ? other.getOperationEnd() == null : this.getOperationEnd().equals(other.getOperationEnd()))
            && (this.getOperationWork() == null ? other.getOperationWork() == null : this.getOperationWork().equals(other.getOperationWork()))
            && (this.getOperationSite() == null ? other.getOperationSite() == null : this.getOperationSite().equals(other.getOperationSite()))
            && (this.getAnesthesiaId() == null ? other.getAnesthesiaId() == null : this.getAnesthesiaId().equals(other.getAnesthesiaId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        result = prime * result + ((getOperationName() == null) ? 0 : getOperationName().hashCode());
        result = prime * result + ((getOperationTime() == null) ? 0 : getOperationTime().hashCode());
        result = prime * result + ((getOperationDepartment() == null) ? 0 : getOperationDepartment().hashCode());
        result = prime * result + ((getOperationStart() == null) ? 0 : getOperationStart().hashCode());
        result = prime * result + ((getOperationEnd() == null) ? 0 : getOperationEnd().hashCode());
        result = prime * result + ((getOperationWork() == null) ? 0 : getOperationWork().hashCode());
        result = prime * result + ((getOperationSite() == null) ? 0 : getOperationSite().hashCode());
        result = prime * result + ((getAnesthesiaId() == null) ? 0 : getAnesthesiaId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationId=").append(operationId);
        sb.append(", operationName=").append(operationName);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", operationDepartment=").append(operationDepartment);
        sb.append(", operationStart=").append(operationStart);
        sb.append(", operationEnd=").append(operationEnd);
        sb.append(", operationWork=").append(operationWork);
        sb.append(", operationSite=").append(operationSite);
        sb.append(", anesthesiaId=").append(anesthesiaId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}