package com.fums.followmanagement.service;

import com.fums.followmanagement.dao.FollowUpMapper;
import com.fums.followmanagement.pojo.FollowUp;
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
     * @param hospitalDepartmentChildCode
     * @param followUpStatus
     * @param followUpCreateTime
     * @return
     */
    List<FollowUp> findFollowUpAll(String followUpPrincipal,String hospitalDepartmentChildCode,Integer followUpStatus,Date followUpCreateTime);

    /**
     * 添加随访组
     * @param followUp
     * @return
     */
    boolean addFollowUpInfo(FollowUp followUp);

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
}
