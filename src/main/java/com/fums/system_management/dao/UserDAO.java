package com.fums.system_management.dao;

import com.fums.system_management.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * UserDAO继承基类
 */
@Repository
public interface UserDAO extends MyBatisBaseDao<User, User> {
}