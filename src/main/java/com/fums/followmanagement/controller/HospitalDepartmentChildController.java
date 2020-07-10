package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.service.FollowManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/10
 * Desc: 描述
 */

@RestController
public class HospitalDepartmentChildController {

    @Autowired
    private FollowManagementService followManagementService;

    /**
     * 查询所有科室信息
     * @return
     */
    @RequestMapping(value = "findDepartmentAll")
    public String findDepartmentAll(){
        return JSON.toJSONString(followManagementService.findDepartmentAll());
    }
}
