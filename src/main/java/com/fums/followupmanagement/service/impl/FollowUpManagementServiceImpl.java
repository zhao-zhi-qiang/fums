package com.fums.followupmanagement.service.impl;

import com.fums.followupmanagement.dao.FollowPatientDAO;
import com.fums.followupmanagement.dao.FollowUpDAO;
import com.fums.followupmanagement.dao.HospitalDepartmentDAO;
import com.fums.followupmanagement.service.FollowUpManagementService;
import com.fums.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FollowUpManagementServiceImpl implements FollowUpManagementService {
    @Autowired
    FollowPatientDAO followPatientDAO;
    @Autowired
    FollowUpDAO followUpDAO;
    @Autowired
    HospitalDepartmentDAO hospitalDepartmentDAO;
    @Override
    public List<FollowPatient> findAllFollowUpManagement(FollowPatient followPatient, Integer[] list,String setOfDate1,String setOfDate2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1;
        Date date2;
        try {
            date1 = sdf.parse(setOfDate1);
            date2 = sdf.parse(setOfDate2);
        }catch (Exception e){
            date1 = null;
            date2 = null;
        }


        return followPatientDAO.selectAll(followPatient,list,date1,date2);
    }

    @Override
    public Map findFollowUpGroupAndHospitalDepartment() {
        Map map = new HashMap();
        FollowUpExample followUpExample = new FollowUpExample();
        HospitalDepartmentExample hospitalDepartmentExample = new HospitalDepartmentExample();
        List<FollowUp> followUpList = followUpDAO.selectByExample(followUpExample);
        List<HospitalDepartment> hospitalDepartmentList = hospitalDepartmentDAO.selectByExample(hospitalDepartmentExample);
        map.put("followUpList",followUpList);
        map.put("hospitalDepartmentList",hospitalDepartmentList);
        return map;
    }
}
