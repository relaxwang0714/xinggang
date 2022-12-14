package com.example.xinggang.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.*;
import com.example.xinggang.utils.Annotation.DataSource;
import com.example.xinggang.utils.DataSourcesNames;
import com.example.xinggang.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
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
    OverviewMapper overviewMapper;
    @Autowired
    PeopleStructureMapper peopleStructureMapper;
    @Autowired
    ReturnMsg returnMsg;

    @Autowired
    RedisUtils redisUtils;


    public String selectYetaiFenbuByVillageId(Integer id){
        redisUtils.setCacheObject("hhh", "123");
        String str = redisUtils.getCacheObject("hhh");
        System.out.println(str);
        YetaiFenbuExample yetaiFenbuExample = new YetaiFenbuExample();
        YetaiFenbuExample.Criteria criteria = yetaiFenbuExample.createCriteria();
        criteria.andVillageIdEqualTo(1);
        List<YetaiFenbu> yetaiFenbuList = yetaiFenbuMapper.selectByExample(yetaiFenbuExample);
        returnMsg.setData(yetaiFenbuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateYetaiFenbuById(YetaiFenbu yetaiFenbu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        yetaiFenbu.setUpdateTime(date);
        YetaiFenbuExample yetaiFenbuExample = new YetaiFenbuExample();
        YetaiFenbuExample.Criteria criteria = yetaiFenbuExample.createCriteria();
        criteria.andIdEqualTo(yetaiFenbu.getId());
        int res = yetaiFenbuMapper.updateByExampleSelective(yetaiFenbu,yetaiFenbuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertYetaiFenbuById(YetaiFenbu yetaiFenbu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        yetaiFenbu.setCreateTime(date);
        yetaiFenbu.setUpdateTime(date);
        int res = yetaiFenbuMapper.insertSelective(yetaiFenbu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteYetaiFenbuById(Integer id){
        int res = yetaiFenbuMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectOverviewByVillageId(Integer id){
        OverviewExample overviewExample = new OverviewExample();
        OverviewExample.Criteria criteria = overviewExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<Overview> overviewList = overviewMapper.selectByExample(overviewExample);
        returnMsg.setData(overviewList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateOverviewById(Overview overview){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        overview.setUpdateTime(date);
        OverviewExample overviewExample = new OverviewExample();
        OverviewExample.Criteria criteria = overviewExample.createCriteria();
        criteria.andIdEqualTo(overview.getId());
        int res = overviewMapper.updateByExampleSelective(overview,overviewExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertOverviewById(Overview overview){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        overview.setCreateTime(date);
        overview.setUpdateTime(date);
        int res = overviewMapper.insertSelective(overview);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteOverviewById(Integer id){
        int res = overviewMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateZuimeiById(ZuimeiXilie zuimeiXilie){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        zuimeiXilie.setUpdateTime(date);
        ZuimeiXilieExample zuimeiXilieExample = new ZuimeiXilieExample();
        ZuimeiXilieExample.Criteria criteria = zuimeiXilieExample.createCriteria();
        criteria.andIdEqualTo(zuimeiXilie.getId());
        int res = zuimeiXilieMapper.updateByExampleSelective(zuimeiXilie,zuimeiXilieExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZuimeiById(ZuimeiXilie zuimeiXilie){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        zuimeiXilie.setCreateTime(date);
        zuimeiXilie.setUpdateTime(date);
        int res = zuimeiXilieMapper.insertSelective(zuimeiXilie);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteZuimeiById(Integer id){
        int res = zuimeiXilieMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateXiangtuminsuById(XiangtuMinsu xiangtuMinsu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        xiangtuMinsu.setUpdateTime(date);
        XiangtuMinsuExample xiangtuMinsuExample = new XiangtuMinsuExample();
        XiangtuMinsuExample.Criteria criteria = xiangtuMinsuExample.createCriteria();
        criteria.andIdEqualTo(xiangtuMinsu.getId());
        int res = xiangtuMinsuMapper.updateByExampleSelective(xiangtuMinsu,xiangtuMinsuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertXiangtuminsuById(XiangtuMinsu xiangtuMinsu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        xiangtuMinsu.setCreateTime(date);
        xiangtuMinsu.setUpdateTime(date);
        int res = xiangtuMinsuMapper.insertSelective(xiangtuMinsu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteXiangtuminsuById(Integer id){
        int res = xiangtuMinsuMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
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
    public String updateXingangFengcaiById(XingangFengcai xingangFengcai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        xingangFengcai.setUpdateTime(date);
        XingangFengcaiExample xingangFengcaiExample = new XingangFengcaiExample();
        XingangFengcaiExample.Criteria criteria = xingangFengcaiExample.createCriteria();
        criteria.andIdEqualTo(xingangFengcai.getId());
        int res = xingangFengcaiMapper.updateByExampleSelective(xingangFengcai,xingangFengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertXingangFengcaiById(XingangFengcai xingangFengcai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        xingangFengcai.setCreateTime(date);
        xingangFengcai.setUpdateTime(date);
        int res = xingangFengcaiMapper.insertSelective(xingangFengcai);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteXingangFengcaiById(Integer id){
        int res = xingangFengcaiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    @DataSource(name = DataSourcesNames.SECOND)
    public String selectPeoplestructureByVillageId(Integer id){
        PeopleStructureExample peopleStructureExample = new PeopleStructureExample();
        PeopleStructureExample.Criteria criteria = peopleStructureExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<PeopleStructure> peopleStructureList = peopleStructureMapper.selectByExample(peopleStructureExample);
        returnMsg.setData(peopleStructureList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    @DataSource(name = DataSourcesNames.SECOND)
    public String updatePeoplestructureById(PeopleStructure peopleStructure){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        peopleStructure.setUpdateTime(date);
        PeopleStructureExample peopleStructureExample = new PeopleStructureExample();
        PeopleStructureExample.Criteria criteria = peopleStructureExample.createCriteria();
        criteria.andIdEqualTo(peopleStructure.getId());
        int res = peopleStructureMapper.updateByExampleSelective(peopleStructure,peopleStructureExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    @DataSource(name = DataSourcesNames.SECOND)
    public String insertPeoplestructureById(PeopleStructure peopleStructure){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        peopleStructure.setCreateTime(date);
        peopleStructure.setUpdateTime(date);
        int res = peopleStructureMapper.insertSelective(peopleStructure);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    @DataSource(name = DataSourcesNames.SECOND)
    public String logicdeletePeoplestructureById(Integer id){
        int res = peopleStructureMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }

}
