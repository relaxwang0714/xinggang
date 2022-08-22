package com.example.xinggang.Entity;

import java.util.Date;

public class FunvXiehui {
    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String name;

    private Integer sex;

    private String phone;

    private String zhengzhiMianmao;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getZhengzhiMianmao() {
        return zhengzhiMianmao;
    }

    public void setZhengzhiMianmao(String zhengzhiMianmao) {
        this.zhengzhiMianmao = zhengzhiMianmao == null ? null : zhengzhiMianmao.trim();
    }

    public Integer getVillageId() {
        return villageId;
    }

    public void setVillageId(Integer villageId) {
        this.villageId = villageId;
    }
}