package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.DiagnosisAndTreatmentPlan;
import org.springframework.stereotype.Repository;

/**
 * DiagnosisAndTreatmentPlanDAO继承基类
 */
@Repository
public interface DiagnosisAndTreatmentPlanDAO extends MyBatisBaseDao<DiagnosisAndTreatmentPlan, Integer> {
}