package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class Dianpu {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String faren;

    private String phone;

    private Integer villageId;

    private String dianpuName;

    private String dianpuType;

    private String dianpuAddress;

    private String shp;

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

    public String getFaren() {
        return faren;
    }

    public void setFaren(String faren) {
        this.faren = faren == null ? null : faren.trim();
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

    public String getDianpuName() {
        return dianpuName;
    }

    public void setDianpuName(String dianpuName) {
        this.dianpuName = dianpuName == null ? null : dianpuName.trim();
    }

    public String getDianpuType() {
        return dianpuType;
    }

    public void setDianpuType(String dianpuType) {
        this.dianpuType = dianpuType == null ? null : dianpuType.trim();
    }

    public String getDianpuAddress() {
        return dianpuAddress;
    }

    public void setDianpuAddress(String dianpuAddress) {
        this.dianpuAddress = dianpuAddress == null ? null : dianpuAddress.trim();
    }

    public String getShp() {
        return shp;
    }

    public void setShp(String shp) {
        this.shp = shp == null ? null : shp.trim();
    }
}