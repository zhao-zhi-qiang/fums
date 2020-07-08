package com.fums.followupmanagement.controller;

import com.fums.followupmanagement.service.FollowUpManagementService;
import com.fums.pojo.FollowPatient;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("followUpManagementController")
public class FollowUpManagementController {
    @Autowired
    FollowUpManagementService followUpManagementServiceImpl;
    @RequestMapping("findAllFollowUpManagement")
    public PageInfo findAllFollowUpManagement(FollowPatient followPatient, Integer pageNum,Integer[] list){
        PageHelper.startPage(pageNum,5);
        List<FollowPatient> followPatientList = followUpManagementServiceImpl.findAllFollowUpManagement(followPatient,list);
        return new PageInfo(followPatientList);
    }
}
