package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.FollowPatient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface FollowPatientMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FollowPatient record);

    int insertSelective(FollowPatient record);

    FollowPatient selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FollowPatient record);

    int updateByPrimaryKey(FollowPatient record);
}