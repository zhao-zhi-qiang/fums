package com.fums.followupmanagement.service;

import com.fums.pojo.FollowPatient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FollowUpManagementService {
    List<FollowPatient> findAllFollowUpManagement(FollowPatient followPatient, Integer[] list);
}
