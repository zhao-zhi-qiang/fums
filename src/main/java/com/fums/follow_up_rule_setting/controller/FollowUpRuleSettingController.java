package com.fums.follow_up_rule_setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FollowUpRuleSettingController {


    @RequestMapping("/advanced_search")
    public String advancedSearch(){
        return "follow_up_rule_setting/advanced_search";
    }

    @RequestMapping("/diagnosis_and_treatment_plan")
    public String diaganosisAndTreatmentPlan(){
        return "follow_up_rule_setting/diagnosis_and_treatment_plan";
    }


    @RequestMapping("/follow_up_rule_setting")
    public String followUpRuleSetting(){
        return "follow_up_rule_setting/follow_up_rule_setting";
    }

    @RequestMapping("/holiday_management")
    public String holidayManagemnet(){
        return "follow_up_rule_setting/holiday_management";
    }


}
