package com.fums.template_setting.dao;
import com.fums.template_setting.pojo.Symptom;
import com.fums.template_setting.pojo.detail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/29 11:33
 * @Description:
 */
@Mapper
public interface TreeDao {
    /**
     * 所有表内容
     * @return
     */
    List<detail> selectSymptom(@Param("symId") Integer symId);
    /**
     * 症状表内容
     * @return
     */
    List<detail> selectSymptom2();
    /**
     * 症状表
     */
    List<Symptom> queryid();
    /**
     * 多id查询
     */
    List<Symptom> selectMoreId(@Param("array") List<Integer> array);

    /**
     * 添加至树节点
     * @param detail
     * @return
     */
    int insertTree(detail detail);
}
