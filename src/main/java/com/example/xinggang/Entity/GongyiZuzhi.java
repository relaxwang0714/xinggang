package com.example.xinggang.Entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

public class GongyiZuzhi {
    private Integer id;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private String name;

    private Integer sex;

    private String zhiwu;

    private String phone;

    private Integer villageId;

    private String zhengzhiMianmao;

    private String zuzhiName;

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

    public String getZhiwu() {
        return zhiwu;
    }

    public void setZhiwu(String zhiwu) {
        this.zhiwu = zhiwu == null ? null : zhiwu.trim();
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

    public String getZhengzhiMianmao() {
        return zhengzhiMianmao;
    }

    public void setZhengzhiMianmao(String zhengzhiMianmao) {
        this.zhengzhiMianmao = zhengzhiMianmao == null ? null : zhengzhiMianmao.trim();
    }

    public String getZuzhiName() {
        return zuzhiName;
    }

    public void setZuzhiName(String zuzhiName) {
        this.zuzhiName = zuzhiName == null ? null : zuzhiName.trim();
    }
}