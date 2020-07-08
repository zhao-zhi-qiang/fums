package com.fums.followmanagement.pojo;

public class HospitalDepartmentChild {
    private Integer hospitalDepartmentChildId;

    private String hospitalDepartmentChildName;

    private Integer hospitalDepartmentChildState;

    private String hospitalDepartmentChildCode;

    private String hospitalDepartmentCode;

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
        this.hospitalDepartmentChildName = hospitalDepartmentChildName == null ? null : hospitalDepartmentChildName.trim();
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
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode == null ? null : hospitalDepartmentChildCode.trim();
    }

    public String getHospitalDepartmentCode() {
        return hospitalDepartmentCode;
    }

    public void setHospitalDepartmentCode(String hospitalDepartmentCode) {
        this.hospitalDepartmentCode = hospitalDepartmentCode == null ? null : hospitalDepartmentCode.trim();
    }
}