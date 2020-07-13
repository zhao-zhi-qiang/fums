package com.fums.followmanagement.controller;

import com.alibaba.fastjson.JSON;
import com.fums.followmanagement.pojo.Patient;
import com.fums.followmanagement.service.FollowManagementService;
import com.fums.followmanagement.util.ImportExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/12
 * Desc: 新建患者页面
 */

@RestController
public class CreatePatientsController {

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
     * 添加患者
     * @param patient
     * @return
     */
    @RequestMapping(value = "addPatient")
    public String addPatient(Patient patient){
        return JSON.toJSONString(followManagementService.addPatientInfo(patient));
    }

    /**
     * 批量添加患者,上传文件
     * @param file
     * @return
     */
    @RequestMapping(value = "uploadFile",produces= {"application/json;charset=utf-8"})
    public String addPatients(@RequestParam("file")MultipartFile file) throws IOException {
        String fileName = file.getOriginalFilename();
        String uname = fileName.substring(0,fileName.lastIndexOf("."));
        String newFileName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()) + fileName.substring(fileName.lastIndexOf("."));
        String path;
        if (newFileName.endsWith("doc") || newFileName.endsWith("docx")) {
            path = "G://upload/work/"+newFileName;
        }else if (newFileName.endsWith("xls") || newFileName.endsWith("xlsx")) {
            path = "G://upload/excel/"+newFileName;
            ImportExcel excel = new ImportExcel();
            List<List<Object>> lists = excel.readExcel(new File(path));
            List<Patient> patients = new ArrayList<>();
            for (int i = 0; i < lists.size()-1; i++) {
                Patient patient = new Patient();
                patient.setName(lists.get(i+1).get(1).toString());
                patient.setPatientNumber(lists.get(i+1).get(2).toString());
                patients.add(patient);
            }
            followManagementService.addPatientInfos(patients);
        }else {
            path = "G://upload/img/"+newFileName;
        }
        file.transferTo(new File(path));
        return "";
    }
}
