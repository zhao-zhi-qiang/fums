package com.fums.system_management.pojo;

import java.io.Serializable;

/**
 * disease_coding
 * @author 
 */
public class DiseaseCoding implements Serializable {
    /**
     * 疾病id
     */
    private Integer diseaseId;

    /**
     * 疾病编码
     */
    private String diseaseCode;

    /**
     * 疾病名称
     */
    private String diseaseName;

    /**
     * 疾病拼音
     */
    private String diseaseSpell;

    /**
     * 疾病描述
     */
    private String diseaseDescription;

    /**
     * 疾病父属性(0:肠道传染病 1:结核病 2:某些)
     */
    private Integer diseaseParent;

    private static final long serialVersionUID = 1L;

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseCode() {
        return diseaseCode;
    }

    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public String getDiseaseSpell() {
        return diseaseSpell;
    }

    public void setDiseaseSpell(String diseaseSpell) {
        this.diseaseSpell = diseaseSpell;
    }

    public String getDiseaseDescription() {
        return diseaseDescription;
    }

    public void setDiseaseDescription(String diseaseDescription) {
        this.diseaseDescription = diseaseDescription;
    }

    public Integer getDiseaseParent() {
        return diseaseParent;
    }

    public void setDiseaseParent(Integer diseaseParent) {
        this.diseaseParent = diseaseParent;
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
        DiseaseCoding other = (DiseaseCoding) that;
        return (this.getDiseaseId() == null ? other.getDiseaseId() == null : this.getDiseaseId().equals(other.getDiseaseId()))
            && (this.getDiseaseCode() == null ? other.getDiseaseCode() == null : this.getDiseaseCode().equals(other.getDiseaseCode()))
            && (this.getDiseaseName() == null ? other.getDiseaseName() == null : this.getDiseaseName().equals(other.getDiseaseName()))
            && (this.getDiseaseSpell() == null ? other.getDiseaseSpell() == null : this.getDiseaseSpell().equals(other.getDiseaseSpell()))
            && (this.getDiseaseDescription() == null ? other.getDiseaseDescription() == null : this.getDiseaseDescription().equals(other.getDiseaseDescription()))
            && (this.getDiseaseParent() == null ? other.getDiseaseParent() == null : this.getDiseaseParent().equals(other.getDiseaseParent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDiseaseId() == null) ? 0 : getDiseaseId().hashCode());
        result = prime * result + ((getDiseaseCode() == null) ? 0 : getDiseaseCode().hashCode());
        result = prime * result + ((getDiseaseName() == null) ? 0 : getDiseaseName().hashCode());
        result = prime * result + ((getDiseaseSpell() == null) ? 0 : getDiseaseSpell().hashCode());
        result = prime * result + ((getDiseaseDescription() == null) ? 0 : getDiseaseDescription().hashCode());
        result = prime * result + ((getDiseaseParent() == null) ? 0 : getDiseaseParent().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", diseaseId=").append(diseaseId);
        sb.append(", diseaseCode=").append(diseaseCode);
        sb.append(", diseaseName=").append(diseaseName);
        sb.append(", diseaseSpell=").append(diseaseSpell);
        sb.append(", diseaseDescription=").append(diseaseDescription);
        sb.append(", diseaseParent=").append(diseaseParent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}