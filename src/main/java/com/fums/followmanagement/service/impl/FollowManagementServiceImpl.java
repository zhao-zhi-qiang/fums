package com.fums.followmanagement.service.impl;

import com.fums.followmanagement.dao.FollowUpMapper;
import com.fums.followmanagement.pojo.FollowUp;
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
     * @param hospitalDepartmentChildCode
     * @param followUpStatus
     * @param followUpCreateTime
     * @return
     */
    @Override
    public List<FollowUp> findFollowUpAll(String followUpPrincipal, String hospitalDepartmentChildCode, Integer followUpStatus, Date followUpCreateTime) {
        return followUpMapper.selectFollowUpAll(followUpPrincipal,followUpPrincipal,followUpStatus,hospitalDepartmentChildCode,followUpCreateTime);
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
