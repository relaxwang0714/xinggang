package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class DangyuanHuodong {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String dangyuanActivityName;

    private String mp4Url;

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

    public String getDangyuanActivityName() {
        return dangyuanActivityName;
    }

    public void setDangyuanActivityName(String dangyuanActivityName) {
        this.dangyuanActivityName = dangyuanActivityName == null ? null : dangyuanActivityName.trim();
    }

    public String getMp4Url() {
        return mp4Url;
    }

    public void setMp4Url(String mp4Url) {
        this.mp4Url = mp4Url == null ? null : mp4Url.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}