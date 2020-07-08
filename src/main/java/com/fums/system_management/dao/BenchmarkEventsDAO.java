package com.fums.system_management.dao;


import com.fums.system_management.pojo.BenchmarkEvents;
import org.springframework.stereotype.Repository;

/**
 * BenchmarkEventsDAO继承基类
 */
@Repository
public interface BenchmarkEventsDAO extends MyBatisBaseDao<BenchmarkEvents, Integer> {
}