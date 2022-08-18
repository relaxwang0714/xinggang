package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class PuhuiJinrong {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String nongyeYuanqu;

    private String name;

    private String phone;

    private String chengbaoArea;

    private String shouhuoArea;

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

    public String getNongyeYuanqu() {
        return nongyeYuanqu;
    }

    public void setNongyeYuanqu(String nongyeYuanqu) {
        this.nongyeYuanqu = nongyeYuanqu == null ? null : nongyeYuanqu.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getChengbaoArea() {
        return chengbaoArea;
    }

    public void setChengbaoArea(String chengbaoArea) {
        this.chengbaoArea = chengbaoArea == null ? null : chengbaoArea.trim();
    }

    public String getShouhuoArea() {
        return shouhuoArea;
    }

    public void setShouhuoArea(String shouhuoArea) {
        this.shouhuoArea = shouhuoArea == null ? null : shouhuoArea.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}