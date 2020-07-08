package com.fums.system_management.dao;

import com.fums.system_management.pojo.HospitalDepartment;
import org.springframework.stereotype.Repository;

/**
 * HospitalDepartmentDAO继承基类
 */
@Repository
public interface HospitalDepartmentDAO extends MyBatisBaseDao<HospitalDepartment, Integer> {
}