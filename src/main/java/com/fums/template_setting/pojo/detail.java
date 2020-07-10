package com.fums.template_setting.pojo;

/**
 * @author: 赵林
 * @Date: 2020/7/6 11:24
 * @Description:
 */
public class detail {
    private int detailsId;
    private String details;
    private int symptomsId;
    private Symptom symptom;
    private int sourceId;

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public Symptom getSymptom() {
        return symptom;
    }

    public void setSymptom(Symptom symptom) {
        this.symptom = symptom;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getDetailsId() {
        return detailsId;
    }

    public void setDetailsId(int detailsId) {
        this.detailsId = detailsId;
    }

    public int getSymptomsId() {
        return symptomsId;
    }

    public void setSymptomsId(int symptomsId) {
        this.symptomsId = symptomsId;
    }

    public detail() {
    }

    @Override
    public String toString() {
        return "detail{" +
                "detailsId=" + detailsId +
                ", details='" + details + '\'' +
                ", symptomsId=" + symptomsId +
                ", symptom=" + symptom +
                ", sourceId=" + sourceId +
                '}';
    }
}
