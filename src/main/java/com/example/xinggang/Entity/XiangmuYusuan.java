package com.example.xinggang.Entity;

import java.util.Date;

public class XiangmuYusuan {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String type;

    private Integer yusuan;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getYusuan() {
        return yusuan;
    }

    public void setYusuan(Integer yusuan) {
        this.yusuan = yusuan;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}