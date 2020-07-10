package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.FollowUp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Mapper
@Component
public interface FollowUpMapper {
    int deleteByPrimaryKey(Integer followUpId);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    FollowUp selectByPrimaryKey(Integer followUpId);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);

    /**
     * 验证随访组表单属性
     * @param followUpName
     * @param followUpCode
     * @param followUpBackdrop
     * @return
     */
    FollowUp verifyProperties(@Param("followUpName") String followUpName,@Param("followUpCode") String followUpCode,@Param("followUpBackdrop") String followUpBackdrop);

    /**
     * 查询所有随访组信息
     * @param followUpPrincipal
     * @param hospitalDepartmentChildName
     * @param followUpStatus
     * @param followUpCreateTime1
     * @param followUpCreateTime2
     * @return
     */
    List<FollowUp> selectFollowUpAll(@Param("followUpPrincipal") String followUpPrincipal, @Param("hospitalDepartmentChildName") String hospitalDepartmentChildName, @Param("followUpStatus") Integer followUpStatus, @Param("followUpCreateTime1") Date followUpCreateTime1,@Param("followUpCreateTime2") Date followUpCreateTime2);
}