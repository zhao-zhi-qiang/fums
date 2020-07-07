package com.fums.system_management.dao;


import com.fums.system_management.pojo.FilterEvents;
import org.springframework.stereotype.Repository;

/**
 * FilterEventsDAO继承基类
 */
@Repository
public interface FilterEventsDAO extends MyBatisBaseDao<FilterEvents, Integer> {
}