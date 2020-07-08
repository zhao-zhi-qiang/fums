package com.fums.system_management.dao;


import com.fums.system_management.pojo.FollowUp;
import org.springframework.stereotype.Repository;

/**
 * FollowUpDAO继承基类
 */
@Repository
public interface FollowUpDAO extends MyBatisBaseDao<FollowUp, Integer> {
}