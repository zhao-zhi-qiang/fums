package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);

    /**
     * 查询所有用户角色
     * @param roleName
     * @return
     */
    List<User> selectUserInfoAll(@Param("roleName") String roleName);

    /**
     * 条件查询所有用户
     * @param userAccount
     * @param hospitalDepartmentChildName
     * @return
     */
    List<User> selectUserAll(@Param("userAccount") String userAccount,@Param("hospitalDepartmentChildName") String hospitalDepartmentChildName);

    /**
     * 根据角色查询所有该角色用户
     * @param roleName
     * @return
     */
    List<User> selectUserAllByRoleName(@Param("roleName") String roleName);
}