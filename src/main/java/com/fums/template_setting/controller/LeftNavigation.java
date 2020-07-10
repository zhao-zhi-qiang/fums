package com.fums.template_setting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: 赵林
 * @Date: 2020/6/5 10:45
 * @Description:
 */
@Controller
public class LeftNavigation {
    /**
     * tree
     * @return
     */
    @RequestMapping("/trees")
    public String tree() {
        return "page/template_settings/tree";
    }
    /**
     * 控件属性
     * @return
     */
    @RequestMapping("/controlproperties")
    public String control_properties() {
        return "page/template_settings/control_properties";
    }

    /**
     * 组合属性
     * @return
     */
    @RequestMapping("/combinationattribute")
    public String combinationattribute() {
        return "page/template_settings/combination_attribute";
    }
    /**
     * 自定义控件属性
     * @return
     */
    @RequestMapping("/custom")
    public String custom() {
        return "page/template_settings/custom";
    }
    /**
     * 模板编辑
     * @return
     */
    @RequestMapping("/term")
    public String term() {
        return "page/template_settings/term";
    }
    /**
     * 模板列表
     * @return
     */
    @RequestMapping("/templatelist")
    public String templatelist() {
        return "page/template_settings/template_list";
    }

    /**
     * 测试表
     * @return
     */
    @RequestMapping("/symptom")
    public String ss() {
        return "page/template_settings/symptom";
    }

    /**
     * js拖拽
     * @return
     */
    @RequestMapping("/dragdrop")
    public String index() {
        return "page/template_settings/drag_drop";
    }
    @RequestMapping("/jj")
    public String jj() {
        return "page/template_settings/jj";
    }
}
