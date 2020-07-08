package com.fums.system_management.dao;

import com.fums.system_management.pojo.InspectionItems;
import org.springframework.stereotype.Repository;

/**
 * InspectionItemsDAO继承基类
 */
@Repository
public interface InspectionItemsDAO extends MyBatisBaseDao<InspectionItems, Integer> {
}