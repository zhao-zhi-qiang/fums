package com.fums.system_management.dao;

import com.fums.system_management.pojo.AnesthesiaInformation;
import org.springframework.stereotype.Repository;

/**
 * AnesthesiaInformationDAO继承基类
 */
@Repository
public interface AnesthesiaInformationDAO extends MyBatisBaseDao<AnesthesiaInformation, Integer> {
}