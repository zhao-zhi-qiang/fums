package com.fums.followmanagement.service.impl;

import com.fums.followmanagement.dao.*;
import com.fums.followmanagement.pojo.*;
import com.fums.followmanagement.service.FollowManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: zhaozhiqiang
 * Date: 2020/7/8
 * Desc: 描述
 */

@Service
@Transactional
public class FollowManagementServiceImpl implements FollowManagementService{

    @Autowired
    private FollowUpMapper followUpMapper;

    @Autowired
    private PatientMapper patientMapper;

    @Autowired
    private FollowPatientMapper followPatientMapper;

    @Autowired
    private UserMapper userMapper ;

    @Autowired
    private HospitalDepartmentChildMapper hospitalDepartmentChildMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PowerMapper powerMapper;

    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private RolePowerMapper rolePowerMapper;

    @Autowired
    private DiseaseCodingMapper diseaseCodingMapper;

    /**
     * 验证随访组表单属性
     * @param followUpName
     * @param followUpCode
     * @param followUpBackdrop
     * @return
     */
    @Override
    public FollowUp verifyProperties(String followUpName, String followUpCode, String followUpBackdrop) {
        return followUpMapper.verifyProperties(followUpName,followUpCode,followUpBackdrop);
    }

    /**
     * 查询所有随访组信息
     * @param followUpPrincipal
     * @param hospitalDepartmentChildName
     * @param followUpStatus
     * @param followUpCreateTime1
     * @param followUpCreateTime2
     * @return
     */
    @Override
    public List<FollowUp> findFollowUpAll(String followUpPrincipal, String hospitalDepartmentChildName, Integer followUpStatus, Date followUpCreateTime1,Date followUpCreateTime2) {
        return followUpMapper.selectFollowUpAll(hospitalDepartmentChildName,followUpPrincipal,followUpStatus,followUpCreateTime1,followUpCreateTime2);
    }

    /**
     * 查询所有科室信息
     * @return
     */
    @Override
    public List<HospitalDepartmentChild> findDepartmentAll() {
        return hospitalDepartmentChildMapper.selectDepartmentAll();
    }

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
    @Override
    public List<Patient> findPatientAndFollow(String patientNumber, String admissionNumber, Date setOfDate1, Date setOfDate2, Integer sex, String name) {
        return patientMapper.selectPatientAndFollow(patientNumber,admissionNumber,setOfDate1,setOfDate2,sex,name);
    }

    /**
     * 查询所有用户角色信息
     * @param roleName
     * @return
     */
    @Override
    public List<User> findUserInfoAll(String roleName) {
        return userMapper.selectUserInfoAll(roleName);
    }

    /**
     * 条件查询所有用户
     * @param userAccount
     * @param hospitalDepartmentChildName
     * @return
     */
    @Override
    public List<User> findUserAll(String userAccount, String hospitalDepartmentChildName) {
        return userMapper.selectUserAll(userAccount,hospitalDepartmentChildName);
    }

    /**
     * 条件查询所有疾病编码
     * @param id1
     * @param id2
     * @param jbmc00
     * @return
     */
    @Override
    public List<DiseaseCoding> findDiseaseCodingAll(Integer id1, Integer id2, String jbmc00) {
        return diseaseCodingMapper.selectDiseaseCodingAll(id1,id2,jbmc00);
    }

    /**
     * 通过角色查询所有该角色用户
     * @param roleName
     * @return
     */
    @Override
    public List<User> findUserAllByRoleName(String roleName) {
        return userMapper.selectUserAllByRoleName(roleName);
    }

    /**
     * 添加随访组信息
     * @param followUp
     * @return
     */
    @Override
    public boolean addFollowUpInfo(FollowUp followUp) {
        int i= followUpMapper.insertSelective(followUp);
        FollowUp followUp1 = new FollowUp();
        if (i > 1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 添加患者
     * @param patient
     * @return
     */
    @Override
    public boolean addPatientInfo(Patient patient) {
        int i = patientMapper.insert(patient);
        if (i > 1){
            return  true;
        }else{
            return false;
        }
    }

    /**
     * 添加单个随访组信息
     * @param patient
     * @return
     */
    @Override
    public boolean addFollowPatient(Patient patient) {
        FollowPatient followPatient = new FollowPatient();
        followPatient.setPatientId(patient.getPatientId());
        followPatient.setSetOfDate(patient.getFollowPatient().getSetOfDate());
        int i = followPatientMapper.insert(followPatient);
        patientMapper.insertSelective(patient);
        if (i > 1){
            return  true;
        }else{
            return false;
        }
    }

    /**
     * 批量添加患者
     * @param patient
     * @return
     */
    @Override
    public boolean addPatientInfos(List<Patient> patient) {
        int i = patientMapper.inserts(patient);
        if (i > 1){
            return  true;
        }else{
            return false;
        }
    }

    /**
     * 添加单个随访组信息
     * @param role
     * @return
     */
    @Override
    public boolean addRoleInfo(Role role) {
        int i = roleMapper.insert(role);
        UserRole userRole = new UserRole();
        userRole.setRoleId(role.getRoleId());
        userRoleMapper.insert(userRole);
        return false;
    }

    /**
     * 删除随访组信息
     * @param followUpId
     * @return
     */
    @Override
    public boolean removeFollowUpInfo(Integer followUpId) {
        int i = followUpMapper.deleteByPrimaryKey(followUpId);
        if (i >1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 修改随访组信息
     * @param followUp
     * @return
     */
    @Override
    public boolean editFollowUpInfo(FollowUp followUp) {
        int i = followUpMapper.updateByPrimaryKey(followUp);
        if (i > 1){
            return true;
        }else {
            return false;
        }
    }

    /**
     * 编辑单个随访组信息
     * @param patient
     * @return
     */
    @Override
    public boolean editFollowPatient(FollowPatient patient) {
        int i  = followPatientMapper.updateByPrimaryKeySelective(patient);
        if (i > 0){
            return true;
        }else{
            return false;
        }
    }

    /**
     * 删除单个随访组信息
     * @param id
     * @return
     */
    @Override
    public boolean removeFollowPatient(Integer id) {
        int i = followPatientMapper.deleteByPrimaryKey(id);
        if (i > 0){
            return true;
        }else{
            return false;
        }
    }
}
