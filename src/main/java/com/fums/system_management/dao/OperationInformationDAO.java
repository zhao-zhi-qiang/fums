package com.fums.system_management.dao;

import com.fums.system_management.pojo.OperationInformation;
import org.springframework.stereotype.Repository;

/**
 * OperationInformationDAO继承基类
 */
@Repository
public interface OperationInformationDAO extends MyBatisBaseDao<OperationInformation, Integer> {
}