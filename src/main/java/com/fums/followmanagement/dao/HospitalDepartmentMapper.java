package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.HospitalDepartment;

public interface HospitalDepartmentMapper {
    int deleteByPrimaryKey(Integer hospitalDepartmentId);

    int insert(HospitalDepartment record);

    int insertSelective(HospitalDepartment record);

    HospitalDepartment selectByPrimaryKey(Integer hospitalDepartmentId);

    int updateByPrimaryKeySelective(HospitalDepartment record);

    int updateByPrimaryKey(HospitalDepartment record);
}