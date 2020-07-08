package com.fums.system_management.dao;

import com.fums.system_management.pojo.Patient;
import org.springframework.stereotype.Repository;

/**
 * PatientDAO继承基类
 */
@Repository
public interface PatientDAO extends MyBatisBaseDao<Patient, Integer> {
}