package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.FollowPatientDAO;
import com.fums.followupmanagement.service.FollowUpManagementService;
import com.fums.pojo.FollowPatient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FollowUpManagementServiceImpl implements FollowUpManagementService {
    @Autowired
    FollowPatientDAO followPatientDAO;
    @Override
    public List<FollowPatient> findAllFollowUpManagement(FollowPatient followPatient, Integer[] list) {

        return followPatientDAO.selectAll(followPatient,list);
    }
}
