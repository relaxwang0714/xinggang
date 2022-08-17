package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.JingjiZengshouMapper;
import com.example.xinggang.Mapper.JitiFangchanMapper;
import com.example.xinggang.Mapper.TudiLiuzhuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
