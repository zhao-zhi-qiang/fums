package com.fums.followmanagement.service.impl;

import com.fums.followmanagement.dao.FollowUpMapper;
import com.fums.followmanagement.dao.HospitalDepartmentChildMapper;
import com.fums.followmanagement.pojo.FollowUp;
import com.fums.followmanagement.pojo.HospitalDepartmentChild;
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
    private HospitalDepartmentChildMapper hospitalDepartmentChildMapper;
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
     * 添加随访组信息
     * @param followUp
     * @return
     */
    @Override
    public boolean addFollowUpInfo(FollowUp followUp) {
        int i= followUpMapper.insert(followUp);
        if (i > 1){
            return true;
        }else {
            return false;
        }
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
}
