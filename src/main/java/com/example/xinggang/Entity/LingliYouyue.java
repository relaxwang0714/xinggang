package com.example.xinggang.Entity;

import java.util.Date;

public class LingliYouyue {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private String phone;

    private String qiwangNeirong;

    private Integer status;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQiwangNeirong() {
        return qiwangNeirong;
    }

    public void setQiwangNeirong(String qiwangNeirong) {
        this.qiwangNeirong = qiwangNeirong == null ? null : qiwangNeirong.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}