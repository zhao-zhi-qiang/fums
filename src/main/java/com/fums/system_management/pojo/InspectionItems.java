package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * inspection_items
 * @author 
 */
public class InspectionItems implements Serializable {
    /**
     * 主键
     */
    private Integer proId;

    /**
     * 实验室检查id
     */
    private Integer laboratoryInspectionId;

    /**
     * 项目名称
     */
    private String projectName;

    /**
     * 单位
     */
    private Float unit;

    /**
     * 值
     */
    private Float range;

    /**
     * 首次（0：首次；1：末次；2：其他）
     */
    private Integer firstState;

    /**
     * 末次（0：首次；1：末次；2：其他）
     */
    private Integer lastState;

    private static final long serialVersionUID = 1L;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public Integer getLaboratoryInspectionId() {
        return laboratoryInspectionId;
    }

    public void setLaboratoryInspectionId(Integer laboratoryInspectionId) {
        this.laboratoryInspectionId = laboratoryInspectionId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Float getUnit() {
        return unit;
    }

    public void setUnit(Float unit) {
        this.unit = unit;
    }

    public Float getRange() {
        return range;
    }

    public void setRange(Float range) {
        this.range = range;
    }

    public Integer getFirstState() {
        return firstState;
    }

    public void setFirstState(Integer firstState) {
        this.firstState = firstState;
    }

    public Integer getLastState() {
        return lastState;
    }

    public void setLastState(Integer lastState) {
        this.lastState = lastState;
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
        InspectionItems other = (InspectionItems) that;
        return (this.getProId() == null ? other.getProId() == null : this.getProId().equals(other.getProId()))
            && (this.getLaboratoryInspectionId() == null ? other.getLaboratoryInspectionId() == null : this.getLaboratoryInspectionId().equals(other.getLaboratoryInspectionId()))
            && (this.getProjectName() == null ? other.getProjectName() == null : this.getProjectName().equals(other.getProjectName()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getRange() == null ? other.getRange() == null : this.getRange().equals(other.getRange()))
            && (this.getFirstState() == null ? other.getFirstState() == null : this.getFirstState().equals(other.getFirstState()))
            && (this.getLastState() == null ? other.getLastState() == null : this.getLastState().equals(other.getLastState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProId() == null) ? 0 : getProId().hashCode());
        result = prime * result + ((getLaboratoryInspectionId() == null) ? 0 : getLaboratoryInspectionId().hashCode());
        result = prime * result + ((getProjectName() == null) ? 0 : getProjectName().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getRange() == null) ? 0 : getRange().hashCode());
        result = prime * result + ((getFirstState() == null) ? 0 : getFirstState().hashCode());
        result = prime * result + ((getLastState() == null) ? 0 : getLastState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proId=").append(proId);
        sb.append(", laboratoryInspectionId=").append(laboratoryInspectionId);
        sb.append(", projectName=").append(projectName);
        sb.append(", unit=").append(unit);
        sb.append(", range=").append(range);
        sb.append(", firstState=").append(firstState);
        sb.append(", lastState=").append(lastState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}