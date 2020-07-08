package com.fums.system_management.dao;


import com.fums.system_management.pojo.HospitalUthority;
import org.springframework.stereotype.Repository;

/**
 * HospitalUthorityDAO继承基类
 */
@Repository
public interface HospitalUthorityDAO extends MyBatisBaseDao<HospitalUthority, Integer> {
}