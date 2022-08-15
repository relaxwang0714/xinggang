package com.example.xinggang.Entity;

import java.util.Date;

public class RuoshiQunti {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private Integer canjiren;

    private Integer dibaohu;

    private Integer laoren;

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

    public Integer getCanjiren() {
        return canjiren;
    }

    public void setCanjiren(Integer canjiren) {
        this.canjiren = canjiren;
    }

    public Integer getDibaohu() {
        return dibaohu;
    }

    public void setDibaohu(Integer dibaohu) {
        this.dibaohu = dibaohu;
    }

    public Integer getLaoren() {
        return laoren;
    }

    public void setLaoren(Integer laoren) {
        this.laoren = laoren;
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}