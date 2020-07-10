package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.FilterEvents;
import org.springframework.stereotype.Repository;

/**
 * FilterEventsDAO继承基类
 */
@Repository
public interface FilterEventsDAO extends MyBatisBaseDao<FilterEvents, Integer> {
}