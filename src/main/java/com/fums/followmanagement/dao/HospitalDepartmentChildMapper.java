package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.HospitalDepartmentChild;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface HospitalDepartmentChildMapper {
    int deleteByPrimaryKey(Integer hospitalDepartmentChildId);

    int insert(HospitalDepartmentChild record);

    int insertSelective(HospitalDepartmentChild record);

    HospitalDepartmentChild selectByPrimaryKey(Integer hospitalDepartmentChildId);

    int updateByPrimaryKeySelective(HospitalDepartmentChild record);

    int updateByPrimaryKey(HospitalDepartmentChild record);

    /**
     * 查询所有科室信息
     * @return
     */
    List<HospitalDepartmentChild> selectDepartmentAll();
}