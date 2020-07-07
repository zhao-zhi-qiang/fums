package com.fums.system_management.dao;


import com.fums.system_management.pojo.HomeInformation;
import org.springframework.stereotype.Repository;

/**
 * HomeInformationDAO继承基类
 */
@Repository
public interface HomeInformationDAO extends MyBatisBaseDao<HomeInformation, Integer> {
}