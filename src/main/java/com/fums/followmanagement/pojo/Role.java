package com.fums.followmanagement.pojo;

import java.util.Date;
import java.util.List;

public class Role {
    private Integer id;

    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private Integer roleState;

    private Date roleCreateTime;

    private Date roleUpdateTime;

    private Power power;

    private List<Power> powerList;

    private List<RolePower> rolePowerList;

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public List<Power> getPowerList() {
        return powerList;
    }

    public void setPowerList(List<Power> powerList) {
        this.powerList = powerList;
    }

    public List<RolePower> getRolePowerList() {
        return rolePowerList;
    }

    public void setRolePowerList(List<RolePower> rolePowerList) {
        this.rolePowerList = rolePowerList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public Date getRoleUpdateTime() {
        return roleUpdateTime;
    }

    public void setRoleUpdateTime(Date roleUpdateTime) {
        this.roleUpdateTime = roleUpdateTime;
    }
}