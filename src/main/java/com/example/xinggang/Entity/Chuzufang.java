package com.example.xinggang.Entity;

import java.util.Date;

public class Chuzufang {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String fangdong;

    private String phone;

    private Integer zuke;

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

    public String getFangdong() {
        return fangdong;
    }

    public void setFangdong(String fangdong) {
        this.fangdong = fangdong == null ? null : fangdong.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getZuke() {
        return zuke;
    }

    public void setZuke(Integer zuke) {
        this.zuke = zuke;
    }

    public String getShp() {
        return shp;
    }

    public void setShp(String shp) {
        this.shp = shp == null ? null : shp.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}