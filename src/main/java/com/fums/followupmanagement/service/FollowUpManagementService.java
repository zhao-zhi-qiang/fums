package com.fums.followupmanagement.service;

import com.fums.pojo.FollowPatient;
import com.fums.pojo.FollowUp;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Service
public interface FollowUpManagementService {
    List<FollowPatient> findAllFollowUpManagement(FollowPatient followPatient, Integer[] list,String setOfDate1,String setOfDate2) throws ParseException;

    Map findFollowUpGroupAndHospitalDepartment();
}
