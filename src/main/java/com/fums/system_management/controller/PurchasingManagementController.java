package com.fums.system_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PurchasingManagementController {

    /*
     *跳转到表单总览页面-
     */
    @RequestMapping("/system_form")
    public String systemForm() {
        return "page/system_management/system_form";
    }

    /*
     *跳转到用户管理页面-
     */
    @RequestMapping("/user_management")
    public String userManagement() {
        return "page/system_management/user_management";
    }


    /*
     *跳转到权限管理页面-standardtemplate
     */
    @RequestMapping("/authority_management")
    public String authorityManagement() {
        return "page/system_management/authority_management";
    }

    /*
     *跳转到标准化模板维护页面-classified_data
     */
    @RequestMapping("/standard_template")
    public String standardTemplate() {
        return "page/system_management/standard_template";
    }

    /*
     *跳转到分类数据项维护页面-
     */
    @RequestMapping("/classified_data")
    public String classifiedData() {
        return "page/system_management/classified_data";
    }

    /*
     *跳转到字典术语维护页面-
     */
    @RequestMapping("/dictionary_terms")
    public String dictionaryTerms() {
        return "page/system_management/dictionary_terms";
    }

}
