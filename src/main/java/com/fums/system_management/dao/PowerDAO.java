package com.fums.system_management.dao;

import com.fums.system_management.pojo.Power;
import org.springframework.stereotype.Repository;

/**
 * PowerDAO继承基类
 */
@Repository
public interface PowerDAO extends MyBatisBaseDao<Power, Integer> {
}