package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.DataReviewDAO;
import com.fums.followupmanagement.service.DataReviewService;
import com.fums.pojo.DataReview;
import com.fums.pojo.DataReviewExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataReviewServiceImpl implements DataReviewService {
    @Autowired
    DataReviewDAO dataReviewDAO;
    @Override
    public List<DataReview> findAllDataReview(DataReview dataReview,Integer[] list) {
        //DataReviewExample dataReviewExample = new DataReviewExample();
        List<DataReview> dataReviewList = dataReviewDAO.selectAll(dataReview,list);
        return dataReviewList;
    }

    @Override
    public DataReview findOneDataReview(Integer id) {

        return dataReviewDAO.selectByPrimaryKey(id);
    }
}
