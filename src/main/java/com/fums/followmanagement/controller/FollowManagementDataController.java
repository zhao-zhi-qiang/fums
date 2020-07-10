package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.pojo.FollowUp;
import com.fums.followmanagement.service.FollowManagementService;
import com.fums.followupmanagement.service.FollowUpManagementService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/6
 * Desc: 负责页面数据注入
 */

@RestController
public class FollowManagementDataController {

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
     * 查询所有随访组信息并且分页
     * @param pageNum
     * @param followUpPrincipal
     * @param hospitalDepartmentChildName
     * @param followUpStatus
     * @param followUpCreateTime1
     * @param followUpCreateTime2
     * @return
     */
    @RequestMapping(value = "findFollowManagementAll",produces= {"application/json;charset=utf-8"})
    public String findFollowManagementAll(@RequestParam(value="pageNum",required = false,defaultValue="1") Integer pageNum,@RequestParam("followUpPrincipal") String followUpPrincipal, @RequestParam("hospitalDepartmentChildName") String hospitalDepartmentChildName, @RequestParam("followUpStatus") Integer followUpStatus, @RequestParam("followUpCreateTime1") Date followUpCreateTime1, @RequestParam("followUpCreateTime2") Date followUpCreateTime2){
        List<FollowUp> followUpAll = followManagementService.findFollowUpAll(followUpPrincipal, hospitalDepartmentChildName, followUpStatus,followUpCreateTime1,followUpCreateTime2);
        PageHelper.startPage(pageNum,7);
        PageInfo<FollowUp> pageInfo = new PageInfo<>(followUpAll);
        return JSON.toJSONString(pageInfo);
    }

    /**
     * 添加随访组信息
     * @param followUp
     * @return
     */
    @RequestMapping(value = "addFollowUpInfo")
    public String addFollowUpInfo(FollowUp followUp){
        return JSON.toJSONString(followManagementService.addFollowUpInfo(followUp));
    }

    /**
     * 修改随访组信息
     * @param followUp
     * @return
     */
    @RequestMapping(value = "editFollowUpInfo")
    public String editFollowUpInfo(FollowUp followUp){
        return JSON.toJSONString(followManagementService.editFollowUpInfo(followUp));
    }

    /**
     * 删除随访组信息
     * @param followUpId
     * @return
     */
    @RequestMapping(value = "removeFollowUpInfo")
    public String removeFollowUpInfo(Integer followUpId){
        return JSON.toJSONString(followManagementService.removeFollowUpInfo(followUpId));
    }

    /**
     * 验证随访组表单属性
     * @param followUpName
     * @param followUpCode
     * @param followUpBackdrop
     * @return
     */
    @RequestMapping(value = "verifyProperties")
    public String findRoleProperty(@RequestParam("followUpName") String followUpName,@RequestParam("followUpCode") String followUpCode,@RequestParam("followUpBackdrop") String followUpBackdrop){
        FollowUp followUp = followManagementService.verifyProperties(followUpName, followUpCode, followUpBackdrop);
        if (followUp == null) {
            return JSON.toJSONString(true);
        }else {
            return JSON.toJSONString(false);
        }
    }

}

