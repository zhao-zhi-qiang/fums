package com.fums.system_management.dao;


import com.fums.system_management.pojo.DataReview;
import org.springframework.stereotype.Repository;

/**
 * DataReviewDAO继承基类
 */
@Repository
public interface DataReviewDAO extends MyBatisBaseDao<DataReview, Integer> {
}