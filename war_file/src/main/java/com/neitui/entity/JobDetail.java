package com.neitui.entity;

import java.util.Date;
import java.util.List;


public class JobDetail {
    private int id;
    private String jobName;
    private String jobTitle;
    private Date createDate;
    private Date updateDate;
    private Date completeDate;
    private String description;
    private String briefIntro;

//    private List<KeyWord> keyWords;

//    public List<KeyWord> getKeyWords() {
//        return keyWords;
//    }
//
//    public void setKeyWords(List<KeyWord> keyWords) {
//        this.keyWords = keyWords;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBriefIntro() {
        return briefIntro;
    }

    public void setBriefIntro(String briefIntro) {
        this.briefIntro = briefIntro;
    }

}
