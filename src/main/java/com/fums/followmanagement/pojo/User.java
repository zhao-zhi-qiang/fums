package com.fums.followmanagement.pojo;

import java.util.Date;
import java.util.List;

public class User {
    private Integer id;

    private Integer userId;

    private String userAccount;

    private String userName;

    private String password;

    private String userSex;

    private String userAddress;

    private String userPhone;

    private String userEmail;

    private String userSalt;

    private Integer userState;

    private Integer hospitalDepartmentChildCode;

    private Date userCreateTime;

    private Date userUpdateTime;

    private Role role;

    private UserRole userRole;

    private Power power;

    private RolePower rolePower;

    private List<Role> roleList;

    private List<Power> powerList;

    private List<UserRole> userRoleList;

    private HospitalDepartmentChild hospitalDepartmentChild;

    public HospitalDepartmentChild getHospitalDepartmentChild() {
        return hospitalDepartmentChild;
    }

    public void setHospitalDepartmentChild(HospitalDepartmentChild hospitalDepartmentChild) {
        this.hospitalDepartmentChild = hospitalDepartmentChild;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public RolePower getRolePower() {
        return rolePower;
    }

    public void setRolePower(RolePower rolePower) {
        this.rolePower = rolePower;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Power> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<Power> powerList) {
        this.powerList = powerList;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
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
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserSalt() {
        return userSalt;
    }

    public void setUserSalt(String userSalt) {
        this.userSalt = userSalt == null ? null : userSalt.trim();
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

    public Date getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(Date userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }
}