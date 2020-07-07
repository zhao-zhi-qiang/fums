package com.fums.system_management.dao;

import com.fums.system_management.pojo.LaboratoryInspection;
import org.springframework.stereotype.Repository;

/**
 * LaboratoryInspectionDAO继承基类
 */
@Repository
public interface LaboratoryInspectionDAO extends MyBatisBaseDao<LaboratoryInspection, Integer> {
}