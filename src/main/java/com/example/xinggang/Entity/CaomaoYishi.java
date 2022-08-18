package com.example.xinggang.Entity;

import java.util.Date;

public class CaomaoYishi {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String time;

    private String shijianName;

    private String address;

    private String people;

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getShijianName() {
        return shijianName;
    }

    public void setShijianName(String shijianName) {
        this.shijianName = shijianName == null ? null : shijianName.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people == null ? null : people.trim();
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