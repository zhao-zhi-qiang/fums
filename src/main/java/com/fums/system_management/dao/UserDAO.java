package com.fums.system_management.dao;


import com.fums.system_management.pojo.HospitalDepartment;
import com.fums.system_management.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/8 0008 下午 2:03
 * Desc: 描述
 */
@Mapper
@Repository
public interface UserDAO {

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

    /*新增*/
    int insert(User user);


    void inserts(@Param("a")Integer a,@Param("b") Integer b);

    /*修改回显*/
//    User seleUpdate(Integer id);

    /*更新*/
//    int saveUpdata(User user);


}
