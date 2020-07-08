package com.fums.followmanagement.pojo;

public class HospitalDepartment {
    private Integer hospitalDepartmentId;

    private String hospitalDepartmentName;

    private Integer hospitalDepartmentState;

    private String hospitalDepartmentCode;

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
        this.hospitalDepartmentName = hospitalDepartmentName == null ? null : hospitalDepartmentName.trim();
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
        this.hospitalDepartmentCode = hospitalDepartmentCode == null ? null : hospitalDepartmentCode.trim();
    }
}