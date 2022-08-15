package com.example.xinggang.Entity;

import java.util.Date;

public class GongyiHuodong {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String activityName;

    private String acitvityProfile;

    private String picUrl;

    private Integer villageId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getAcitvityProfile() {
        return acitvityProfile;
    }

    public void setAcitvityProfile(String acitvityProfile) {
        this.acitvityProfile = acitvityProfile == null ? null : acitvityProfile.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}