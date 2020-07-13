package com.fums.followmanagement.pojo;

public class Power {
    private Integer id;

    private Integer powerId;

    private Integer powerState;

    private String powerName;

    private String powerDesc;

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
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerDesc() {
        return powerDesc;
    }

    public void setPowerDesc(String powerDesc) {
        this.powerDesc = powerDesc == null ? null : powerDesc.trim();
    }
}