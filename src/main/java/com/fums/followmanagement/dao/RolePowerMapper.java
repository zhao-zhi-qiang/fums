package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.RolePower;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface RolePowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePower record);

    int insertSelective(RolePower record);

    RolePower selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePower record);

    int updateByPrimaryKey(RolePower record);
}