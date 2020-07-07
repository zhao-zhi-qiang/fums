package com.fums.system_management.dao;

import com.fums.system_management.pojo.PointOfTime;
import org.springframework.stereotype.Repository;

/**
 * PointOfTimeDAO继承基类
 */
@Repository
public interface PointOfTimeDAO extends MyBatisBaseDao<PointOfTime, Integer> {
}