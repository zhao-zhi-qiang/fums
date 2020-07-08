package com.fums.followupmanagement.dao;

import com.fums.pojo.FollowPatient;
import com.fums.pojo.FollowPatientExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * FollowPatientDAO继承基类
 */
@Repository
@Mapper
public interface FollowPatientDAO extends MyBatisBaseDao<FollowPatient, Integer, FollowPatientExample> {
}