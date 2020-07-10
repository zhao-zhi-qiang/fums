package com.fums.followupmanagement.controller;

import com.fums.followupmanagement.service.FollowUpManagementService;
import com.fums.pojo.FollowPatient;
import com.fums.pojo.FollowUp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("followUpManagementController")
public class FollowUpManagementController {
    @Autowired
    FollowUpManagementService followUpManagementServiceImpl;
    @RequestMapping("findAllFollowUpManagement")
    public PageInfo findAllFollowUpManagement(FollowPatient followPatient, Integer pageNum,String setOfDate1,String setOfDate2, Integer[] list) throws ParseException {
        PageHelper.startPage(pageNum,5);
        List<FollowPatient> followPatientList = followUpManagementServiceImpl.findAllFollowUpManagement(followPatient,list,setOfDate1,setOfDate2);
        return new PageInfo(followPatientList);
    }
    @RequestMapping("findFollowUpGroupAndHospitalDepartment")
    public Map findFollowUpGroupAndHospitalDepartment(){
        return followUpManagementServiceImpl.findFollowUpGroupAndHospitalDepartment();
    }
}
