package com.fums.system_management.dao;


import com.fums.system_management.pojo.FollowUpRules;
import org.springframework.stereotype.Repository;

/**
 * FollowUpRulesDAO继承基类
 */
@Repository
public interface FollowUpRulesDAO extends MyBatisBaseDao<FollowUpRules, Integer> {
}