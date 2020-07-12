package com.fums.system_management.service;


import com.fums.system_management.pojo.HospitalDepartment;
import com.fums.system_management.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/8 0008 下午 3:00
 * Desc: 描述
 */

public interface UserService {

    /*条件查询加查询所有*/
    List<User> selectAll(@Param("userId") Integer userId,
                         @Param("userAccount") String userAccount,
                         @Param("userSex") String userSex,
                         @Param("userPhone") String userPhone,
                         @Param("userEmail") String userEmail,
                         @Param("password") String password,
                         @Param("hospitalDepartmentName") String hospitalDepartmentName);



    /**
     * 科室表
     * @return
     */
    List<HospitalDepartment> seleDepartment();

    /**
     * 用户表
     * @return
     */
    List<User> seleUser();

    /*新增*/
   int insert(User user);

    /*新增科室表*/
   void inserts(@Param("a") Integer a, @Param("b") Integer b);

    /*修改回显*/
    User seleUpdate(Integer id);

    /*更新*/
//    int saveUpdata(User user);

    /*批量删除*/
    boolean deleteALL(String[] ids);


    /*查询权限*/
    List<User> selectUser(@Param("hospitalDepartmentName") String hospitalDepartmentName,
                          @Param("userAccount") String userAccount);

    //登记页面删除
    int delete(Integer id);

    /*新增*/
    int insertUser(User user);

    void insertsUser(@Param("a")Integer a,@Param("b") Integer b);

    /*修改回显*/
    User UpdateUser(Integer id);

    /*更新*/
//    int saveUpdateUser(User user);

}
