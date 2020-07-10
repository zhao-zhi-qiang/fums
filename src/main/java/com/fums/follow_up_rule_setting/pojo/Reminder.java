package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * reminder
 * @author 
 */
public class Reminder implements Serializable {
    private Integer id;

    /**
     * 提醒方式
     */
    private String reminderMethod;

    /**
     * 提醒人员
     */
    private String reminderPepole;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReminderMethod() {
        return reminderMethod;
    }

    public void setReminderMethod(String reminderMethod) {
        this.reminderMethod = reminderMethod;
    }

    public String getReminderPepole() {
        return reminderPepole;
    }

    public void setReminderPepole(String reminderPepole) {
        this.reminderPepole = reminderPepole;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Reminder other = (Reminder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getReminderMethod() == null ? other.getReminderMethod() == null : this.getReminderMethod().equals(other.getReminderMethod()))
            && (this.getReminderPepole() == null ? other.getReminderPepole() == null : this.getReminderPepole().equals(other.getReminderPepole()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getReminderMethod() == null) ? 0 : getReminderMethod().hashCode());
        result = prime * result + ((getReminderPepole() == null) ? 0 : getReminderPepole().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", reminderMethod=").append(reminderMethod);
        sb.append(", reminderPepole=").append(reminderPepole);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}