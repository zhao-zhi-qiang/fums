package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * user
 * @author
 */
public class User implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String userAccount;

    /**
     * 用户账号
     */
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户性别
     */
    private String userSex;

    /**
     * 用户住址
     */
    private String userAddress;

    /**
     * 用户联系方式
     */
    private String userPhone;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 加密盐值
     */
    private String userSalt;

    /**
     * 用户状态
     */
    private Integer userState;

    /**
     * 科室下属科代号
     */
    private Integer hospitalDepartmentChildCode;

    /**
     * 用户创建时间
     */
    private Date userCreateTime;

    /*
     *引入科室名称
     *
     */
    private String hospitalDepartmentName;

    /**
     * 用户更新时间
     */
    private Date userUpdateTime;

    /*引入科室表*/
    private HospitalDepartment hospitalDepartment;

    private Integer hospitalDepartmentId;

    /*引入用户科室中间表*/
    private UserDepartment userDepartment;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", userAccount='" + userAccount + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userSex='" + userSex + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userSalt='" + userSalt + '\'' +
                ", userState=" + userState +
                ", hospitalDepartmentChildCode=" + hospitalDepartmentChildCode +
                ", userCreateTime=" + userCreateTime +
                ", hospitalDepartmentName='" + hospitalDepartmentName + '\'' +
                ", userUpdateTime=" + userUpdateTime +
                ", hospitalDepartment=" + hospitalDepartment +
                ", hospitalDepartmentId=" + hospitalDepartmentId +
                ", userDepartment=" + userDepartment +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt;
    }

    public Integer getUserState() {
        return userState;
    }

    public void setUserState(Integer userState) {
        this.userState = userState;
    }

    public Integer getHospitalDepartmentChildCode() {
        return hospitalDepartmentChildCode;
    }

    public void setHospitalDepartmentChildCode(Integer hospitalDepartmentChildCode) {
        this.hospitalDepartmentChildCode = hospitalDepartmentChildCode;
    }

    public Date getUserCreateTime() {
        return userCreateTime;
    }

    public void setUserCreateTime(Date userCreateTime) {
        this.userCreateTime = userCreateTime;
    }

    public String getHospitalDepartmentName() {
        return hospitalDepartmentName;
    }

    public void setHospitalDepartmentName(String hospitalDepartmentName) {
        this.hospitalDepartmentName = hospitalDepartmentName;
    }

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public HospitalDepartment getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(HospitalDepartment hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    public Integer getHospitalDepartmentId() {
        return hospitalDepartmentId;
    }

    public void setHospitalDepartmentId(Integer hospitalDepartmentId) {
        this.hospitalDepartmentId = hospitalDepartmentId;
    }

    public UserDepartment getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(UserDepartment userDepartment) {
        this.userDepartment = userDepartment;
    }
}