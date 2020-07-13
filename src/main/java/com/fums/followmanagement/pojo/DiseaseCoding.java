package com.fums.followmanagement.pojo;

public class DiseaseCoding {
    private Integer id;

    private String icd100;

    private String fzm000;

    private String jbmc00;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcd100() {
        return icd100;
    }

    public void setIcd100(String icd100) {
        this.icd100 = icd100 == null ? null : icd100.trim();
    }

    public String getFzm000() {
        return fzm000;
    }

    public void setFzm000(String fzm000) {
        this.fzm000 = fzm000 == null ? null : fzm000.trim();
    }

    public String getJbmc00() {
        return jbmc00;
    }

    public void setJbmc00(String jbmc00) {
        this.jbmc00 = jbmc00 == null ? null : jbmc00.trim();
    }
}