package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * power
 * @author 
 */
public class Power implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 权限id
     */
    private Integer powerId;

    /**
     * 权限状态(0:正常 1:注销)
     */
    private Integer powerState;

    /**
     * 权限名称
     */
    private String powerName;

    /**
     * 权限描述
     */
    private String powerDesc;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPowerId() {
        return powerId;
    }

    public void setPowerId(Integer powerId) {
        this.powerId = powerId;
    }

    public Integer getPowerState() {
        return powerState;
    }

    public void setPowerState(Integer powerState) {
        this.powerState = powerState;
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName;
    }

    public String getPowerDesc() {
        return powerDesc;
    }

    public void setPowerDesc(String powerDesc) {
        this.powerDesc = powerDesc;
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
        Power other = (Power) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getPowerId() == null ? other.getPowerId() == null : this.getPowerId().equals(other.getPowerId()))
            && (this.getPowerState() == null ? other.getPowerState() == null : this.getPowerState().equals(other.getPowerState()))
            && (this.getPowerName() == null ? other.getPowerName() == null : this.getPowerName().equals(other.getPowerName()))
            && (this.getPowerDesc() == null ? other.getPowerDesc() == null : this.getPowerDesc().equals(other.getPowerDesc()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getPowerId() == null) ? 0 : getPowerId().hashCode());
        result = prime * result + ((getPowerState() == null) ? 0 : getPowerState().hashCode());
        result = prime * result + ((getPowerName() == null) ? 0 : getPowerName().hashCode());
        result = prime * result + ((getPowerDesc() == null) ? 0 : getPowerDesc().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", powerId=").append(powerId);
        sb.append(", powerState=").append(powerState);
        sb.append(", powerName=").append(powerName);
        sb.append(", powerDesc=").append(powerDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}