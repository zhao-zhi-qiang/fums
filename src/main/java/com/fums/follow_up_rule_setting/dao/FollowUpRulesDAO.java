package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.FollowUpRules;
import org.springframework.stereotype.Repository;

/**
 * FollowUpRulesDAO继承基类
 */
@Repository
public interface FollowUpRulesDAO extends MyBatisBaseDao<FollowUpRules, Integer> {
}