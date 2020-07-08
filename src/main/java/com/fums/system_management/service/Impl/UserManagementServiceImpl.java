package com.fums.system_management.service.Impl;

import com.fums.system_management.dao.UserManagementDao;
import com.fums.system_management.pojo.HospitalDepartment;
import com.fums.system_management.pojo.User;
import com.fums.system_management.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @outher: Huangdebao
 * @Date: 2020/7/8 0008 下午 3:01
 * Desc: 用户管理
 */
@Service
public class UserManagementServiceImpl implements UserManagementService {

    @Autowired
    UserManagementDao userManagementDao;

    @Override
    public List<User> selectAll(Integer userId, String userAccount, String userSex, String userPhone, String userEmail, String password, String hospitalDepartmentName) {
        return userManagementDao.selectAll(userId,userAccount,userSex,userPhone,userEmail,password,hospitalDepartmentName);
    }

    @Override
    public List<HospitalDepartment> seleDepartment() {
        return userManagementDao.seleDepartment();
    }
}
