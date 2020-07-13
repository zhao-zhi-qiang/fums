package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.pojo.User;
import com.fums.followmanagement.service.FollowManagementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/12
 * Desc: 权限管理页面
 */
@RestController
public class AuthorityManagementController {

    @Autowired
    private FollowManagementService followManagementService;

    /**
     * 查询所有用户和权限
     * @return
     */
    @RequestMapping(value = "findUserInfoAll",produces = {"application/json;charset=utf-8"})
    public String findUserInfoAll(@RequestParam("roleName") String roleName,@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum){
        PageHelper.startPage(pageNum,7);
        List<User> userInfoAll = followManagementService.findUserInfoAll(roleName);
        PageInfo<User> pageInfo = new PageInfo<>(userInfoAll);
        return JSON.toJSONString(pageInfo);
    }


    /**
     * 查询所有用户
     * @param userAccount
     * @param hospitalDepartmentChildName
     * @return
     */
    @RequestMapping(value = "findUserAll",produces = {"application/json;charset=utf-8"})
    public String findUserAll(@RequestParam("userAccount") String userAccount, @RequestParam("hospitalDepartmentChildName") String hospitalDepartmentChildName){
        List<User> userInfoAll = followManagementService.findUserAll(userAccount,hospitalDepartmentChildName);
        return JSON.toJSONString(userInfoAll);
    }

    /**
     * 添加所有用户和权限
     * @return
     */
    @RequestMapping(value = "addUserRole")
    public String addUserRole(){
        return "";
    }

    /**
     * 编辑所有用户和权限
     * @return
     */
    @RequestMapping(value = "editUserRole")
    public String editUserRole(){
        return "";
    }

    /**
     * 删除所有用户和权限
     * @return
     */
    @RequestMapping(value = "removeUserRole")
    public String removeUserRole(){
        return "";
    }

    /**
     * 用户授权
     * @return
     */
    @RequestMapping(value = "userAuthorization")
    public String userAuthorization(){
        return "";
    }


}
