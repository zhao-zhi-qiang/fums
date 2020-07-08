package com.fums.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * data_review
 * @author 
 */
public class DataReview implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 随访组id
     */
    private Integer followUpId;

    /**
     * 表单
     */
    private String form;

    /**
     * 数据项
     */
    private String dataItem;

    /**
     * 患者id
     */
    private Integer patientId;

    /**
     * 患者名称
     */
    private String patient;

    /**
     * 值
     */
    private String value;

    /**
     * 质疑者
     */
    private String skeptic;

    /**
     * 复核者
     */
    private String review;

    /**
     * 复核状态(0：待复核；1：已修正；2：撤回)
     */
    private Integer reviewState;

    /**
     * 提出时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date proposalTime;

    /**
     * 复核时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reviewDate;

    /**
     * 状态(0：正常，1：删除)
     */
    private Integer delState;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(Integer followUpId) {
        this.followUpId = followUpId;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getDataItem() {
        return dataItem;
    }

    public void setDataItem(String dataItem) {
        this.dataItem = dataItem;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getSkeptic() {
        return skeptic;
    }

    public void setSkeptic(String skeptic) {
        this.skeptic = skeptic;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getReviewState() {
        return reviewState;
    }

    public void setReviewState(Integer reviewState) {
        this.reviewState = reviewState;
    }

    public Date getProposalTime() {
        return proposalTime;
    }

    public void setProposalTime(Date proposalTime) {
        this.proposalTime = proposalTime;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    public Integer getDelState() {
        return delState;
    }

    public void setDelState(Integer delState) {
        this.delState = delState;
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
        DataReview other = (DataReview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getFollowUpId() == null ? other.getFollowUpId() == null : this.getFollowUpId().equals(other.getFollowUpId()))
            && (this.getForm() == null ? other.getForm() == null : this.getForm().equals(other.getForm()))
            && (this.getDataItem() == null ? other.getDataItem() == null : this.getDataItem().equals(other.getDataItem()))
            && (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getPatient() == null ? other.getPatient() == null : this.getPatient().equals(other.getPatient()))
            && (this.getValue() == null ? other.getValue() == null : this.getValue().equals(other.getValue()))
            && (this.getSkeptic() == null ? other.getSkeptic() == null : this.getSkeptic().equals(other.getSkeptic()))
            && (this.getReview() == null ? other.getReview() == null : this.getReview().equals(other.getReview()))
            && (this.getReviewState() == null ? other.getReviewState() == null : this.getReviewState().equals(other.getReviewState()))
            && (this.getProposalTime() == null ? other.getProposalTime() == null : this.getProposalTime().equals(other.getProposalTime()))
            && (this.getReviewDate() == null ? other.getReviewDate() == null : this.getReviewDate().equals(other.getReviewDate()))
            && (this.getDelState() == null ? other.getDelState() == null : this.getDelState().equals(other.getDelState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getFollowUpId() == null) ? 0 : getFollowUpId().hashCode());
        result = prime * result + ((getForm() == null) ? 0 : getForm().hashCode());
        result = prime * result + ((getDataItem() == null) ? 0 : getDataItem().hashCode());
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getPatient() == null) ? 0 : getPatient().hashCode());
        result = prime * result + ((getValue() == null) ? 0 : getValue().hashCode());
        result = prime * result + ((getSkeptic() == null) ? 0 : getSkeptic().hashCode());
        result = prime * result + ((getReview() == null) ? 0 : getReview().hashCode());
        result = prime * result + ((getReviewState() == null) ? 0 : getReviewState().hashCode());
        result = prime * result + ((getProposalTime() == null) ? 0 : getProposalTime().hashCode());
        result = prime * result + ((getReviewDate() == null) ? 0 : getReviewDate().hashCode());
        result = prime * result + ((getDelState() == null) ? 0 : getDelState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", followUpId=").append(followUpId);
        sb.append(", form=").append(form);
        sb.append(", dataItem=").append(dataItem);
        sb.append(", patientId=").append(patientId);
        sb.append(", patient=").append(patient);
        sb.append(", value=").append(value);
        sb.append(", skeptic=").append(skeptic);
        sb.append(", review=").append(review);
        sb.append(", reviewState=").append(reviewState);
        sb.append(", proposalTime=").append(proposalTime);
        sb.append(", reviewDate=").append(reviewDate);
        sb.append(", delState=").append(delState);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}