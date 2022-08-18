package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.example.xinggang.Enum.zaijianEnum;

import java.util.Date;

public class ZaijianList {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Integer programId;

    private String programName;

    private Integer isYujin;

    private String cameraUrl;

    private String phone;

//    private Integer isType;
    private zaijianEnum isType;

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

    public Integer getIsYujin() {
        return isYujin;
    }

    public void setIsYujin(Integer isYujin) {
        this.isYujin = isYujin;
    }

    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl == null ? null : cameraUrl.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

//    public Integer getIsType() {
//        return isType;
//    }
//
//    public void setIsType(Integer isType) {
//        this.isType = isType;
//    }

    public zaijianEnum getIsType() {
        return isType;
    }

    public void setIsType(zaijianEnum isType) {
        this.isType = isType;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}