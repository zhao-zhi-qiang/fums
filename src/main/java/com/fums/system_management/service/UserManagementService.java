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

public interface UserManagementService {

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

}
