package com.fums.system_management.dao;

import com.fums.system_management.pojo.DiagnosisAndTreatmentPlan;
import org.springframework.stereotype.Repository;

/**
 * DiagnosisAndTreatmentPlanDAO继承基类
 */
@Repository
public interface DiagnosisAndTreatmentPlanDAO extends MyBatisBaseDao<DiagnosisAndTreatmentPlan, Integer> {
}