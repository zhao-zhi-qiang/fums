package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.HospitalUthority;

public interface HospitalUthorityMapper {
    int deleteByPrimaryKey(Integer hospitalUthorityId);

    int insert(HospitalUthority record);

    int insertSelective(HospitalUthority record);

    HospitalUthority selectByPrimaryKey(Integer hospitalUthorityId);

    int updateByPrimaryKeySelective(HospitalUthority record);

    int updateByPrimaryKey(HospitalUthority record);
}