package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class JingjiZengshou {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer year;

    private Integer jitiIncome;

    private Integer nonghuIncome;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getJitiIncome() {
        return jitiIncome;
    }

    public void setJitiIncome(Integer jitiIncome) {
        this.jitiIncome = jitiIncome;
    }

    public Integer getNonghuIncome() {
        return nonghuIncome;
    }

    public void setNonghuIncome(Integer nonghuIncome) {
        this.nonghuIncome = nonghuIncome;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}