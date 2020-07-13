package com.fums.followmanagement.dao;

import com.fums.followmanagement.pojo.DiseaseCoding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface DiseaseCodingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DiseaseCoding record);

    int insertSelective(DiseaseCoding record);

    DiseaseCoding selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DiseaseCoding record);

    int updateByPrimaryKey(DiseaseCoding record);

    /**
     * 条件查询所有疾病编码
     * @param id1
     * @param id2
     * @param jbmc00
     * @return
     */
    List<DiseaseCoding> selectDiseaseCodingAll(@Param("id1") Integer id1,@Param("id2") Integer id2,@Param("jbmc00") String jbmc00);
}