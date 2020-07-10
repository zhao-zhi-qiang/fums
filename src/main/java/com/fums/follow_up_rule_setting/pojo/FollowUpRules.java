package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * follow_up_rules
 * @author 
 */
public class FollowUpRules implements Serializable {
    private Integer id;

    /**
     * 节假日是否排期  1:是 2:否
     */
    private Integer areHolidaysScheduled;

    /**
     * 时点id
     */
    private Integer pointOfTimeId;

    /**
     * 随访模板id
     */
    private Integer followUpTemplateId;

    /**
     * 患者提醒方式
     */
    private String remindersForPatients;

    /**
     * 医生提醒方式
     */
    private String doctorsReminders;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getareHolidaysScheduled() {
        return areHolidaysScheduled;
    }

    public void setareHolidaysScheduled(Integer areHolidaysScheduled) {
        this.areHolidaysScheduled = areHolidaysScheduled;
    }

    public Integer getPointOfTimeId() {
        return pointOfTimeId;
    }

    public void setPointOfTimeId(Integer pointOfTimeId) {
        this.pointOfTimeId = pointOfTimeId;
    }

    public Integer getFollowUpTemplateId() {
        return followUpTemplateId;
    }

    public void setFollowUpTemplateId(Integer followUpTemplateId) {
        this.followUpTemplateId = followUpTemplateId;
    }

    public String getRemindersForPatients() {
        return remindersForPatients;
    }

    public void setRemindersForPatients(String remindersForPatients) {
        this.remindersForPatients = remindersForPatients;
    }

    public String getDoctorsReminders() {
        return doctorsReminders;
    }

    public void setDoctorsReminders(String doctorsReminders) {
        this.doctorsReminders = doctorsReminders;
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
        FollowUpRules other = (FollowUpRules) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getareHolidaysScheduled() == null ? other.getareHolidaysScheduled() == null : this.getareHolidaysScheduled().equals(other.getareHolidaysScheduled()))
            && (this.getPointOfTimeId() == null ? other.getPointOfTimeId() == null : this.getPointOfTimeId().equals(other.getPointOfTimeId()))
            && (this.getFollowUpTemplateId() == null ? other.getFollowUpTemplateId() == null : this.getFollowUpTemplateId().equals(other.getFollowUpTemplateId()))
            && (this.getRemindersForPatients() == null ? other.getRemindersForPatients() == null : this.getRemindersForPatients().equals(other.getRemindersForPatients()))
            && (this.getDoctorsReminders() == null ? other.getDoctorsReminders() == null : this.getDoctorsReminders().equals(other.getDoctorsReminders()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getareHolidaysScheduled() == null) ? 0 : getareHolidaysScheduled().hashCode());
        result = prime * result + ((getPointOfTimeId() == null) ? 0 : getPointOfTimeId().hashCode());
        result = prime * result + ((getFollowUpTemplateId() == null) ? 0 : getFollowUpTemplateId().hashCode());
        result = prime * result + ((getRemindersForPatients() == null) ? 0 : getRemindersForPatients().hashCode());
        result = prime * result + ((getDoctorsReminders() == null) ? 0 : getDoctorsReminders().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areHolidaysScheduled=").append(areHolidaysScheduled);
        sb.append(", pointOfTimeId=").append(pointOfTimeId);
        sb.append(", followUpTemplateId=").append(followUpTemplateId);
        sb.append(", remindersForPatients=").append(remindersForPatients);
        sb.append(", doctorsReminders=").append(doctorsReminders);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}