package com.fums.system_management.dao;

import com.fums.system_management.pojo.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDAO继承基类
 */
@Repository
public interface UserRoleDAO extends MyBatisBaseDao<UserRole, Integer> {
}