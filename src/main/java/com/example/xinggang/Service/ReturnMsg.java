package com.example.xinggang.Service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReturnMsg {
    private String code="-1";
    private String msg="操作失败";

    private JSONArray data=null;

    public void setCode(String code){
        //System.out.println(code);
        this.code=code;
    }
    public  void setMsg(String msg){
        this.msg=msg;
    }
    public  void setData(List data){
        try{
            JSONArray jsonArray=new JSONArray();
            jsonArray.add(data);
            this.data=jsonArray;
            code="0";
            msg="成功";
        }catch (Exception e){
            code="-1";
            msg=e.getMessage();
        }

    }
    public  void setData(JSONArray jsonArray){
        try{
            this.data=jsonArray;
            code="0";
            msg="成功";
        }catch (Exception e){
            code="-1";
            msg=e.getMessage();
        }

    }
    public String getMsg(){
        return  msg;
    }
    public String toString(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        //简直在乱写把
        if(data.size()>0){
            jsonObject.put("data",data);
        }
        return jsonObject.toJSONString();
    }
    public String toString(String code,String msg){
        JSONObject  jsonObject = new JSONObject();
        jsonObject.put("code",code);
        jsonObject.put("msg",msg);
        return jsonObject.toJSONString();
    }
}
