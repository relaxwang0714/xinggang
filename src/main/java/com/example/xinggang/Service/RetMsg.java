package com.example.xinggang.Service;

public interface RetMsg {
    void setCode(String code);
    void setMsg(String msg);
    String getMsg();
    String toString();
    String toString(String code,String msg);
}
