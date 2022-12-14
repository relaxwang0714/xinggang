package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.FengmaoGuankongMapper;
import com.example.xinggang.Mapper.ZaijianListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class DigitalJianguanService {
    @Autowired
    ZaijianListMapper zaijianListMapper;
    @Autowired
    FengmaoGuankongMapper fengmaoGuankongMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectZaijianByVillageId(Integer id){
        ZaijianListExample zaijianListExample = new ZaijianListExample();
        //是所有类的方法，不是实例的方法
        ZaijianListExample.Criteria criteria = zaijianListExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<ZaijianList> zaijianLists = zaijianListMapper.selectByExample(zaijianListExample);
        returnMsg.setData(zaijianLists);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZaijianById(ZaijianList zaijianList){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        zaijianList.setUpdateTime(date);
        ZaijianListExample zaijianListExample = new ZaijianListExample();
        ZaijianListExample.Criteria criteria = zaijianListExample.createCriteria();
        criteria.andIdEqualTo(zaijianList.getId());
        int res = zaijianListMapper.updateByExampleSelective(zaijianList,zaijianListExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZaijianById(ZaijianList zaijianList){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        zaijianList.setCreateTime(date);
        zaijianList.setUpdateTime(date);
        int res = zaijianListMapper.insertSelective(zaijianList);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteZaijianById(Integer id){

        int res = zaijianListMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectFengmaoGuankongByVillageId(Integer id){
        FengmaoGuankongExample fengmaoGuankongExample = new FengmaoGuankongExample();
        //是所有类的方法，不是实例的方法
        FengmaoGuankongExample.Criteria criteria = fengmaoGuankongExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<FengmaoGuankong> fengmaoGuankongList = fengmaoGuankongMapper.selectByExample(fengmaoGuankongExample);
        returnMsg.setData(fengmaoGuankongList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateFengmaoGuankongById(FengmaoGuankong fengmaoGuankong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        fengmaoGuankong.setUpdateTime(date);
        FengmaoGuankongExample fengmaoGuankongExample = new FengmaoGuankongExample();
        FengmaoGuankongExample.Criteria criteria = fengmaoGuankongExample.createCriteria();
        criteria.andIdEqualTo(fengmaoGuankong.getId());
        int res = fengmaoGuankongMapper.updateByExampleSelective(fengmaoGuankong,fengmaoGuankongExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertFengmaoGuankongById(FengmaoGuankong fengmaoGuankong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        fengmaoGuankong.setCreateTime(date);
        fengmaoGuankong.setUpdateTime(date);
        int res = fengmaoGuankongMapper.insertSelective(fengmaoGuankong);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteFengmaoGuankongById(Integer id){

        int res = fengmaoGuankongMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

}
