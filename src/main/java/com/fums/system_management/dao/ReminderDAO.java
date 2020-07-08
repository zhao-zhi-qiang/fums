package com.fums.system_management.dao;

import com.fums.system_management.pojo.Reminder;
import org.springframework.stereotype.Repository;

/**
 * ReminderDAO继承基类
 */
@Repository
public interface ReminderDAO extends MyBatisBaseDao<Reminder, Integer> {
}