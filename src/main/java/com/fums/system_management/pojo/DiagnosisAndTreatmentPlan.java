package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * diagnosis_and_treatment_plan
 * @author 
 */
public class DiagnosisAndTreatmentPlan implements Serializable {
    private Integer id;

    /**
     * 用药
     */
    private String 


medication;

    /**
     * 检验
     */
    private String test;

    /**
     * 检查
     */
    private String inspect;

    /**
     * 治疗
     */
    private String treatment;

    /**
     * 手术
     */
    private String operation;

    /**
     * 通知
     */
    private String notice;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmedication() {
        return medication;
    }

    public void setmedication(String medication) {
        this.medication = medication;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getInspect() {
        return inspect;
    }

    public void setInspect(String inspect) {
        this.inspect = inspect;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
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
        DiagnosisAndTreatmentPlan other = (DiagnosisAndTreatmentPlan) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getmedication() == null ? other.getmedication() == null : this.getmedication().equals(other.getmedication()))
            && (this.getTest() == null ? other.getTest() == null : this.getTest().equals(other.getTest()))
            && (this.getInspect() == null ? other.getInspect() == null : this.getInspect().equals(other.getInspect()))
            && (this.getTreatment() == null ? other.getTreatment() == null : this.getTreatment().equals(other.getTreatment()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getNotice() == null ? other.getNotice() == null : this.getNotice().equals(other.getNotice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getmedication() == null) ? 0 : getmedication().hashCode());
        result = prime * result + ((getTest() == null) ? 0 : getTest().hashCode());
        result = prime * result + ((getInspect() == null) ? 0 : getInspect().hashCode());
        result = prime * result + ((getTreatment() == null) ? 0 : getTreatment().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getNotice() == null) ? 0 : getNotice().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", medication=").append(


medication);
        sb.append(", test=").append(test);
        sb.append(", inspect=").append(inspect);
        sb.append(", treatment=").append(treatment);
        sb.append(", operation=").append(operation);
        sb.append(", notice=").append(notice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}