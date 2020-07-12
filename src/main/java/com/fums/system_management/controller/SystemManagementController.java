package com.fums.system_management.controller;


import com.alibaba.fastjson.JSON;
import com.fums.system_management.pojo.HospitalDepartment;
import com.fums.system_management.pojo.User;
import com.fums.system_management.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/8 0008 下午 3:06
 * Desc: 描述
 */
@RestController
@RequestMapping("SystemManagementController")
public class SystemManagementController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping(value = "lists" , produces = "application/json;charset=utf-8")
    public String selectAll(Integer userId, String userAccount, String userSex,
                            String userPhone, String userEmail, String password,
                            String hospitalDepartmentName,
                            @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){

        PageHelper.startPage(pageNum,5);
        List<User> list1 = userService.selectAll(userId,userAccount,userSex,userPhone,userEmail,password,hospitalDepartmentName);

        PageInfo<User> pageInfo = new PageInfo<>(list1);

        return JSON.toJSONString(pageInfo);

    }


    /**
     * 科室表查询
     */
    @RequestMapping(value = "seleDepartment" ,produces = "application/json;charset=utf-8")
    public List<HospitalDepartment> seleDepartment(){
        List<HospitalDepartment> result = userService.seleDepartment();

        return result;
    }

    /**
     * 用户表查询
     */
    @RequestMapping(value = "seleUser" ,produces = "application/json;charset=utf-8")
    public List<User> seleUser(){

        List<User> result1 = userService.seleUser();

        return result1;
    }

    /**
     * 新增
     */

   @RequestMapping(value = "insert" ,produces = "application/json;charset=utf-8")
    public String inserts(User user,String hospitalDepartmentName){

        userService.insert(user);
        int a = user.getId();
        int b = Integer.parseInt(hospitalDepartmentName);

        userService.inserts(a,b);

        return null;
    }

    /**
     * 修改回显
     */
    @RequestMapping(value = "seleUpdate" ,produces = "application/json;charset=utf-8")
    public User seleUpdate(Integer id){

        User seleUpdate = userService.seleUpdate(id);

        return seleUpdate;
    }

    /**
     * 修改更新
     */
   /* @RequestMapping(value = "saveUpdate" ,produces = "application/json;charset=utf-8")
    public int saveUpdate(User user){

        int saveUpdate = userService.saveUpdata(user);

        return saveUpdate;
    }*/


    /*批量删除*/
    @ResponseBody
    @RequestMapping(value="deleteALL",produces={"application/json;charset=utf-8"})
    public String removeByKeys(@RequestParam(value = "list[]") String[] list){

        boolean result=userService.deleteALL(list);

        return JSON.toJSONString(result);
    }


    @ResponseBody
    @RequestMapping(value = "selectUser" , produces = "application/json;charset=utf-8")
    public String selectUser(String hospitalDepartmentName,String userAccount,
                             @RequestParam(value = "pageNum" ,defaultValue = "1",required = false) Integer pageNum){

        PageHelper.startPage(pageNum,5);
        List<User> listUser = userService.selectUser(userAccount,hospitalDepartmentName);

        PageInfo<User> pageInfo = new PageInfo<>(listUser);

        return JSON.toJSONString(pageInfo);
    }

    //案件登记页面删除
    @ResponseBody
    @RequestMapping(value = "ee" , produces = "application/json;charset=utf-8")
    public int delete(Integer id) {

        int ee1 = userService.delete(id);

        return ee1;
    }


    @RequestMapping(value = "insertUser" ,produces = "application/json;charset=utf-8")
    public String insertsUser(User user,String hospitalDepartmentName){

        userService.insertUser(user);
        int a = user.getId();
        int b = Integer.parseInt(hospitalDepartmentName);

        userService.insertsUser(a,b);

        return null;
    }


    /**
     * 修改回显
     */
    @RequestMapping(value = "UpdateUser" ,produces = "application/json;charset=utf-8")
    public User UpdateUser(Integer id){

        User UpdateUser = userService.UpdateUser(id);

        return UpdateUser;
    }

    /**
     * 修改更新
     */
   /* @RequestMapping(value = "saveUpdateUser" ,produces = "application/json;charset=utf-8")
    public int saveUpdateUser(User user){

        int saveUpdateUser = userService.saveUpdateUser(user);

        return saveUpdateUser;
    }*/


}
