package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DigitalLifeService {
    @Autowired
    LaonianXiehuiMapper laonianXiehuiMapper;
    @Autowired
    FunvXiehuiMapper funvXiehuiMapper;
    @Autowired
    GongyiHuodongMapper gongyiHuodongMapper;
    @Autowired
    GongyiGuanggaoMapper gongyiGuanggaoMapper;
    @Autowired
    LingliYouyueMapper lingliYouyueMapper;
    @Autowired
    LingliZhongxinMapper lingliZhongxinMapper;
    @Autowired
    RuoshiQuntiMapper ruoshiQuntiMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectLaonianXiehuiByVillageId(Integer id){
        LaonianXiehuiExample laonianXiehuiExample = new LaonianXiehuiExample();
        //是所有类的方法，不是实例的方法
        LaonianXiehuiExample.Criteria criteria = laonianXiehuiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<LaonianXiehui> laonianXiehuiList = laonianXiehuiMapper.selectByExample(laonianXiehuiExample);
        returnMsg.setData(laonianXiehuiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectFunvXiehuiByVillageId(Integer id){
        FunvXiehuiExample funvXiehuiExample = new FunvXiehuiExample();
        //是所有类的方法，不是实例的方法
        FunvXiehuiExample.Criteria criteria = funvXiehuiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<FunvXiehui> funvXiehuiList = funvXiehuiMapper.selectByExample(funvXiehuiExample);
        returnMsg.setData(funvXiehuiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
//    public String selectGongyiZuzhiByVillageId(Integer id){
//        GongyiZuzhiExample gongyiZuzhiExample = new GongyiZuzhiExample();
//        //是所有类的方法，不是实例的方法
//        GongyiZuzhiExample.Criteria criteria = gongyiZuzhiExample.createCriteria();
//        criteria.andVillageIdEqualTo(id);
//        List<GongyiZuzhi> gongyiZuzhiList = gongyiZuzhiMapper.selectByExample(gongyiZuzhiExample);
//        returnMsg.setData(gongyiZuzhiList);
//        returnMsg.setCode("0");
//        returnMsg.setMsg("成功");
//        return returnMsg.toString();
//    }
    public String selectGongyiHuodongByVillageId(Integer id){
        GongyiHuodongExample gongyiHuodongExample = new GongyiHuodongExample();
        //是所有类的方法，不是实例的方法
        GongyiHuodongExample.Criteria criteria = gongyiHuodongExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<GongyiHuodong> gongyiHuodongList = gongyiHuodongMapper.selectByExample(gongyiHuodongExample);
        returnMsg.setData(gongyiHuodongList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectGongyiGuanggaoByVillageId(Integer id){
        GongyiGuanggaoExample gongyiGuanggaoExample = new GongyiGuanggaoExample();
        //是所有类的方法，不是实例的方法
        GongyiGuanggaoExample.Criteria criteria = gongyiGuanggaoExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<GongyiGuanggao> gongyiGuanggaoList = gongyiGuanggaoMapper.selectByExample(gongyiGuanggaoExample);
        returnMsg.setData(gongyiGuanggaoList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectLingliYouyueByVillageId(Integer id){
        LingliYouyueExample lingliYouyueExample = new LingliYouyueExample();
        //是所有类的方法，不是实例的方法
        LingliYouyueExample.Criteria criteria = lingliYouyueExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<LingliYouyue> lingliYouyueList = lingliYouyueMapper.selectByExample(lingliYouyueExample);
        returnMsg.setData(lingliYouyueList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectRuoshiQuntiByVillageId(Integer id){
        RuoshiQuntiExample ruoshiQuntiExample = new RuoshiQuntiExample();
        //是所有类的方法，不是实例的方法
        RuoshiQuntiExample.Criteria criteria = ruoshiQuntiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<RuoshiQunti> ruoshiQuntiList = ruoshiQuntiMapper.selectByExampleWithBLOBs(ruoshiQuntiExample);
        returnMsg.setData(ruoshiQuntiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectCanjirenByVillageId(Integer id){
        RuoshiQuntiExample ruoshiQuntiExample = new RuoshiQuntiExample();
        //是所有类的方法，不是实例的方法
        RuoshiQuntiExample.Criteria criteria = ruoshiQuntiExample.createCriteria();
        criteria.andIsCanjiEqualTo(1);
        criteria.andVillageIdEqualTo(1);
        List<RuoshiQunti> ruoshiQuntiList = ruoshiQuntiMapper.selectByExample(ruoshiQuntiExample);
        returnMsg.setData(ruoshiQuntiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectdibaohuByVillageId(Integer id){
        RuoshiQuntiExample ruoshiQuntiExample = new RuoshiQuntiExample();
        //是所有类的方法，不是实例的方法
        RuoshiQuntiExample.Criteria criteria = ruoshiQuntiExample.createCriteria();
        criteria.andIsDibaoEqualTo(1);
        criteria.andVillageIdEqualTo(1);
        List<RuoshiQunti> ruoshiQuntiList = ruoshiQuntiMapper.selectByExample(ruoshiQuntiExample);
        returnMsg.setData(ruoshiQuntiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selectOldPeopleByVillageId(Integer id){
        RuoshiQuntiExample ruoshiQuntiExample = new RuoshiQuntiExample();
        //是所有类的方法，不是实例的方法
        RuoshiQuntiExample.Criteria criteria = ruoshiQuntiExample.createCriteria();
        criteria.andAgeGreaterThanOrEqualTo(66);
        criteria.andVillageIdEqualTo(1);
        List<RuoshiQunti> ruoshiQuntiList = ruoshiQuntiMapper.selectByExample(ruoshiQuntiExample);
        returnMsg.setData(ruoshiQuntiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String selecLingliZhongxinByVillageId(Integer id){
        LingliZhongxinExample jingjiZengshouExample = new LingliZhongxinExample();
        //是所有类的方法，不是实例的方法
        LingliZhongxinExample.Criteria criteria = jingjiZengshouExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<LingliZhongxin> lingliZhongxinList = lingliZhongxinMapper.selectByExample(jingjiZengshouExample);
        returnMsg.setData(lingliZhongxinList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }

}
