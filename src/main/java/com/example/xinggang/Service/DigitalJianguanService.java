package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.FengmaoGuankongMapper;
import com.example.xinggang.Mapper.ZaijianListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
