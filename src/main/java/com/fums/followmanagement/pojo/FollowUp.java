package com.fums.followmanagement.pojo;

import java.util.Date;
public class FollowUp {
    private Integer followUpId;

    private Integer hospitalId;

    private String hospitalDepartmentChildCode;

    private String followUpPrincipal;

    private Integer followUpLevel;

    private String followUpName;

    private String userAccount;

    private Date followUpCreateTime;

    private String followUpPhone;

    private Integer followUpStatus;

    private Date followUpStartTime;

    private Date followUpEndTime;

    private String followUpCode;

    private Integer followUpPatientNumber;

    private String followUpControlGroup;

    private String followUpBackdrop;

    private String followUpGrate;

    private HospitalDepartmentChild hospitalDepartmentChild;

    public HospitalDepartmentChild getHospitalDepartmentChild() {
        return hospitalDepartmentChild;
    }

    public void setHospitalDepartmentChild(HospitalDepartmentChild hospitalDepartmentChild) {
        this.hospitalDepartmentChild = hospitalDepartmentChild;
    }

    public Integer getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(Integer followUpId) {
        this.followUpId = followUpId;
    }

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalDepartmentChildCode() {
        return hospitalDepartmentChildCode;
    }

    public void setHospitalDepartmentChildCode(String hospitalDepartmentChildCode) {
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode == null ? null : hospitalDepartmentChildCode.trim();
    }

    public String getFollowUpPrincipal() {
        return followUpPrincipal;
    }

    public void setFollowUpPrincipal(String followUpPrincipal) {
        this.followUpPrincipal = followUpPrincipal == null ? null : followUpPrincipal.trim();
    }

    public Integer getFollowUpLevel() {
        return followUpLevel;
    }

    public void setFollowUpLevel(Integer followUpLevel) {
        this.followUpLevel = followUpLevel;
    }

    public String getFollowUpName() {
        return followUpName;
    }

    public void setFollowUpName(String followUpName) {
        this.followUpName = followUpName == null ? null : followUpName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public Date getFollowUpCreateTime() {
        return followUpCreateTime;
    }

    public void setFollowUpCreateTime(Date followUpCreateTime) {
        this.followUpCreateTime = followUpCreateTime;
    }

    public String getFollowUpPhone() {
        return followUpPhone;
    }

    public void setFollowUpPhone(String followUpPhone) {
        this.followUpPhone = followUpPhone == null ? null : followUpPhone.trim();
    }

    public Integer getFollowUpStatus() {
        return followUpStatus;
    }

    public void setFollowUpStatus(Integer followUpStatus) {
        this.followUpStatus = followUpStatus;
    }

    public Date getFollowUpStartTime() {
        return followUpStartTime;
    }

    public void setFollowUpStartTime(Date followUpStartTime) {
        this.followUpStartTime = followUpStartTime;
    }

    public Date getFollowUpEndTime() {
        return followUpEndTime;
    }

    public void setFollowUpEndTime(Date followUpEndTime) {
        this.followUpEndTime = followUpEndTime;
    }

    public String getFollowUpCode() {
        return followUpCode;
    }

    public void setFollowUpCode(String followUpCode) {
        this.followUpCode = followUpCode == null ? null : followUpCode.trim();
    }

    public Integer getFollowUpPatientNumber() {
        return followUpPatientNumber;
    }

    public void setFollowUpPatientNumber(Integer followUpPatientNumber) {
        this.followUpPatientNumber = followUpPatientNumber;
    }

    public String getFollowUpControlGroup() {
        return followUpControlGroup;
    }

    public void setFollowUpControlGroup(String followUpControlGroup) {
        this.followUpControlGroup = followUpControlGroup == null ? null : followUpControlGroup.trim();
    }

    public String getFollowUpBackdrop() {
        return followUpBackdrop;
    }

    public void setFollowUpBackdrop(String followUpBackdrop) {
        this.followUpBackdrop = followUpBackdrop == null ? null : followUpBackdrop.trim();
    }

    public String getFollowUpGrate() {
        return followUpGrate;
    }

    public void setFollowUpGrate(String followUpGrate) {
        this.followUpGrate = followUpGrate == null ? null : followUpGrate.trim();
    }
}