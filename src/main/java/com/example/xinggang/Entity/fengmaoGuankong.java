package com.example.xinggang.Entity;

import java.util.Date;

public class fengmaoGuankong {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer programId;

    private String programName;

    private String programAra;

    private String responsePeople;

    private String phone;

    private Integer villageId;

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

    public Integer getProgramId() {
        return programId;
    }

    public void setProgramId(Integer programId) {
        this.programId = programId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName == null ? null : programName.trim();
    }

    public String getProgramAra() {
        return programAra;
    }

    public void setProgramAra(String programAra) {
        this.programAra = programAra == null ? null : programAra.trim();
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
}