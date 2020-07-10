package com.fums.followupmanagement.dao;

import com.fums.pojo.FollowUp;
import com.fums.pojo.FollowUpExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * FollowUpDAO继承基类
 */
@Repository
@Mapper
public interface FollowUpDAO extends MyBatisBaseDao<FollowUp, Integer, FollowUpExample> {
}