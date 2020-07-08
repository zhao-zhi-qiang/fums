package com.fums.followupmanagement.dao;

import com.fums.pojo.DataReview;
import com.fums.pojo.DataReviewExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * DataReviewDAO继承基类
 */
@Repository
@Mapper
public interface DataReviewDAO extends MyBatisBaseDao<DataReview, Integer, DataReviewExample> {
}