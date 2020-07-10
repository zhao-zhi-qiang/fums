package com.fums.template_setting.service.impl;

import com.fums.template_setting.dao.TreeDao;
import com.fums.template_setting.pojo.Symptom;
import com.fums.template_setting.pojo.detail;
import com.fums.template_setting.service.treeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: 赵林
 * @Date: 2020/6/29 11:38
 * @Description:
 */
@Service
public class TreeServiceImpl implements treeService {
    @Resource
    private TreeDao treeDao;

    @Override
    public List<Symptom> queryid() {
        return treeDao.queryid();
    }



    @Override
    public List<detail> selectSymptom(Integer symId) {
        List<detail> details = treeDao.selectSymptom(symId);

        return details;
    }

    @Override
    public List<detail> selectSymptom2() {
        return treeDao.selectSymptom2();
    }

    @Override
    public List<Symptom> selectMoreId(List<Integer> array) {
        return treeDao.selectMoreId(array);
    }

    @Override
    public int insertTree(detail detail) {
        return treeDao.insertTree(detail);
    }
}
