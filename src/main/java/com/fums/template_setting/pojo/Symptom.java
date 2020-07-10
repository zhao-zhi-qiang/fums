package com.fums.template_setting.pojo;

/**
 * @author: 赵林
 * @Date: 2020/7/6 10:06
 * @Description:
 */
public class Symptom {
    private int symId;
    private String symptoms;
    private int details;
    public int getSymId() {
        return symId;
    }


    public void setSymId(int symId) {
        this.symId = symId;
    }
    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public int getDetails() {
        return details;
    }

    public void setDetails(int details) {
        this.details = details;
    }


    public Symptom() {
    }

    @Override
    public String toString() {
        return "Symptom{" +
                "symId=" + symId +
                ", symptoms='" + symptoms + '\'' +
                ", details=" + details +
                '}';
    }
}
