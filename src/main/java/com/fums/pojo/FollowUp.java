package com.fums.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * follow_up
 * @author 
 */
public class FollowUp implements Serializable {
    /**
     * 组id
     */
    private Integer followUpId;

    /**
     * 医院id
     */
    private Integer hospitalId;

    /**
     * 科室下属科代号
     */
    private Integer hospitalDepartmentChildCode;

    /**
     * 负责人
     */
    private String followUpPrincipal;

    /**
     * 级别(0:一级 1:二级 2:三级)
     */
    private Integer followUpLevel;

    /**
     * 随访组名称
     */
    private String followUpName;

    /**
     * 创建人(隐藏)
     */
    private String userAccount;

    /**
     * 创建时间(隐藏)
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date followUpCreateTime;

    /**
     * 联系方式
     */
    private String followUpPhone;

    /**
     * 状态(0:正常 1:关闭)
     */
    private Integer followUpStatus;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date followUpStartTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date followUpEndTime;

    /**
     * 课题编号
     */
    private String followUpCode;

    /**
     * 患者数量
     */
    private Integer followUpPatientNumber;

    /**
     * 对照组
     */
    private String followUpControlGroup;

    /**
     * 背景
     */
    private String followUpBackdrop;

    private static final long serialVersionUID = 1L;

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

    public Integer getHospitalDepartmentChildCode() {
        return hospitalDepartmentChildCode;
    }

    public void setHospitalDepartmentChildCode(Integer hospitalDepartmentChildCode) {
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode;
    }

    public String getFollowUpPrincipal() {
        return followUpPrincipal;
    }

    public void setFollowUpPrincipal(String followUpPrincipal) {
        this.followUpPrincipal = followUpPrincipal;
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
        this.followUpName = followUpName;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
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
        this.followUpPhone = followUpPhone;
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
        this.followUpCode = followUpCode;
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
        this.followUpControlGroup = followUpControlGroup;
    }

    public String getFollowUpBackdrop() {
        return followUpBackdrop;
    }

    public void setFollowUpBackdrop(String followUpBackdrop) {
        this.followUpBackdrop = followUpBackdrop;
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
        FollowUp other = (FollowUp) that;
        return (this.getFollowUpId() == null ? other.getFollowUpId() == null : this.getFollowUpId().equals(other.getFollowUpId()))
            && (this.getHospitalId() == null ? other.getHospitalId() == null : this.getHospitalId().equals(other.getHospitalId()))
            && (this.getHospitalDepartmentChildCode() == null ? other.getHospitalDepartmentChildCode() == null : this.getHospitalDepartmentChildCode().equals(other.getHospitalDepartmentChildCode()))
            && (this.getFollowUpPrincipal() == null ? other.getFollowUpPrincipal() == null : this.getFollowUpPrincipal().equals(other.getFollowUpPrincipal()))
            && (this.getFollowUpLevel() == null ? other.getFollowUpLevel() == null : this.getFollowUpLevel().equals(other.getFollowUpLevel()))
            && (this.getFollowUpName() == null ? other.getFollowUpName() == null : this.getFollowUpName().equals(other.getFollowUpName()))
            && (this.getUserAccount() == null ? other.getUserAccount() == null : this.getUserAccount().equals(other.getUserAccount()))
            && (this.getFollowUpCreateTime() == null ? other.getFollowUpCreateTime() == null : this.getFollowUpCreateTime().equals(other.getFollowUpCreateTime()))
            && (this.getFollowUpPhone() == null ? other.getFollowUpPhone() == null : this.getFollowUpPhone().equals(other.getFollowUpPhone()))
            && (this.getFollowUpStatus() == null ? other.getFollowUpStatus() == null : this.getFollowUpStatus().equals(other.getFollowUpStatus()))
            && (this.getFollowUpStartTime() == null ? other.getFollowUpStartTime() == null : this.getFollowUpStartTime().equals(other.getFollowUpStartTime()))
            && (this.getFollowUpEndTime() == null ? other.getFollowUpEndTime() == null : this.getFollowUpEndTime().equals(other.getFollowUpEndTime()))
            && (this.getFollowUpCode() == null ? other.getFollowUpCode() == null : this.getFollowUpCode().equals(other.getFollowUpCode()))
            && (this.getFollowUpPatientNumber() == null ? other.getFollowUpPatientNumber() == null : this.getFollowUpPatientNumber().equals(other.getFollowUpPatientNumber()))
            && (this.getFollowUpControlGroup() == null ? other.getFollowUpControlGroup() == null : this.getFollowUpControlGroup().equals(other.getFollowUpControlGroup()))
            && (this.getFollowUpBackdrop() == null ? other.getFollowUpBackdrop() == null : this.getFollowUpBackdrop().equals(other.getFollowUpBackdrop()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFollowUpId() == null) ? 0 : getFollowUpId().hashCode());
        result = prime * result + ((getHospitalId() == null) ? 0 : getHospitalId().hashCode());
        result = prime * result + ((getHospitalDepartmentChildCode() == null) ? 0 : getHospitalDepartmentChildCode().hashCode());
        result = prime * result + ((getFollowUpPrincipal() == null) ? 0 : getFollowUpPrincipal().hashCode());
        result = prime * result + ((getFollowUpLevel() == null) ? 0 : getFollowUpLevel().hashCode());
        result = prime * result + ((getFollowUpName() == null) ? 0 : getFollowUpName().hashCode());
        result = prime * result + ((getUserAccount() == null) ? 0 : getUserAccount().hashCode());
        result = prime * result + ((getFollowUpCreateTime() == null) ? 0 : getFollowUpCreateTime().hashCode());
        result = prime * result + ((getFollowUpPhone() == null) ? 0 : getFollowUpPhone().hashCode());
        result = prime * result + ((getFollowUpStatus() == null) ? 0 : getFollowUpStatus().hashCode());
        result = prime * result + ((getFollowUpStartTime() == null) ? 0 : getFollowUpStartTime().hashCode());
        result = prime * result + ((getFollowUpEndTime() == null) ? 0 : getFollowUpEndTime().hashCode());
        result = prime * result + ((getFollowUpCode() == null) ? 0 : getFollowUpCode().hashCode());
        result = prime * result + ((getFollowUpPatientNumber() == null) ? 0 : getFollowUpPatientNumber().hashCode());
        result = prime * result + ((getFollowUpControlGroup() == null) ? 0 : getFollowUpControlGroup().hashCode());
        result = prime * result + ((getFollowUpBackdrop() == null) ? 0 : getFollowUpBackdrop().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", followUpId=").append(followUpId);
        sb.append(", hospitalId=").append(hospitalId);
        sb.append(", hospitalDepartmentChildCode=").append(hospitalDepartmentChildCode);
        sb.append(", followUpPrincipal=").append(followUpPrincipal);
        sb.append(", followUpLevel=").append(followUpLevel);
        sb.append(", followUpName=").append(followUpName);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", followUpCreateTime=").append(followUpCreateTime);
        sb.append(", followUpPhone=").append(followUpPhone);
        sb.append(", followUpStatus=").append(followUpStatus);
        sb.append(", followUpStartTime=").append(followUpStartTime);
        sb.append(", followUpEndTime=").append(followUpEndTime);
        sb.append(", followUpCode=").append(followUpCode);
        sb.append(", followUpPatientNumber=").append(followUpPatientNumber);
        sb.append(", followUpControlGroup=").append(followUpControlGroup);
        sb.append(", followUpBackdrop=").append(followUpBackdrop);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}