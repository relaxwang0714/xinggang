package com.example.xinggang.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    YetaiFenbuMapper yetaiFenbuMapper;
    @Autowired
    YunyouXingangMapper yunyouXingangMapper;
    @Autowired
    ZuimeiXilieMapper zuimeiXilieMapper;
    @Autowired
    XiangtuMinsuMapper xiangtuMinsuMapper;
    @Autowired
    XingangFengcaiMapper xingangFengcaiMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectYetaiFenbuByVillageId(Integer id){
        YetaiFenbuExample yetaiFenbuExample = new YetaiFenbuExample();
        YetaiFenbuExample.Criteria criteria = yetaiFenbuExample.createCriteria();
        criteria.andVillageIdEqualTo(1);
        List<YetaiFenbu> yetaiFenbuList = yetaiFenbuMapper.selectByExample(yetaiFenbuExample);
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(yetaiFenbuList);
        returnMsg.setData(yetaiFenbuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        returnMsg.toString();
//        jsonObject.toString();
        return returnMsg.toString();
    }
    public String selectOverviewByVillageId(Integer id){
        YetaiFenbuExample yetaiFenbuExample = new YetaiFenbuExample();
        YetaiFenbuExample.Criteria criteria = yetaiFenbuExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<YetaiFenbu> yetaiFenbuList = yetaiFenbuMapper.selectByExample(yetaiFenbuExample);
        returnMsg.setData(yetaiFenbuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectZuimeiByVillageId(Integer id){
        ZuimeiXilieExample zuimeiXilieExample = new ZuimeiXilieExample();
        ZuimeiXilieExample.Criteria criteria = zuimeiXilieExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<ZuimeiXilie> zuimeiXilieList = zuimeiXilieMapper.selectByExample(zuimeiXilieExample);
        returnMsg.setData(zuimeiXilieList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectXiangtuminsuByVillageId(Integer id){
        XiangtuMinsuExample xiangtuMinsuExample = new XiangtuMinsuExample();
        XiangtuMinsuExample.Criteria criteria = xiangtuMinsuExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<XiangtuMinsu> xiangtuMinsus = xiangtuMinsuMapper.selectByExample(xiangtuMinsuExample);
        returnMsg.setData(xiangtuMinsus);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectXingangFengcaiByVillageId(Integer id){
        XingangFengcaiExample xingangFengcaiExample = new XingangFengcaiExample();
        XingangFengcaiExample.Criteria criteria = xingangFengcaiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<XingangFengcai> xingangFengcaiList = xingangFengcaiMapper.selectByExample(xingangFengcaiExample);
        returnMsg.setData(xingangFengcaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }

}
