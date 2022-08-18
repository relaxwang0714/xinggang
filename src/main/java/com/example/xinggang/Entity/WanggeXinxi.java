package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class WanggeXinxi {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String wanggeName;

    private String wanggePeople;

    private String phone;

    private String zongshu;

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

    public String getWanggeName() {
        return wanggeName;
    }

    public void setWanggeName(String wanggeName) {
        this.wanggeName = wanggeName == null ? null : wanggeName.trim();
    }

    public String getWanggePeople() {
        return wanggePeople;
    }

    public void setWanggePeople(String wanggePeople) {
        this.wanggePeople = wanggePeople == null ? null : wanggePeople.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZongshu() {
        return zongshu;
    }

    public void setZongshu(String zongshu) {
        this.zongshu = zongshu == null ? null : zongshu.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}