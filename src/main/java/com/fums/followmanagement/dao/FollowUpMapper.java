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
     * @param hospitalDepartmentChildCode
     * @param followUpStatus
     * @param departmentChildCode
     * @param followUpCreateTime
     * @return
     */
    List<FollowUp> selectFollowUpAll(@Param("followUpPrincipal") String followUpPrincipal, @Param("hospitalDepartmentChildCode") String hospitalDepartmentChildCode, @Param("followUpStatus") Integer followUpStatus, String departmentChildCode, @Param("followUpCreateTime") Date followUpCreateTime);
}