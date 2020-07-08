package com.fums.followupmanagement.service;

import com.fums.pojo.DataReview;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DataReviewService {
    List<DataReview> findAllDataReview(DataReview dataReview,Integer[] list);

    DataReview findOneDataReview(Integer id);
}
