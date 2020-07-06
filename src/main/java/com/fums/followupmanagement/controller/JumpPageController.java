package com.fums.followupmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/JumpPageController")
public class JumpPageController {
    @RequestMapping("/followUpManagement")
    public String followUpManagement(){
        return "page/followup_management/follow_up_management";
    }
    @RequestMapping("/dataReview")
    public String dataReview(){
        return "page/data_review/data_review";
    }
    @RequestMapping("/checkDetail")
    public String checkDetail(){
        return "page/data_review/check_detail";
    }
    @RequestMapping("/followUpPlan")
    public String followUpPlan(){
        return "page/patients_with_details/followUp_plan";
    }
}
