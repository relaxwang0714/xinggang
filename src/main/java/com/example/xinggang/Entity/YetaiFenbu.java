package com.example.xinggang.Entity;

import java.util.Date;

public class YetaiFenbu {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer chanyeLeixing;

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

    public Integer getChanyeLeixing() {
        return chanyeLeixing;
    }

    public void setChanyeLeixing(Integer chanyeLeixing) {
        this.chanyeLeixing = chanyeLeixing;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}