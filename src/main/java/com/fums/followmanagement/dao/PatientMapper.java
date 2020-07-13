package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Mapper
@Component
public interface PatientMapper {
    int deleteByPrimaryKey(Integer patientId);

    int insert(Patient record);

    int insertSelective(Patient record);

    Patient selectByPrimaryKey(Integer patientId);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);

    /**
     * 批量插入
     * @param patient
     * @return
     */
    int inserts(List<Patient> patient);

    /**
     * 查询单个随访组所有信息
     * @param patientNumber
     * @param admissionNumber
     * @param setOfDate1
     * @param setOfDate2
     * @param sex
     * @param name
     * @return
     */
    List<Patient> selectPatientAndFollow(@Param("patientNumber") String patientNumber, @Param("admissionNumber") String admissionNumber, @Param("setOfDate1")Date setOfDate1,@Param("setOfDate2") Date setOfDate2,@Param("sex") Integer sex,@Param("name") String name);
}