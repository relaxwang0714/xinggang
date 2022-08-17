package com.example.xinggang.Service;

import com.example.xinggang.Entity.GongyiZuzhi;
import com.example.xinggang.Entity.GongyiZuzhiExample;
import com.example.xinggang.Entity.PuhuiJinrong;
import com.example.xinggang.Entity.PuhuiJinrongExample;
import com.example.xinggang.Mapper.PuhuiJinrongMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
