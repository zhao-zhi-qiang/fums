package com.fums.followmanagement.controller;

import org.dom4j.io.SAXReader;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/6
 * Desc: 负责页面跳转
 */

@Controller
public class FollowManagementController {

    /**
     * 跳转随访组管理页面
     * @return
     */
    @RequestMapping(value = "/toGroupManagement")
    public String toGroupManagement(){
        return "page/grouping_management/group_management";
    }

    /**
     * 跳转单个随访组管理
     * @return
     */
    @RequestMapping(value = "/toFollowupManagement")
    public String toFollowupManagement(){
        return "page/followup_management/followup_management";
    }

    /**
     * 跳转入组管理页面
     * @return
     */
    @RequestMapping(value = "/toJoingroupManagement")
    public String toJoingroupManagement(){
        return "page/followup_management/joingroup_management";
    }

    /**
     * 跳转新建患者页面
     * @return
     */
    @RequestMapping(value = "toCreateNewpatient")
    public String toCreateNewpatient(){
        return "page/followup_management/create_newpatient";
    }

    /**
     * 跳转权限管理页面
     * @return
     */
    @RequestMapping(value = "toAuthorityManagement")
    public String toAuthorityManagement(){
        return "page/followup_management/authority_management";
    }

    /**
     * 按科室划分
     * @return
     */
    @RequestMapping(value = "accordingAdministrative")
    public String accordingAdministrative(){
        return "page/followup_management/joingroupmanagement/according_administrative";
    }

    /**
     * 按病种划分
     * @return
     */
    @RequestMapping(value = "accordingDisease")
    public String accordingDisease(){
        return "page/followup_management/joingroupmanagement/according_disease";
    }

    /**
     * 按照人员划分
     * @return
     */
    @RequestMapping(value = "accordingPerson")
    public String accordingPerson(){
        return "page/followup_management/joingroupmanagement/according_person";
    }

    /**
     * 按结果集划分
     * @return
     */
    @RequestMapping(value = "accordingResult")
    public String accordingResult(){
        return "page/followup_management/joingroupmanagement/according_result";
    }

    /**
     * 按自定义条件划分
     * @return
     */
    @RequestMapping(value = "customCondition")
    public String customCondition(){
        return "page/followup_management/joingroupmanagement/custom_condition";
    }

    /**
     * 跳转入组时间页面
     * @return
     */
    @RequestMapping(value = "joinGroupTime")
    public String joinGroupTime(){
        return "page/followup_management/joingroupmanagement/join_group_time";
    }

    /**
     * 设定权限
     * @return
     */
    @RequestMapping(value = "setPermissions")
    public String setPermissions(){
        return "page/followup_management/joingroupmanagement/set_permissions";
    }

    /**
     * 设定用户
     * @return
     */
    @RequestMapping(value = "setUser")
    public String setUser(){
        return "page/followup_management/joingroupmanagement/set_user";
    }
}
