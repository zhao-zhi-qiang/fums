package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * point_of_time
 * @author 
 */
public class PointOfTime implements Serializable {
    private Integer id;

    /**
     * 基准事件id（默认id=1）
     */
    private Integer benchmartEventsId;

    /**
     * 筛选事件id（默认id=1）
     */
    private Integer filterEventsId;

    /**
     * 起始时间
     */
    private Date startTime;

    /**
     * 间隔时间
     */
    private Date intervalTime;

    /**
     * 持续次数
     */
    private Integer duration;

    /**
     * 提前天数
     */
    private Integer daysAhead;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBenchmartEventsId() {
        return benchmartEventsId;
    }

    public void setBenchmartEventsId(Integer benchmartEventsId) {
        this.benchmartEventsId = benchmartEventsId;
    }

    public Integer getFilterEventsId() {
        return filterEventsId;
    }

    public void setFilterEventsId(Integer filterEventsId) {
        this.filterEventsId = filterEventsId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Date intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getDaysAhead() {
        return daysAhead;
    }

    public void setDaysAhead(Integer daysAhead) {
        this.daysAhead = daysAhead;
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
        PointOfTime other = (PointOfTime) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBenchmartEventsId() == null ? other.getBenchmartEventsId() == null : this.getBenchmartEventsId().equals(other.getBenchmartEventsId()))
            && (this.getFilterEventsId() == null ? other.getFilterEventsId() == null : this.getFilterEventsId().equals(other.getFilterEventsId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getIntervalTime() == null ? other.getIntervalTime() == null : this.getIntervalTime().equals(other.getIntervalTime()))
            && (this.getDuration() == null ? other.getDuration() == null : this.getDuration().equals(other.getDuration()))
            && (this.getDaysAhead() == null ? other.getDaysAhead() == null : this.getDaysAhead().equals(other.getDaysAhead()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getBenchmartEventsId() == null) ? 0 : getBenchmartEventsId().hashCode());
        result = prime * result + ((getFilterEventsId() == null) ? 0 : getFilterEventsId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getIntervalTime() == null) ? 0 : getIntervalTime().hashCode());
        result = prime * result + ((getDuration() == null) ? 0 : getDuration().hashCode());
        result = prime * result + ((getDaysAhead() == null) ? 0 : getDaysAhead().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", benchmartEventsId=").append(benchmartEventsId);
        sb.append(", filterEventsId=").append(filterEventsId);
        sb.append(", startTime=").append(startTime);
        sb.append(", intervalTime=").append(intervalTime);
        sb.append(", duration=").append(duration);
        sb.append(", daysAhead=").append(daysAhead);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}