package com.fums.template_setting.controller;

import com.alibaba.fastjson.JSON;
import com.fums.template_setting.pojo.Symptom;
import com.fums.template_setting.pojo.detail;
import com.fums.template_setting.service.treeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * @author: 赵林
 * @Date: 2020/6/29 11:41
 * @Description:
 */
@RestController
public class TreeController {
    @Autowired
    private treeService treeService;
    /**
     * 所有表内容
     */
    @RequestMapping(value = "/selectSymptom" ,produces = "application/json;charset=utf-8")
    public String selectSymptom(@RequestParam(value = "symId",required = false) Integer symId){
        if(symId!=null&&symId<=0){
            symId=null;
        }
        String result="";
        List<detail> details = treeService.selectSymptom(symId);
         result = JSON.toJSONString(details);
       return result;
    }
    /**
     * 症状表内容
     */
    @RequestMapping(value = "/selectSymptom2" ,produces = "application/json;charset=utf-8")
    public String selectSymptom2(){
        String result="";
        List<detail> details = treeService.selectSymptom2();
        result = JSON.toJSONString(details);
        return result;
    }
    /**
     * 症状表
     */
    @RequestMapping(value = "/queryid" ,produces = "application/json;charset=utf-8")
    public String queryid(){
        List<Symptom> queryid = treeService.queryid();
        String s = JSON.toJSONString(queryid);
        return s;
    }
    /**
     * 多id查询
     */
    @RequestMapping(value = "/selectMoreId" ,produces = "application/json;charset=utf-8")
    public String selectMoreId(@RequestParam("importId[]") Integer[] importId){
        List<Symptom> symptoms = treeService.selectMoreId(Arrays.asList(importId));
        String result = JSON.toJSONString(symptoms);
        return result;
    }
    /**
     * 添加至树节点
     */
    @RequestMapping(value = "/insertTree" ,produces = "application/json;charset=utf-8")
    public String insertTree(detail detail){
        int i = treeService.insertTree(detail);
        String s = JSON.toJSONString(i);
        return s;
    }
}
