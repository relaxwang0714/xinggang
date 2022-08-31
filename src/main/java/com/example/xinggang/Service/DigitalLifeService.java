package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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
    public String updateLaonianXiehuiById(LaonianXiehui laonianXiehui){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        laonianXiehui.setUpdateTime(date);
        LaonianXiehuiExample laonianXiehuiExample = new LaonianXiehuiExample();
        LaonianXiehuiExample.Criteria criteria = laonianXiehuiExample.createCriteria();
        criteria.andIdEqualTo(laonianXiehui.getId());
        int res = laonianXiehuiMapper.updateByExampleSelective(laonianXiehui,laonianXiehuiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLaonianXiehuiById(LaonianXiehui laonianXiehui){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        laonianXiehui.setCreateTime(date);
        laonianXiehui.setUpdateTime(date);
        int res = laonianXiehuiMapper.insertSelective(laonianXiehui);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteLaonianXiehuiById(Integer id){

        int res = laonianXiehuiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateFunvXiehuiById(FunvXiehui funvXiehui){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        funvXiehui.setUpdateTime(date);
        FunvXiehuiExample funvXiehuiExample = new FunvXiehuiExample();
        FunvXiehuiExample.Criteria criteria = funvXiehuiExample.createCriteria();
        criteria.andIdEqualTo(funvXiehui.getId());
        int res = funvXiehuiMapper.updateByExampleSelective(funvXiehui,funvXiehuiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertFunvXiehuiById(FunvXiehui funvXiehui){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        funvXiehui.setCreateTime(date);
        funvXiehui.setUpdateTime(date);
        int res = funvXiehuiMapper.insertSelective(funvXiehui);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteFunvXiehuiById(Integer id){

        int res = funvXiehuiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateGongyiHuodongById(GongyiHuodong gongyiHuodong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        gongyiHuodong.setUpdateTime(date);
        GongyiHuodongExample gongyiHuodongExample = new GongyiHuodongExample();
        GongyiHuodongExample.Criteria criteria = gongyiHuodongExample.createCriteria();
        criteria.andIdEqualTo(gongyiHuodong.getId());
        int res = gongyiHuodongMapper.updateByExampleSelective(gongyiHuodong,gongyiHuodongExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertGongyiHuodongById(GongyiHuodong gongyiHuodong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        gongyiHuodong.setCreateTime(date);
        gongyiHuodong.setUpdateTime(date);
        int res = gongyiHuodongMapper.insertSelective(gongyiHuodong);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteGongyiHuodongById(Integer id){

        int res = gongyiHuodongMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateGongyiGuanggaoById(GongyiGuanggao gongyiGuanggao){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        gongyiGuanggao.setUpdateTime(date);
        GongyiGuanggaoExample gongyiGuanggaoExample = new GongyiGuanggaoExample();
        GongyiGuanggaoExample.Criteria criteria = gongyiGuanggaoExample.createCriteria();
        criteria.andIdEqualTo(gongyiGuanggao.getId());
        int res = gongyiGuanggaoMapper.updateByExampleSelective(gongyiGuanggao,gongyiGuanggaoExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertGongyiGuanggaoById(GongyiGuanggao gongyiGuanggao){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        gongyiGuanggao.setCreateTime(date);
        gongyiGuanggao.setUpdateTime(date);
        int res = gongyiGuanggaoMapper.insertSelective(gongyiGuanggao);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteGongyiGuanggaoById(Integer id){

        int res = gongyiGuanggaoMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateLingliYouyueById(LingliYouyue lingliYouyue){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        lingliYouyue.setUpdateTime(date);
        LingliYouyueExample lingliYouyueExample = new LingliYouyueExample();
        LingliYouyueExample.Criteria criteria = lingliYouyueExample.createCriteria();
        criteria.andIdEqualTo(lingliYouyue.getId());
        int res = lingliYouyueMapper.updateByExampleSelective(lingliYouyue,lingliYouyueExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLingliYouyueById(LingliYouyue lingliYouyue){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        lingliYouyue.setCreateTime(date);
        lingliYouyue.setUpdateTime(date);
        int res = lingliYouyueMapper.insertSelective(lingliYouyue);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteLingliYouyueById(Integer id){

        int res = lingliYouyueMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateRuoshiQuntiById(RuoshiQunti ruoshiQunti){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        ruoshiQunti.setUpdateTime(date);
        RuoshiQuntiExample ruoshiQuntiExample = new RuoshiQuntiExample();
        RuoshiQuntiExample.Criteria criteria = ruoshiQuntiExample.createCriteria();
        criteria.andIdEqualTo(ruoshiQunti.getId());
        int res = ruoshiQuntiMapper.updateByExampleSelective(ruoshiQunti,ruoshiQuntiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertRuoshiQuntiById(RuoshiQunti ruoshiQunti){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        ruoshiQunti.setCreateTime(date);
        ruoshiQunti.setUpdateTime(date);
        int res = ruoshiQuntiMapper.insertSelective(ruoshiQunti);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteRuoshiQuntiById(Integer id){

        int res = ruoshiQuntiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateLingliZhongxinById(LingliZhongxin lingliZhongxin){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        lingliZhongxin.setUpdateTime(date);
        LingliZhongxinExample lingliZhongxinExample = new LingliZhongxinExample();
        LingliZhongxinExample.Criteria criteria = lingliZhongxinExample.createCriteria();
        criteria.andIdEqualTo(lingliZhongxin.getId());
        int res = lingliZhongxinMapper.updateByExampleSelective(lingliZhongxin,lingliZhongxinExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLingliZhongxinById(LingliZhongxin lingliZhongxin){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        lingliZhongxin.setCreateTime(date);
        lingliZhongxin.setUpdateTime(date);
        int res = lingliZhongxinMapper.insertSelective(lingliZhongxin);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteLingliZhongxinById(Integer id){

        int res = lingliZhongxinMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }


}
