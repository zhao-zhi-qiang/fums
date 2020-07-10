package com.fums.system_management.service.Impl;


import com.fums.system_management.dao.UserDAO;
import com.fums.system_management.pojo.HospitalDepartment;
import com.fums.system_management.pojo.User;
import com.fums.system_management.service.UserService;
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
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public List<User> selectAll(Integer userId, String userAccount, String userSex, String userPhone, String userEmail, String password, String hospitalDepartmentName) {
        return userDAO.selectAll(userId,userAccount,userSex,userPhone,userEmail,password,hospitalDepartmentName);
    }

    @Override
    public List<HospitalDepartment> seleDepartment() {
        return userDAO.seleDepartment();
    }

  @Override
    public int insert(User user) {
        return userDAO.insert(user);
    }


    @Override
    public void inserts(Integer a, Integer b) {
        userDAO.inserts(a,b);
    }

//    @Override
//    public User seleUpdate(Integer id) {
//        return userManagementDao.seleUpdate(id);
//    }

//    @Override
//    public int saveUpdata(User user) {
//        return userManagementDao.saveUpdata(user);
//    }
}
