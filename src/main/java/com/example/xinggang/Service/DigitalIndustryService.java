package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.JingjiZengshouMapper;
import com.example.xinggang.Mapper.JitiFangchanMapper;
import com.example.xinggang.Mapper.TudiLiuzhuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class DigitalIndustryService {
    @Autowired
    JitiFangchanMapper jitiFangchanMapper;
    @Autowired
    TudiLiuzhuanMapper tudiLiuzhuanMapper;
    @Autowired
    JingjiZengshouMapper jingjiZengshouMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectJitiFangchanByVillageId(Integer id){
        JitiFangchanExample jitiFangchanExample = new JitiFangchanExample();
        //是所有类的方法，不是实例的方法
        JitiFangchanExample.Criteria criteria = jitiFangchanExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<JitiFangchan> jitiFangchanList = jitiFangchanMapper.selectByExample(jitiFangchanExample);
        returnMsg.setData(jitiFangchanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateJitiFangchanById(JitiFangchan jitiFangchan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        jitiFangchan.setUpdateTime(date);
        JitiFangchanExample jitiFangchanExample = new JitiFangchanExample();
        JitiFangchanExample.Criteria criteria = jitiFangchanExample.createCriteria();
        criteria.andIdEqualTo(jitiFangchan.getId());
        int res = jitiFangchanMapper.updateByExampleSelective(jitiFangchan,jitiFangchanExample);
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(yetaiFenbuList);
//        returnMsg.setData(yetaiFenbuList);
//        returnMsg.setData();
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("更新成功");
        return returnMsg.toString();
    }
    public String insertJitiFangchanById(JitiFangchan jitiFangchan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        jitiFangchan.setCreateTime(date);
        jitiFangchan.setUpdateTime(date);
        int res = jitiFangchanMapper.insertSelective(jitiFangchan);
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("添加成功");
        return returnMsg.toString();
    }
    public String selectTudiLiuzhuanByVillageId(Integer id){
        TudiLiuzhuanExample tudiLiuzhuanExample = new TudiLiuzhuanExample();
        //是所有类的方法，不是实例的方法
        TudiLiuzhuanExample.Criteria criteria = tudiLiuzhuanExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<TudiLiuzhuan> tudiLiuzhuanList = tudiLiuzhuanMapper.selectByExample(tudiLiuzhuanExample);
        returnMsg.setData(tudiLiuzhuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateTudiLiuzhuanById(TudiLiuzhuan tudiLiuzhuan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        tudiLiuzhuan.setUpdateTime(date);
        TudiLiuzhuanExample tudiLiuzhuanExample = new TudiLiuzhuanExample();
        TudiLiuzhuanExample.Criteria criteria = tudiLiuzhuanExample.createCriteria();
        criteria.andIdEqualTo(tudiLiuzhuan.getId());
        int res = tudiLiuzhuanMapper.updateByExampleSelective(tudiLiuzhuan,tudiLiuzhuanExample);
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("更新成功");
        return returnMsg.toString();
    }
    public String insertTudiLiuzhuanById(TudiLiuzhuan tudiLiuzhuan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        tudiLiuzhuan.setCreateTime(date);
        tudiLiuzhuan.setUpdateTime(date);
        int res = tudiLiuzhuanMapper.insertSelective(tudiLiuzhuan);
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("添加成功");
        return returnMsg.toString();
    }
    public String selectJingjiZengshouByVillageId(Integer id){
        JingjiZengshouExample jingjiZengshouExample = new JingjiZengshouExample();
        //是所有类的方法，不是实例的方法
        JingjiZengshouExample.Criteria criteria = jingjiZengshouExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<JingjiZengshou> jingjiZengshouList = jingjiZengshouMapper.selectByExample(jingjiZengshouExample);
        returnMsg.setData(jingjiZengshouList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateJingjiZengshouById(JingjiZengshou jingjiZengshou){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        jingjiZengshou.setUpdateTime(date);
        JingjiZengshouExample jingjiZengshouExample = new JingjiZengshouExample();
        JingjiZengshouExample.Criteria criteria = jingjiZengshouExample.createCriteria();
        criteria.andIdEqualTo(jingjiZengshou.getId());
        int res = jingjiZengshouMapper.updateByExampleSelective(jingjiZengshou,jingjiZengshouExample);
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("更新成功");
        return returnMsg.toString();
    }
    public String insertJingjiZengshouById(JingjiZengshou jingjiZengshou){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        jingjiZengshou.setCreateTime(date);
        jingjiZengshou.setUpdateTime(date);
        int res = jingjiZengshouMapper.insertSelective(jingjiZengshou);
        returnMsg.setCode(String.valueOf(res));
        returnMsg.setMsg("添加成功");
        return returnMsg.toString();
    }

}
