package com.fums.follow_up_rule_setting.pojo;

import java.io.Serializable;

/**
 * benchmark_events
 * @author 
 */
public class BenchmarkEvents implements Serializable {
    private Integer id;

    /**
     * 门诊
     */
    private String outpatientDepartment;

    /**
     * 入院
     */
    private String beHospitalized;

    /**
     * 出院
     */
    private String leaveHospital;

    /**
     * 手术
     */
    private String operation;

    /**
     * 入ICU
     */
    private String admissionToIcu;

    /**
     * 出ICU
     */
    private String outOfIcu;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOutpatientDepartment() {
        return outpatientDepartment;
    }

    public void setOutpatientDepartment(String outpatientDepartment) {
        this.outpatientDepartment = outpatientDepartment;
    }

    public String getBeHospitalized() {
        return beHospitalized;
    }

    public void setBeHospitalized(String beHospitalized) {
        this.beHospitalized = beHospitalized;
    }

    public String getLeaveHospital() {
        return leaveHospital;
    }

    public void setLeaveHospital(String leaveHospital) {
        this.leaveHospital = leaveHospital;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getAdmissionToIcu() {
        return admissionToIcu;
    }

    public void setAdmissionToIcu(String admissionToIcu) {
        this.admissionToIcu = admissionToIcu;
    }

    public String getOutOfIcu() {
        return outOfIcu;
    }

    public void setOutOfIcu(String outOfIcu) {
        this.outOfIcu = outOfIcu;
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
        BenchmarkEvents other = (BenchmarkEvents) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutpatientDepartment() == null ? other.getOutpatientDepartment() == null : this.getOutpatientDepartment().equals(other.getOutpatientDepartment()))
            && (this.getBeHospitalized() == null ? other.getBeHospitalized() == null : this.getBeHospitalized().equals(other.getBeHospitalized()))
            && (this.getLeaveHospital() == null ? other.getLeaveHospital() == null : this.getLeaveHospital().equals(other.getLeaveHospital()))
            && (this.getOperation() == null ? other.getOperation() == null : this.getOperation().equals(other.getOperation()))
            && (this.getAdmissionToIcu() == null ? other.getAdmissionToIcu() == null : this.getAdmissionToIcu().equals(other.getAdmissionToIcu()))
            && (this.getOutOfIcu() == null ? other.getOutOfIcu() == null : this.getOutOfIcu().equals(other.getOutOfIcu()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutpatientDepartment() == null) ? 0 : getOutpatientDepartment().hashCode());
        result = prime * result + ((getBeHospitalized() == null) ? 0 : getBeHospitalized().hashCode());
        result = prime * result + ((getLeaveHospital() == null) ? 0 : getLeaveHospital().hashCode());
        result = prime * result + ((getOperation() == null) ? 0 : getOperation().hashCode());
        result = prime * result + ((getAdmissionToIcu() == null) ? 0 : getAdmissionToIcu().hashCode());
        result = prime * result + ((getOutOfIcu() == null) ? 0 : getOutOfIcu().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outpatientDepartment=").append(outpatientDepartment);
        sb.append(", beHospitalized=").append(beHospitalized);
        sb.append(", leaveHospital=").append(leaveHospital);
        sb.append(", operation=").append(operation);
        sb.append(", admissionToIcu=").append(admissionToIcu);
        sb.append(", outOfIcu=").append(outOfIcu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}