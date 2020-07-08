package com.fums.system_management.dao;


import com.fums.system_management.pojo.FollowPatient;
import org.springframework.stereotype.Repository;

/**
 * FollowPatientDAO继承基类
 */
@Repository
public interface FollowPatientDAO extends MyBatisBaseDao<FollowPatient, Integer> {
}