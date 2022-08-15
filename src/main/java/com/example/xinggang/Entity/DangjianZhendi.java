package com.example.xinggang.Entity;

import java.util.Date;

public class DangjianZhendi {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String dangjianFacility;

    private String responsePeople;

    private String phone;

    private Integer villageId;

    private String shp;

    private String picUrl;

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

    public String getDangjianFacility() {
        return dangjianFacility;
    }

    public void setDangjianFacility(String dangjianFacility) {
        this.dangjianFacility = dangjianFacility == null ? null : dangjianFacility.trim();
    }

    public String getResponsePeople() {
        return responsePeople;
    }

    public void setResponsePeople(String responsePeople) {
        this.responsePeople = responsePeople == null ? null : responsePeople.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
        this.shp = shp == null ? null : shp.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }
}