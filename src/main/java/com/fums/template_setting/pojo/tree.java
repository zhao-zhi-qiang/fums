package com.fums.template_setting.pojo;

/**
 * @author: 赵林
 * @Date: 2020/6/29 11:28
 * @Description:
 */
public class tree {
    private int id;
    private String title;
    private String information;
    private int tid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public tree() {
    }

    @Override
    public String toString() {
        return "tree{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", information='" + information + '\'' +
                ", tid=" + tid +
                '}';
    }
}
