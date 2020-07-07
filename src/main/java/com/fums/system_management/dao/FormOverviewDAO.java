package com.fums.system_management.dao;


import com.fums.system_management.pojo.FormOverview;
import org.springframework.stereotype.Repository;

/**
 * FormOverviewDAO继承基类
 */
@Repository
public interface FormOverviewDAO extends MyBatisBaseDao<FormOverview, Integer> {
}