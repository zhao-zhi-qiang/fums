package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * form_overview
 * @author 
 */
public class FormOverview implements Serializable {
    private Integer overviewId;

    /**
     * 科室id
     */
    private Integer departmentId;

    /**
     * 随访组ID
     */
    private Integer followupUpId;

    /**
     * 模板名称
     */
    private String templateName;

    /**
     * 更新日期
     */
    private Date updatedDate;

    /**
     * 更新者
     */
    private String updateThe;

    /**
     * 版本号
     */
    private String theErsionUmber;

    /**
     * 创建者
     */
    private String theReator;

    /**
     * 创建日期
     */
    private Date creationDate;

    /**
     * 状态（0：历史版本 1：当前版本 2；未发布）
     */
    private String state;

    /**
     * 表状态(1:删除，2:未删除)
     */
    private String tableState;

    private static final long serialVersionUID = 1L;

    public Integer getOverviewId() {
        return overviewId;
    }

    public void setOverviewId(Integer overviewId) {
        this.overviewId = overviewId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getFollowupUpId() {
        return followupUpId;
    }

    public void setFollowupUpId(Integer followupUpId) {
        this.followupUpId = followupUpId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdateThe() {
        return updateThe;
    }

    public void setUpdateThe(String updateThe) {
        this.updateThe = updateThe;
    }

    public String getTheErsionUmber() {
        return theErsionUmber;
    }

    public void setTheErsionUmber(String theErsionUmber) {
        this.theErsionUmber = theErsionUmber;
    }

    public String getTheReator() {
        return theReator;
    }

    public void setTheReator(String theReator) {
        this.theReator = theReator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getTableState() {
        return tableState;
    }

    public void setTableState(String tableState) {
        this.tableState = tableState;
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
        FormOverview other = (FormOverview) that;
        return (this.getOverviewId() == null ? other.getOverviewId() == null : this.getOverviewId().equals(other.getOverviewId()))
            && (this.getDepartmentId() == null ? other.getDepartmentId() == null : this.getDepartmentId().equals(other.getDepartmentId()))
            && (this.getFollowupUpId() == null ? other.getFollowupUpId() == null : this.getFollowupUpId().equals(other.getFollowupUpId()))
            && (this.getTemplateName() == null ? other.getTemplateName() == null : this.getTemplateName().equals(other.getTemplateName()))
            && (this.getUpdatedDate() == null ? other.getUpdatedDate() == null : this.getUpdatedDate().equals(other.getUpdatedDate()))
            && (this.getUpdateThe() == null ? other.getUpdateThe() == null : this.getUpdateThe().equals(other.getUpdateThe()))
            && (this.getTheErsionUmber() == null ? other.getTheErsionUmber() == null : this.getTheErsionUmber().equals(other.getTheErsionUmber()))
            && (this.getTheReator() == null ? other.getTheReator() == null : this.getTheReator().equals(other.getTheReator()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
            && (this.getTableState() == null ? other.getTableState() == null : this.getTableState().equals(other.getTableState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOverviewId() == null) ? 0 : getOverviewId().hashCode());
        result = prime * result + ((getDepartmentId() == null) ? 0 : getDepartmentId().hashCode());
        result = prime * result + ((getFollowupUpId() == null) ? 0 : getFollowupUpId().hashCode());
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getUpdatedDate() == null) ? 0 : getUpdatedDate().hashCode());
        result = prime * result + ((getUpdateThe() == null) ? 0 : getUpdateThe().hashCode());
        result = prime * result + ((getTheErsionUmber() == null) ? 0 : getTheErsionUmber().hashCode());
        result = prime * result + ((getTheReator() == null) ? 0 : getTheReator().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getTableState() == null) ? 0 : getTableState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", overviewId=").append(overviewId);
        sb.append(", departmentId=").append(departmentId);
        sb.append(", followupUpId=").append(followupUpId);
        sb.append(", templateName=").append(templateName);
        sb.append(", updatedDate=").append(updatedDate);
        sb.append(", updateThe=").append(updateThe);
        sb.append(", theErsionUmber=").append(theErsionUmber);
        sb.append(", theReator=").append(theReator);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", state=").append(state);
        sb.append(", tableState=").append(tableState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}