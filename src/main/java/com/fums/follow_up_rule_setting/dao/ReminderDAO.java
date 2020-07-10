package com.fums.follow_up_rule_setting.dao;

import com.fums.follow_up_rule_setting.pojo.Reminder;
import org.springframework.stereotype.Repository;

/**
 * ReminderDAO继承基类
 */
@Repository
public interface ReminderDAO extends MyBatisBaseDao<Reminder, Integer> {
}