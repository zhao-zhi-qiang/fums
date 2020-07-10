package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.PointOfTime;
import org.springframework.stereotype.Repository;

/**
 * PointOfTimeDAO继承基类
 */
@Repository
public interface PointOfTimeDAO extends MyBatisBaseDao<PointOfTime, Integer> {
}