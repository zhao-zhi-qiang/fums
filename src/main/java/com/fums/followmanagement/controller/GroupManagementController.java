package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.pojo.FollowPatient;
import com.fums.followmanagement.pojo.Patient;
import com.fums.followmanagement.service.FollowManagementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/12
 * Desc: 单个随访组管理操作
 */
@RestController
public class GroupManagementController {
    //只需要加上下面这段即可，注意不能忘记注解
    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {

        //转换日期
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }

    @Autowired
    private FollowManagementService followManagementService;

    /**
     * 查询单个随访组内信息
     * @param pageNum
     * @param patientNumber
     * @param admissionNumber
     * @param setOfDate1
     * @param setOfDate2
     * @param sex
     * @param name
     * @return
     */
    @RequestMapping(value = "findPatientAndFollow",produces= {"application/json;charset=utf-8"})
    public String findPatientAndFollow(@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum,@RequestParam("patientNumber") String patientNumber, @RequestParam("admissionNumber") String admissionNumber, @RequestParam("setOfDate1") Date setOfDate1, @RequestParam("setOfDate2") Date setOfDate2, @RequestParam("sex") Integer sex, @RequestParam("name") String name){
        PageHelper.startPage(pageNum,7);
        List<Patient> patientAndFollow = followManagementService.findPatientAndFollow(patientNumber, admissionNumber, setOfDate1, setOfDate2, sex, name);
        PageInfo<Patient> pageInfo = new PageInfo<>(patientAndFollow);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 添加单个随访组内信息
     * @return
     */
    @RequestMapping(value = "addFollowPatient")
    public String addFollowPatient(Patient patient){
        return JSON.toJSONString(followManagementService.addFollowPatient(patient));
    }

    /**
     * 删除单个随访组内信息
     * @return
     */
    @RequestMapping(value = "removeFollowPatient")
    public String removeFollowPatient(Integer id){
        return JSON.toJSONString(followManagementService.removeFollowPatient(id));
    }

    /**
     * 编辑单个随访组内信息
     * @return
     */
    @RequestMapping(value = "editFollowPatient")
    public String editFollowPatient(FollowPatient patient){
        return JSON.toJSONString(followManagementService.editFollowPatient(patient));
    }

    /**
     * 验证单个随访组内属性信息
     * @return
     */
    @RequestMapping(value = "verificationGroupPropertity")
    public String verificationGroupPropertity(){
        return "";
    }
}
