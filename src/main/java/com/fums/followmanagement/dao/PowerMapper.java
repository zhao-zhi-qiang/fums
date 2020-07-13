package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.Power;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface PowerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);

    List<Power> selectPowerAll();
}