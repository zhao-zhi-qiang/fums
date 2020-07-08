package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * home_information
 * @author 
 */
public class HomeInformation implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 主要诊断
     */
    private String mainDiagnosis;

    /**
     * 门诊诊断
     */
    private String outpatientDiagnosis;

    /**
     * 其他诊断
     */
    private String otherDiagnostics;

    /**
     * 入院方式
     */
    private String admissionMode;

    /**
     * 入院时间
     */
    private Date admissionTime;

    /**
     * 入院科室
     */
    private String admissionDepartment;

    /**
     * 入院诊断
     */
    private String admissionDiagnosis;

    /**
     * 入院医生
     */
    private String admissionDoctor;

    /**
     * 主治医生
     */
    private String attendingPhysician;

    /**
     * 出院时间
     */
    private Date dischargeTime;

    /**
     * 出院科室
     */
    private String dischargeDepartment;

    /**
     * 出院状态(0:健康 1:残疾)
     */
    private Integer dischargeState;

    /**
     * 出院诊断
     */
    private String dischargeDiagnosis;

    /**
     * 住院天数
     */
    private Integer hospitalizationDay;

    /**
     * 离院方式(0:医嘱离院 1:医嘱转院 2:医嘱转社区卫生服务机构/乡镇卫生院 3:非医嘱离院 4:死亡 5:其他)
     */
    private String leavingHospital;

    /**
     * 是否死亡(0:未死亡 1:死亡)
     */
    private Integer death;

    /**
     * 就诊方式(0:门(急)诊 1:普通门(急)诊 2:门诊大病 3:门诊统筹 4:住院 5:家庭病床 6:药店购药 7:体检)
     */
    private Integer hospitalWay;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainDiagnosis() {
        return mainDiagnosis;
    }

    public void setMainDiagnosis(String mainDiagnosis) {
        this.mainDiagnosis = mainDiagnosis;
    }

    public String getOutpatientDiagnosis() {
        return outpatientDiagnosis;
    }

    public void setOutpatientDiagnosis(String outpatientDiagnosis) {
        this.outpatientDiagnosis = outpatientDiagnosis;
    }

    public String getOtherDiagnostics() {
        return otherDiagnostics;
    }

    public void setOtherDiagnostics(String otherDiagnostics) {
        this.otherDiagnostics = otherDiagnostics;
    }

    public String getAdmissionMode() {
        return admissionMode;
    }

    public void setAdmissionMode(String admissionMode) {
        this.admissionMode = admissionMode;
    }

    public Date getAdmissionTime() {
        return admissionTime;
    }

    public void setAdmissionTime(Date admissionTime) {
        this.admissionTime = admissionTime;
    }

    public String getAdmissionDepartment() {
        return admissionDepartment;
    }

    public void setAdmissionDepartment(String admissionDepartment) {
        this.admissionDepartment = admissionDepartment;
    }

    public String getAdmissionDiagnosis() {
        return admissionDiagnosis;
    }

    public void setAdmissionDiagnosis(String admissionDiagnosis) {
        this.admissionDiagnosis = admissionDiagnosis;
    }

    public String getAdmissionDoctor() {
        return admissionDoctor;
    }

    public void setAdmissionDoctor(String admissionDoctor) {
        this.admissionDoctor = admissionDoctor;
    }

    public String getAttendingPhysician() {
        return attendingPhysician;
    }

    public void setAttendingPhysician(String attendingPhysician) {
        this.attendingPhysician = attendingPhysician;
    }

    public Date getDischargeTime() {
        return dischargeTime;
    }

    public void setDischargeTime(Date dischargeTime) {
        this.dischargeTime = dischargeTime;
    }

    public String getDischargeDepartment() {
        return dischargeDepartment;
    }

    public void setDischargeDepartment(String dischargeDepartment) {
        this.dischargeDepartment = dischargeDepartment;
    }

    public Integer getDischargeState() {
        return dischargeState;
    }

    public void setDischargeState(Integer dischargeState) {
        this.dischargeState = dischargeState;
    }

    public String getDischargeDiagnosis() {
        return dischargeDiagnosis;
    }

    public void setDischargeDiagnosis(String dischargeDiagnosis) {
        this.dischargeDiagnosis = dischargeDiagnosis;
    }

    public Integer getHospitalizationDay() {
        return hospitalizationDay;
    }

    public void setHospitalizationDay(Integer hospitalizationDay) {
        this.hospitalizationDay = hospitalizationDay;
    }

    public String getLeavingHospital() {
        return leavingHospital;
    }

    public void setLeavingHospital(String leavingHospital) {
        this.leavingHospital = leavingHospital;
    }

    public Integer getDeath() {
        return death;
    }

    public void setDeath(Integer death) {
        this.death = death;
    }

    public Integer getHospitalWay() {
        return hospitalWay;
    }

    public void setHospitalWay(Integer hospitalWay) {
        this.hospitalWay = hospitalWay;
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
        HomeInformation other = (HomeInformation) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMainDiagnosis() == null ? other.getMainDiagnosis() == null : this.getMainDiagnosis().equals(other.getMainDiagnosis()))
            && (this.getOutpatientDiagnosis() == null ? other.getOutpatientDiagnosis() == null : this.getOutpatientDiagnosis().equals(other.getOutpatientDiagnosis()))
            && (this.getOtherDiagnostics() == null ? other.getOtherDiagnostics() == null : this.getOtherDiagnostics().equals(other.getOtherDiagnostics()))
            && (this.getAdmissionMode() == null ? other.getAdmissionMode() == null : this.getAdmissionMode().equals(other.getAdmissionMode()))
            && (this.getAdmissionTime() == null ? other.getAdmissionTime() == null : this.getAdmissionTime().equals(other.getAdmissionTime()))
            && (this.getAdmissionDepartment() == null ? other.getAdmissionDepartment() == null : this.getAdmissionDepartment().equals(other.getAdmissionDepartment()))
            && (this.getAdmissionDiagnosis() == null ? other.getAdmissionDiagnosis() == null : this.getAdmissionDiagnosis().equals(other.getAdmissionDiagnosis()))
            && (this.getAdmissionDoctor() == null ? other.getAdmissionDoctor() == null : this.getAdmissionDoctor().equals(other.getAdmissionDoctor()))
            && (this.getAttendingPhysician() == null ? other.getAttendingPhysician() == null : this.getAttendingPhysician().equals(other.getAttendingPhysician()))
            && (this.getDischargeTime() == null ? other.getDischargeTime() == null : this.getDischargeTime().equals(other.getDischargeTime()))
            && (this.getDischargeDepartment() == null ? other.getDischargeDepartment() == null : this.getDischargeDepartment().equals(other.getDischargeDepartment()))
            && (this.getDischargeState() == null ? other.getDischargeState() == null : this.getDischargeState().equals(other.getDischargeState()))
            && (this.getDischargeDiagnosis() == null ? other.getDischargeDiagnosis() == null : this.getDischargeDiagnosis().equals(other.getDischargeDiagnosis()))
            && (this.getHospitalizationDay() == null ? other.getHospitalizationDay() == null : this.getHospitalizationDay().equals(other.getHospitalizationDay()))
            && (this.getLeavingHospital() == null ? other.getLeavingHospital() == null : this.getLeavingHospital().equals(other.getLeavingHospital()))
            && (this.getDeath() == null ? other.getDeath() == null : this.getDeath().equals(other.getDeath()))
            && (this.getHospitalWay() == null ? other.getHospitalWay() == null : this.getHospitalWay().equals(other.getHospitalWay()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMainDiagnosis() == null) ? 0 : getMainDiagnosis().hashCode());
        result = prime * result + ((getOutpatientDiagnosis() == null) ? 0 : getOutpatientDiagnosis().hashCode());
        result = prime * result + ((getOtherDiagnostics() == null) ? 0 : getOtherDiagnostics().hashCode());
        result = prime * result + ((getAdmissionMode() == null) ? 0 : getAdmissionMode().hashCode());
        result = prime * result + ((getAdmissionTime() == null) ? 0 : getAdmissionTime().hashCode());
        result = prime * result + ((getAdmissionDepartment() == null) ? 0 : getAdmissionDepartment().hashCode());
        result = prime * result + ((getAdmissionDiagnosis() == null) ? 0 : getAdmissionDiagnosis().hashCode());
        result = prime * result + ((getAdmissionDoctor() == null) ? 0 : getAdmissionDoctor().hashCode());
        result = prime * result + ((getAttendingPhysician() == null) ? 0 : getAttendingPhysician().hashCode());
        result = prime * result + ((getDischargeTime() == null) ? 0 : getDischargeTime().hashCode());
        result = prime * result + ((getDischargeDepartment() == null) ? 0 : getDischargeDepartment().hashCode());
        result = prime * result + ((getDischargeState() == null) ? 0 : getDischargeState().hashCode());
        result = prime * result + ((getDischargeDiagnosis() == null) ? 0 : getDischargeDiagnosis().hashCode());
        result = prime * result + ((getHospitalizationDay() == null) ? 0 : getHospitalizationDay().hashCode());
        result = prime * result + ((getLeavingHospital() == null) ? 0 : getLeavingHospital().hashCode());
        result = prime * result + ((getDeath() == null) ? 0 : getDeath().hashCode());
        result = prime * result + ((getHospitalWay() == null) ? 0 : getHospitalWay().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mainDiagnosis=").append(mainDiagnosis);
        sb.append(", outpatientDiagnosis=").append(outpatientDiagnosis);
        sb.append(", otherDiagnostics=").append(otherDiagnostics);
        sb.append(", admissionMode=").append(admissionMode);
        sb.append(", admissionTime=").append(admissionTime);
        sb.append(", admissionDepartment=").append(admissionDepartment);
        sb.append(", admissionDiagnosis=").append(admissionDiagnosis);
        sb.append(", admissionDoctor=").append(admissionDoctor);
        sb.append(", attendingPhysician=").append(attendingPhysician);
        sb.append(", dischargeTime=").append(dischargeTime);
        sb.append(", dischargeDepartment=").append(dischargeDepartment);
        sb.append(", dischargeState=").append(dischargeState);
        sb.append(", dischargeDiagnosis=").append(dischargeDiagnosis);
        sb.append(", hospitalizationDay=").append(hospitalizationDay);
        sb.append(", leavingHospital=").append(leavingHospital);
        sb.append(", death=").append(death);
        sb.append(", hospitalWay=").append(hospitalWay);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}