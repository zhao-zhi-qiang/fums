package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * filter_events
 * @author 
 */
public class FilterEvents implements Serializable {
    private Integer id;

    /**
     * 本院
     */
    private String ourHospital;

    /**
     * 本科室
     */
    private String undergraduateDepartment;

    /**
     * 首次
     */
    private String first;

    /**
     * 末次
     */
    private String last;

    /**
     * 本就诊
     */
    private String thisVisit;

    /**
     * 任意就诊
     */
    private String arbitraryTreatment;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOurHospital() {
        return ourHospital;
    }

    public void setOurHospital(String ourHospital) {
        this.ourHospital = ourHospital;
    }

    public String getUndergraduateDepartment() {
        return undergraduateDepartment;
    }

    public void setUndergraduateDepartment(String undergraduateDepartment) {
        this.undergraduateDepartment = undergraduateDepartment;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getThisVisit() {
        return thisVisit;
    }

    public void setThisVisit(String thisVisit) {
        this.thisVisit = thisVisit;
    }

    public String getArbitraryTreatment() {
        return arbitraryTreatment;
    }

    public void setArbitraryTreatment(String arbitraryTreatment) {
        this.arbitraryTreatment = arbitraryTreatment;
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
        FilterEvents other = (FilterEvents) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOurHospital() == null ? other.getOurHospital() == null : this.getOurHospital().equals(other.getOurHospital()))
            && (this.getUndergraduateDepartment() == null ? other.getUndergraduateDepartment() == null : this.getUndergraduateDepartment().equals(other.getUndergraduateDepartment()))
            && (this.getFirst() == null ? other.getFirst() == null : this.getFirst().equals(other.getFirst()))
            && (this.getLast() == null ? other.getLast() == null : this.getLast().equals(other.getLast()))
            && (this.getThisVisit() == null ? other.getThisVisit() == null : this.getThisVisit().equals(other.getThisVisit()))
            && (this.getArbitraryTreatment() == null ? other.getArbitraryTreatment() == null : this.getArbitraryTreatment().equals(other.getArbitraryTreatment()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOurHospital() == null) ? 0 : getOurHospital().hashCode());
        result = prime * result + ((getUndergraduateDepartment() == null) ? 0 : getUndergraduateDepartment().hashCode());
        result = prime * result + ((getFirst() == null) ? 0 : getFirst().hashCode());
        result = prime * result + ((getLast() == null) ? 0 : getLast().hashCode());
        result = prime * result + ((getThisVisit() == null) ? 0 : getThisVisit().hashCode());
        result = prime * result + ((getArbitraryTreatment() == null) ? 0 : getArbitraryTreatment().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ourHospital=").append(ourHospital);
        sb.append(", undergraduateDepartment=").append(undergraduateDepartment);
        sb.append(", first=").append(first);
        sb.append(", last=").append(last);
        sb.append(", thisVisit=").append(thisVisit);
        sb.append(", arbitraryTreatment=").append(arbitraryTreatment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}