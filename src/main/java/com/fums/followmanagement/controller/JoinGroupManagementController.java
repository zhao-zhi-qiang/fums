package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.service.FollowManagementService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/12
 * Desc: 入组管理
 */
@RestController
public class JoinGroupManagementController {

    @Autowired
    private FollowManagementService followManagementService;

    /**
     * 查询所有科室
     * @return
     */
    @RequestMapping(value = "findDepartmentsAll")
    public String findDepartmentsAll(){
        return JSON.toJSONString(followManagementService.findDepartmentAll());
    }

    /**
     * 查询所有疾病编码
     * @param id1
     * @param id2
     * @param jbmc00
     * @return
     */
    @RequestMapping(value = "findDiseaseCodingAll")
    public String findDiseaseCodingAll(@RequestParam("id1") Integer id1, @RequestParam("id2") Integer id2, @RequestParam("jbmc00") String jbmc00){
        return JSON.toJSONString(followManagementService.findDiseaseCodingAll(id1,id2,jbmc00));
    }

    /**
     * 根据角色查询所有该角色的用户
     * @param roleName
     * @return
     */
    @RequestMapping(value = "findUserAllByRoleName")
    public String findUserAllByRoleName(@RequestParam("roleName") String roleName){
        return JSON.toJSONString(followManagementService.findUserAllByRoleName(roleName));
    }

}
