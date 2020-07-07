package com.fums.system_management.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * patient
 * @author 
 */
public class Patient implements Serializable {
    /**
     * id
     */
    private Integer patientId;

    /**
     * 患者唯一标识
     */
    private String patientUnique;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生地
     */
    private String bornAdress;

    /**
     * 出生日期
     */
    private Date born;

    /**
     * 文化程度
     */
    private String culture;

    /**
     * 移动电话
     */
    private String phone;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * ABO血型
     */
    private String aboType;

    /**
     * RH血型
     */
    private String rhType;

    /**
     * 与患者关系
     */
    private String relationship;

    /**
     * 联系人姓名
     */
    private String relationshipName;

    /**
     * 联系人性别
     */
    private String relationshipSex;

    /**
     * 联系人住址
     */
    private String relationshipAdress;

    /**
     * 联系人电子邮件
     */
    private String relationshipEmail;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 户口簿号
     */
    private String accountBookNo;

    /**
     * 护照号
     */
    private String passportNo;

    /**
     * 军官证
     */
    private String officerNumber;

    /**
     * 驾驶证
     */
    private String driverNumber;

    /**
     * 港澳通行证
     */
    private String hongKongAndMacaoPassNo;

    /**
     * 台湾通行证
     */
    private String taiwanPassNumber;

    private static final long serialVersionUID = 1L;

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientUnique() {
        return patientUnique;
    }

    public void setPatientUnique(String patientUnique) {
        this.patientUnique = patientUnique;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBornAdress() {
        return bornAdress;
    }

    public void setBornAdress(String bornAdress) {
        this.bornAdress = bornAdress;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAboType() {
        return aboType;
    }

    public void setAboType(String aboType) {
        this.aboType = aboType;
    }

    public String getRhType() {
        return rhType;
    }

    public void setRhType(String rhType) {
        this.rhType = rhType;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    public String getRelationshipSex() {
        return relationshipSex;
    }

    public void setRelationshipSex(String relationshipSex) {
        this.relationshipSex = relationshipSex;
    }

    public String getRelationshipAdress() {
        return relationshipAdress;
    }

    public void setRelationshipAdress(String relationshipAdress) {
        this.relationshipAdress = relationshipAdress;
    }

    public String getRelationshipEmail() {
        return relationshipEmail;
    }

    public void setRelationshipEmail(String relationshipEmail) {
        this.relationshipEmail = relationshipEmail;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getAccountBookNo() {
        return accountBookNo;
    }

    public void setAccountBookNo(String accountBookNo) {
        this.accountBookNo = accountBookNo;
    }

    public String getPassportNo() {
        return passportNo;
    }

    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getOfficerNumber() {
        return officerNumber;
    }

    public void setOfficerNumber(String officerNumber) {
        this.officerNumber = officerNumber;
    }

    public String getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(String driverNumber) {
        this.driverNumber = driverNumber;
    }

    public String getHongKongAndMacaoPassNo() {
        return hongKongAndMacaoPassNo;
    }

    public void setHongKongAndMacaoPassNo(String hongKongAndMacaoPassNo) {
        this.hongKongAndMacaoPassNo = hongKongAndMacaoPassNo;
    }

    public String getTaiwanPassNumber() {
        return taiwanPassNumber;
    }

    public void setTaiwanPassNumber(String taiwanPassNumber) {
        this.taiwanPassNumber = taiwanPassNumber;
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
        Patient other = (Patient) that;
        return (this.getPatientId() == null ? other.getPatientId() == null : this.getPatientId().equals(other.getPatientId()))
            && (this.getPatientUnique() == null ? other.getPatientUnique() == null : this.getPatientUnique().equals(other.getPatientUnique()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getBornAdress() == null ? other.getBornAdress() == null : this.getBornAdress().equals(other.getBornAdress()))
            && (this.getBorn() == null ? other.getBorn() == null : this.getBorn().equals(other.getBorn()))
            && (this.getCulture() == null ? other.getCulture() == null : this.getCulture().equals(other.getCulture()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAboType() == null ? other.getAboType() == null : this.getAboType().equals(other.getAboType()))
            && (this.getRhType() == null ? other.getRhType() == null : this.getRhType().equals(other.getRhType()))
            && (this.getRelationship() == null ? other.getRelationship() == null : this.getRelationship().equals(other.getRelationship()))
            && (this.getRelationshipName() == null ? other.getRelationshipName() == null : this.getRelationshipName().equals(other.getRelationshipName()))
            && (this.getRelationshipSex() == null ? other.getRelationshipSex() == null : this.getRelationshipSex().equals(other.getRelationshipSex()))
            && (this.getRelationshipAdress() == null ? other.getRelationshipAdress() == null : this.getRelationshipAdress().equals(other.getRelationshipAdress()))
            && (this.getRelationshipEmail() == null ? other.getRelationshipEmail() == null : this.getRelationshipEmail().equals(other.getRelationshipEmail()))
            && (this.getIdcard() == null ? other.getIdcard() == null : this.getIdcard().equals(other.getIdcard()))
            && (this.getAccountBookNo() == null ? other.getAccountBookNo() == null : this.getAccountBookNo().equals(other.getAccountBookNo()))
            && (this.getPassportNo() == null ? other.getPassportNo() == null : this.getPassportNo().equals(other.getPassportNo()))
            && (this.getOfficerNumber() == null ? other.getOfficerNumber() == null : this.getOfficerNumber().equals(other.getOfficerNumber()))
            && (this.getDriverNumber() == null ? other.getDriverNumber() == null : this.getDriverNumber().equals(other.getDriverNumber()))
            && (this.getHongKongAndMacaoPassNo() == null ? other.getHongKongAndMacaoPassNo() == null : this.getHongKongAndMacaoPassNo().equals(other.getHongKongAndMacaoPassNo()))
            && (this.getTaiwanPassNumber() == null ? other.getTaiwanPassNumber() == null : this.getTaiwanPassNumber().equals(other.getTaiwanPassNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPatientId() == null) ? 0 : getPatientId().hashCode());
        result = prime * result + ((getPatientUnique() == null) ? 0 : getPatientUnique().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getBornAdress() == null) ? 0 : getBornAdress().hashCode());
        result = prime * result + ((getBorn() == null) ? 0 : getBorn().hashCode());
        result = prime * result + ((getCulture() == null) ? 0 : getCulture().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAboType() == null) ? 0 : getAboType().hashCode());
        result = prime * result + ((getRhType() == null) ? 0 : getRhType().hashCode());
        result = prime * result + ((getRelationship() == null) ? 0 : getRelationship().hashCode());
        result = prime * result + ((getRelationshipName() == null) ? 0 : getRelationshipName().hashCode());
        result = prime * result + ((getRelationshipSex() == null) ? 0 : getRelationshipSex().hashCode());
        result = prime * result + ((getRelationshipAdress() == null) ? 0 : getRelationshipAdress().hashCode());
        result = prime * result + ((getRelationshipEmail() == null) ? 0 : getRelationshipEmail().hashCode());
        result = prime * result + ((getIdcard() == null) ? 0 : getIdcard().hashCode());
        result = prime * result + ((getAccountBookNo() == null) ? 0 : getAccountBookNo().hashCode());
        result = prime * result + ((getPassportNo() == null) ? 0 : getPassportNo().hashCode());
        result = prime * result + ((getOfficerNumber() == null) ? 0 : getOfficerNumber().hashCode());
        result = prime * result + ((getDriverNumber() == null) ? 0 : getDriverNumber().hashCode());
        result = prime * result + ((getHongKongAndMacaoPassNo() == null) ? 0 : getHongKongAndMacaoPassNo().hashCode());
        result = prime * result + ((getTaiwanPassNumber() == null) ? 0 : getTaiwanPassNumber().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", patientId=").append(patientId);
        sb.append(", patientUnique=").append(patientUnique);
        sb.append(", name=").append(name);
        sb.append(", sex=").append(sex);
        sb.append(", bornAdress=").append(bornAdress);
        sb.append(", born=").append(born);
        sb.append(", culture=").append(culture);
        sb.append(", phone=").append(phone);
        sb.append(", email=").append(email);
        sb.append(", aboType=").append(aboType);
        sb.append(", rhType=").append(rhType);
        sb.append(", relationship=").append(relationship);
        sb.append(", relationshipName=").append(relationshipName);
        sb.append(", relationshipSex=").append(relationshipSex);
        sb.append(", relationshipAdress=").append(relationshipAdress);
        sb.append(", relationshipEmail=").append(relationshipEmail);
        sb.append(", idcard=").append(idcard);
        sb.append(", accountBookNo=").append(accountBookNo);
        sb.append(", passportNo=").append(passportNo);
        sb.append(", officerNumber=").append(officerNumber);
        sb.append(", driverNumber=").append(driverNumber);
        sb.append(", hongKongAndMacaoPassNo=").append(hongKongAndMacaoPassNo);
        sb.append(", taiwanPassNumber=").append(taiwanPassNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}