package com.fums.followmanagement.pojo;

import java.util.Date;

public class HospitalUthority {
    private Integer hospitalUthorityId;

    private String hospitalUthorityName;

    private String hospitalUthorityCode;

    private Integer hospitalUthorityState;

    private Date hospitalUthorityCreateTime;

    private Date hospitalUthorityUpdateTime;

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
        this.hospitalUthorityName = hospitalUthorityName == null ? null : hospitalUthorityName.trim();
    }

    public String getHospitalUthorityCode() {
        return hospitalUthorityCode;
    }

    public void setHospitalUthorityCode(String hospitalUthorityCode) {
        this.hospitalUthorityCode = hospitalUthorityCode == null ? null : hospitalUthorityCode.trim();
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
}