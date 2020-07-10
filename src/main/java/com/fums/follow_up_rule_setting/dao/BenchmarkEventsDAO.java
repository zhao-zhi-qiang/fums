package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.BenchmarkEvents;
import org.springframework.stereotype.Repository;

/**
 * BenchmarkEventsDAO继承基类
 */
@Repository
public interface BenchmarkEventsDAO extends MyBatisBaseDao<BenchmarkEvents, Integer> {
}