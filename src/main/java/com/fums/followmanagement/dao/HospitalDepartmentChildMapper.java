package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.HospitalDepartmentChild;

public interface HospitalDepartmentChildMapper {
    int deleteByPrimaryKey(Integer hospitalDepartmentChildId);

    int insert(HospitalDepartmentChild record);

    int insertSelective(HospitalDepartmentChild record);

    HospitalDepartmentChild selectByPrimaryKey(Integer hospitalDepartmentChildId);

    int updateByPrimaryKeySelective(HospitalDepartmentChild record);

    int updateByPrimaryKey(HospitalDepartmentChild record);
}