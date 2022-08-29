package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class RuoshiQunti {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String name;

    private Integer age;

    private String dibaoType;

    private String canjiType;

    private Integer isDibao;

    private Integer isCanji;

    private String shp;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDibaoType() {
        return dibaoType;
    }

    public void setDibaoType(String dibaoType) {
        this.dibaoType = dibaoType == null ? null : dibaoType.trim();
    }

    public String getCanjiType() {
        return canjiType;
    }

    public void setCanjiType(String canjiType) {
        this.canjiType = canjiType == null ? null : canjiType.trim();
    }

    public Integer getIsDibao() {
        return isDibao;
    }

    public void setIsDibao(Integer isDibao) {
        this.isDibao = isDibao;
    }

    public Integer getIsCanji() {
        return isCanji;
    }

    public void setIsCanji(Integer isCanji) {
        this.isCanji = isCanji;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }

    public String getShp() {
        return shp;
    }

    public void setShp(String shp) {
        this.shp = shp;
    }
}