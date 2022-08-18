package com.example.xinggang.Enum;

import com.example.xinggang.Config.CodeBaseEnum;

public enum  zaijianEnum implements CodeBaseEnum {
    NONGFANG(0,"农房建筑"),
    JICHU(1, "基础设施"),
    JINGGUAN(2, "景观风貌");
    private final int code;
    private final String desc;
    zaijianEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    @Override
    public int code() {
        return code;
    }
    public String getDesc() {
        return desc;
    }

}
