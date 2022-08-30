package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.PuhuiJinrongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class DigitalServiceServices {
    @Autowired
    PuhuiJinrongMapper puhuiJinrongMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectPuhuiJinrongByVillageId(Integer id){
        PuhuiJinrongExample puhuiJinrongExample = new PuhuiJinrongExample();
        //是所有类的方法，不是实例的方法
        PuhuiJinrongExample.Criteria criteria = puhuiJinrongExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<PuhuiJinrong> puhuiJinrongList = puhuiJinrongMapper.selectByExample(puhuiJinrongExample);
        returnMsg.setData(puhuiJinrongList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updatePuhuiJinrongById(PuhuiJinrong puhuiJinrong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        puhuiJinrong.setUpdateTime(date);
        PuhuiJinrongExample puhuiJinrongExample = new PuhuiJinrongExample();
        PuhuiJinrongExample.Criteria criteria = puhuiJinrongExample.createCriteria();
        criteria.andIdEqualTo(puhuiJinrong.getId());
        int res = puhuiJinrongMapper.updateByExampleSelective(puhuiJinrong,puhuiJinrongExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertPuhuiJinrongById(PuhuiJinrong puhuiJinrong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        puhuiJinrong.setCreateTime(date);
        puhuiJinrong.setUpdateTime(date);
        int res = puhuiJinrongMapper.insertSelective(puhuiJinrong);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
}
