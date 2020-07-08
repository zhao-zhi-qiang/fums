package com.fums.followmanagement.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/6
 * Desc: 负责页面数据注入
 */

@RestController
public class FollowManagementDataController {

    /**
     * 查询所有随访组信息并且分页
     * @param model
     * @param pageNum
     * @return
     */
    @RequestMapping(value = "findFollowManagementAll")
    public String findFollowManagementAll(Model model,Integer pageNum){
        return "";
    }
}
