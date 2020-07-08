package com.fums.system_management.dao;


import com.fums.system_management.pojo.DiseaseCoding;
import org.springframework.stereotype.Repository;

/**
 * DiseaseCodingDAO继承基类
 */
@Repository
public interface DiseaseCodingDAO extends MyBatisBaseDao<DiseaseCoding, DiseaseCoding> {
}