package com.fums.followupmanagement.dao;

import com.fums.pojo.HospitalDepartment;
import com.fums.pojo.HospitalDepartmentExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * HospitalDepartmentDAO继承基类
 */
@Repository
@Mapper
public interface HospitalDepartmentDAO extends MyBatisBaseDao<HospitalDepartment, Integer, HospitalDepartmentExample> {
}