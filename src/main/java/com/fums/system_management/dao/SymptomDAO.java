package com.fums.system_management.dao;

import com.fums.system_management.pojo.Symptom;
import org.springframework.stereotype.Repository;

/**
 * SymptomDAO继承基类
 */
@Repository
public interface SymptomDAO extends MyBatisBaseDao<Symptom, Integer> {
}