package com.fums.followmanagement.service;

import com.fums.followmanagement.dao.FollowUpMapper;
import com.fums.followmanagement.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/8
 * Desc: 描述
 */
public interface FollowManagementService {

    /**
     * 验证随访组表单属性
     * @param followUpName
     * @param followUpCode
     * @param followUpBackdrop
     * @return
     */
    FollowUp verifyProperties(String followUpName,String followUpCode, String followUpBackdrop);

    /**
     * 查询所有随访组信息
     * @param followUpPrincipal
     * @param hospitalDepartmentChildName
     * @param followUpStatus
     * @param followUpCreateTime1
     * @param followUpCreateTime2
     * @return
     */
    List<FollowUp> findFollowUpAll(String followUpPrincipal,String hospitalDepartmentChildName,Integer followUpStatus,Date followUpCreateTime1,Date followUpCreateTime2);

    /**
     * 查询所有科室
     * @return
     */
    List<HospitalDepartmentChild> findDepartmentAll();

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
    List<Patient> findPatientAndFollow(String patientNumber, String admissionNumber,Date setOfDate1,Date setOfDate2,Integer sex,String name);

    /**
     * 查询所有用户角色
     * @param roleName
     * @return
     */
    List<User> findUserInfoAll(String roleName);

    /**
     * 条件查询所有用户
     * @param userAccount
     * @param hospitalDepartmentChildName
     * @return
     */
    List<User> findUserAll(String userAccount,String hospitalDepartmentChildName);

    /**
     * 条件查询所有疾病编码
     * @param id1
     * @param id2
     * @param jbmc00
     * @return
     */
    List<DiseaseCoding> findDiseaseCodingAll(Integer id1,Integer id2,String jbmc00);

    /**
     * 根据角色查询所有该角色用户
     * @param roleName
     * @return
     */
    List<User> findUserAllByRoleName(String roleName);

    /**
     * 添加随访组
     * @param followUp
     * @return
     */
    boolean addFollowUpInfo(FollowUp followUp);

    /**
     * 添加患者
     * @param patient
     * @return
     */
    boolean addPatientInfo(Patient patient);

    /**
     * 添加单个随访组信息
     * @param patient
     * @return
     */
    boolean addFollowPatient(Patient patient);
    /**
     * 批量添加患者
     * @param patient
     * @return
     */
    boolean addPatientInfos(List<Patient> patient);

    /**
     * 添加角色
     * @param role
     * @return
     */
    boolean addRoleInfo(Role role);

    /**
     * 删除随访组信息
     * @param followUpId
     * @return
     */
    boolean removeFollowUpInfo(Integer followUpId);

    /**
     * 编辑随访组信息
     * @param followUp
     * @return
     */
    boolean editFollowUpInfo(FollowUp followUp);

    /**
     * 编辑单个随访组内信息
     * @param patient
     * @return
     */
    boolean editFollowPatient(FollowPatient patient);

    /**
     * 删除单个随访组内信息
     * @param id
     * @return
     */
    boolean removeFollowPatient(Integer id);
}
