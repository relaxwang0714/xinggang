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
public class DigitalGovernanceService {
    @Autowired
    WanggeXinxiMapper wanggeXinxiMapper;
    @Autowired
    ZhihuiDangjianMapper zhihuiDangjianMapper;
    @Autowired
    DangyuanHuodongMapper dangyuanHuodongMapper;
    @Autowired
    DangyuanMapper dangyuanMapper;
    @Autowired
    LianxihuMapper lianxihuMapper;
    @Autowired
    DangjianZhendiMapper dangjianZhendiMapper;
    @Autowired
    CaomaoYishiMapper caomaoYishiMapper;
    @Autowired
    CaomaoFengcaiMapper caomaoFengcaiMapper;
    @Autowired
    XiangmuGongkaiMapper xiangmuGongkaiMapper;
    @Autowired
    JianchaLianluozhanMapper jianchaLianluozhanMapper;
    @Autowired
    CunmingJifenMapper cunmingJifenMapper;
    @Autowired
    ChuzufangMapper chuzufangMapper;
    @Autowired
    DianpuMapper dianpuMapper;
    @Autowired
    ShijianTongbanMapper shijianTongbanMapper;
    @Autowired
    CollegeMapper collegeMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectWanggeXinxiByVillageId(Integer id){
        WanggeXinxiExample wanggeXinxiExample = new WanggeXinxiExample();
        //是所有类的方法，不是实例的方法
        WanggeXinxiExample.Criteria criteria = wanggeXinxiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<WanggeXinxi> wanggeXinxiList = wanggeXinxiMapper.selectByExample(wanggeXinxiExample);
        returnMsg.setData(wanggeXinxiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateWanggeXinxiById(WanggeXinxi wanggeXinxi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        wanggeXinxi.setUpdateTime(date);
        WanggeXinxiExample wanggeXinxiExample = new WanggeXinxiExample();
        WanggeXinxiExample.Criteria criteria = wanggeXinxiExample.createCriteria();
        criteria.andIdEqualTo(wanggeXinxi.getId());
        int res = wanggeXinxiMapper.updateByExampleSelective(wanggeXinxi,wanggeXinxiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertWanggeXinxiById(WanggeXinxi wanggeXinxi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        wanggeXinxi.setCreateTime(date);
        wanggeXinxi.setUpdateTime(date);
        int res = wanggeXinxiMapper.insertSelective(wanggeXinxi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteWanggeXinxiById(Integer id){
        int res = wanggeXinxiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectZhihuiDangjianByVillageId(Integer id){
        ZhihuiDangjianExample zhihuiDangjianExample = new ZhihuiDangjianExample();
        //是所有类的方法，不是实例的方法
        ZhihuiDangjianExample.Criteria criteria = zhihuiDangjianExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<ZhihuiDangjian> zhihuiDangjianList = zhihuiDangjianMapper.selectByExample(zhihuiDangjianExample);
        returnMsg.setData(zhihuiDangjianList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateZhihuiDangjianById(ZhihuiDangjian zhihuiDangjian){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        zhihuiDangjian.setUpdateTime(date);
        ZhihuiDangjianExample zhihuiDangjianExample = new ZhihuiDangjianExample();
        ZhihuiDangjianExample.Criteria criteria = zhihuiDangjianExample.createCriteria();
        criteria.andIdEqualTo(zhihuiDangjian.getId());
        int res = zhihuiDangjianMapper.updateByExampleSelective(zhihuiDangjian,zhihuiDangjianExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertZhihuiDangjianById(ZhihuiDangjian zhihuiDangjian){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        zhihuiDangjian.setCreateTime(date);
        zhihuiDangjian.setUpdateTime(date);
        int res = zhihuiDangjianMapper.insertSelective(zhihuiDangjian);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteZhihuiDangjianById(Integer id){
        int res = zhihuiDangjianMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDangyuanAcitivityByVillageId(Integer id){
        DangyuanHuodongExample dangyuanHuodongExample = new DangyuanHuodongExample();
        //是所有类的方法，不是实例的方法
        DangyuanHuodongExample.Criteria criteria = dangyuanHuodongExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<DangyuanHuodong> dangyuanHuodongList = dangyuanHuodongMapper.selectByExample(dangyuanHuodongExample);
        returnMsg.setData(dangyuanHuodongList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangyuanActivityById(DangyuanHuodong dangyuanHuodong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        dangyuanHuodong.setUpdateTime(date);
        DangyuanHuodongExample dangyuanHuodongExample = new DangyuanHuodongExample();
        DangyuanHuodongExample.Criteria criteria = dangyuanHuodongExample.createCriteria();
        criteria.andIdEqualTo(dangyuanHuodong.getId());
        int res = dangyuanHuodongMapper.updateByExampleSelective(dangyuanHuodong,dangyuanHuodongExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangyuanActivityById(DangyuanHuodong dangyuanHuodong){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        dangyuanHuodong.setCreateTime(date);
        dangyuanHuodong.setUpdateTime(date);
        int res = dangyuanHuodongMapper.insertSelective(dangyuanHuodong);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteDangyuanActivityById(Integer id){
        int res = dangyuanHuodongMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDangyuanByWangGeId(Integer id,Integer wanggeId){
        DangyuanExample dangyuanExample = new DangyuanExample();
        //是所有类的方法，不是实例的方法
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        criteria.andWanggeIdEqualTo(wanggeId);
        List<Dangyuan> dangyuanList = dangyuanMapper.selectByExample(dangyuanExample);
        returnMsg.setData(dangyuanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangyuanByWangGeId(Dangyuan dangyuan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        dangyuan.setUpdateTime(date);
        DangyuanExample dangyuanExample = new DangyuanExample();
        DangyuanExample.Criteria criteria = dangyuanExample.createCriteria();
        criteria.andIdEqualTo(dangyuan.getId());
        int res = dangyuanMapper.updateByExampleSelective(dangyuan,dangyuanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangyuanByWangGeId(Dangyuan dangyuan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        dangyuan.setCreateTime(date);
        dangyuan.setUpdateTime(date);
        int res = dangyuanMapper.insertSelective(dangyuan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteDangyuanById(Integer id){
        int res = dangyuanMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectLianxihuByWangGeId(Integer id,Integer wanggeId,Integer dangyuanId){
        LianxihuExample lianxihuExample = new LianxihuExample();
        //是所有类的方法，不是实例的方法
        LianxihuExample.Criteria criteria = lianxihuExample.createCriteria();
        criteria.andDangyuanIdEqualTo(dangyuanId);
        criteria.andWanggeIdEqualTo(wanggeId);
        criteria.andVillageIdEqualTo(id);
        List<Lianxihu> lianxihuList = lianxihuMapper.selectByExample(lianxihuExample);
        returnMsg.setData(lianxihuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateLianxihuById(Lianxihu lianxihu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        lianxihu.setUpdateTime(date);
        LianxihuExample lianxihuExample = new LianxihuExample();
        LianxihuExample.Criteria criteria = lianxihuExample.createCriteria();
        criteria.andIdEqualTo(lianxihu.getId());
        int res = lianxihuMapper.updateByExampleSelective(lianxihu,lianxihuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertLianxihuById(Lianxihu lianxihu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        lianxihu.setCreateTime(date);
        lianxihu.setUpdateTime(date);
        int res = lianxihuMapper.insertSelective(lianxihu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteLianxihuById(Integer id){
        int res = lianxihuMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDangjianZhendiByVillageId(Integer id){
        DangjianZhendiExample dangjianZhendiExample = new DangjianZhendiExample();
        //是所有类的方法，不是实例的方法
        DangjianZhendiExample.Criteria criteria = dangjianZhendiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<DangjianZhendi> dangjianZhendiList = dangjianZhendiMapper.selectByExampleWithBLOBs(dangjianZhendiExample);
        returnMsg.setData(dangjianZhendiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDangjianZhendiById(DangjianZhendi dangjianZhendi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        dangjianZhendi.setUpdateTime(date);
        DangjianZhendiExample dangjianZhendiExample = new DangjianZhendiExample();
        DangjianZhendiExample.Criteria criteria = dangjianZhendiExample.createCriteria();
        criteria.andIdEqualTo(dangjianZhendi.getId());
        int res = dangjianZhendiMapper.updateByExampleSelective(dangjianZhendi,dangjianZhendiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDangjianZhendiById(DangjianZhendi dangjianZhendi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        dangjianZhendi.setCreateTime(date);
        dangjianZhendi.setUpdateTime(date);
        int res = dangjianZhendiMapper.insertSelective(dangjianZhendi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteDangjianZhendiById(Integer id){
        int res = dangjianZhendiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectCaomaoyishiByVillageId(Integer id){
        CaomaoYishiExample caomaoYishiExample = new CaomaoYishiExample();
        //是所有类的方法，不是实例的方法
        CaomaoYishiExample.Criteria criteria = caomaoYishiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<CaomaoYishi> caomaoYishiList = caomaoYishiMapper.selectByExample(caomaoYishiExample);
        returnMsg.setData(caomaoYishiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateCaomaoyishiById(CaomaoYishi caomaoYishi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        caomaoYishi.setUpdateTime(date);
        CaomaoYishiExample caomaoYishiExample = new CaomaoYishiExample();
        CaomaoYishiExample.Criteria criteria = caomaoYishiExample.createCriteria();
        criteria.andIdEqualTo(caomaoYishi.getId());
        int res = caomaoYishiMapper.updateByExampleSelective(caomaoYishi,caomaoYishiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCaomaoyishiById(CaomaoYishi caomaoYishi){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        caomaoYishi.setCreateTime(date);
        caomaoYishi.setUpdateTime(date);
        int res = caomaoYishiMapper.insertSelective(caomaoYishi);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicdeleteCaomaoyishiById(Integer id){
        int res = caomaoYishiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectCaomaoFengcaiByVillageId(Integer id){
        CaomaoFengcaiExample caomaoFengcaiExample = new CaomaoFengcaiExample();
        //是所有类的方法，不是实例的方法
        CaomaoFengcaiExample.Criteria criteria = caomaoFengcaiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<CaomaoFengcai> caomaoFengcaiList = caomaoFengcaiMapper.selectByExample(caomaoFengcaiExample);
        returnMsg.setData(caomaoFengcaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateCaomaoFengcaiById(CaomaoFengcai caomaoFengcai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        caomaoFengcai.setUpdateTime(date);
        CaomaoFengcaiExample caomaoFengcaiExample = new CaomaoFengcaiExample();
        CaomaoFengcaiExample.Criteria criteria = caomaoFengcaiExample.createCriteria();
        criteria.andIdEqualTo(caomaoFengcai.getId());
        int res = caomaoFengcaiMapper.updateByExampleSelective(caomaoFengcai,caomaoFengcaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCaomaoFengcaiById(CaomaoFengcai caomaoFengcai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        caomaoFengcai.setCreateTime(date);
        caomaoFengcai.setUpdateTime(date);
        int res = caomaoFengcaiMapper.insertSelective(caomaoFengcai);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteCaomaoFengcaiById(Integer id){

        int res = caomaoFengcaiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectXiangmuGongkaiByVillageId(Integer id){
        XiangmuGongkaiExample xiangmuGongkaiExample = new XiangmuGongkaiExample();
        //是所有类的方法，不是实例的方法
        XiangmuGongkaiExample.Criteria criteria = xiangmuGongkaiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<XiangmuGongkai> xiangmuGongkaiList = xiangmuGongkaiMapper.selectByExample(xiangmuGongkaiExample);
        returnMsg.setData(xiangmuGongkaiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateXiangmuGongkaiById(XiangmuGongkai xiangmuGongkai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        xiangmuGongkai.setUpdateTime(date);
        XiangmuGongkaiExample xiangmuGongkaiExample = new XiangmuGongkaiExample();
        XiangmuGongkaiExample.Criteria criteria = xiangmuGongkaiExample.createCriteria();
        criteria.andIdEqualTo(xiangmuGongkai.getId());
        int res = xiangmuGongkaiMapper.updateByExampleSelective(xiangmuGongkai,xiangmuGongkaiExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertXiangmuGongkaiById(XiangmuGongkai xiangmuGongkai){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        xiangmuGongkai.setCreateTime(date);
        xiangmuGongkai.setUpdateTime(date);
        int res = xiangmuGongkaiMapper.insertSelective(xiangmuGongkai);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteXiangmuGongkaiById(Integer id){

        int res = caomaoFengcaiMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectJianchaLianluozhanByVillageId(Integer id){
        JianchaLianluozhanExample jianchaLianluozhanExample = new JianchaLianluozhanExample();
        //是所有类的方法，不是实例的方法
        JianchaLianluozhanExample.Criteria criteria = jianchaLianluozhanExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<JianchaLianluozhan> jianchaLianluozhanList = jianchaLianluozhanMapper.selectByExample(jianchaLianluozhanExample);
        returnMsg.setData(jianchaLianluozhanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateJianchaLianluozhanById(JianchaLianluozhan jianchaLianluozhan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        jianchaLianluozhan.setUpdateTime(date);
        JianchaLianluozhanExample jianchaLianluozhanExample = new JianchaLianluozhanExample();
        JianchaLianluozhanExample.Criteria criteria = jianchaLianluozhanExample.createCriteria();
        criteria.andIdEqualTo(jianchaLianluozhan.getId());
        int res = jianchaLianluozhanMapper.updateByExampleSelective(jianchaLianluozhan,jianchaLianluozhanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertJianchaLianluozhanById(JianchaLianluozhan jianchaLianluozhan){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        jianchaLianluozhan.setCreateTime(date);
        jianchaLianluozhan.setUpdateTime(date);
        int res = jianchaLianluozhanMapper.insertSelective(jianchaLianluozhan);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteJianchaLianluozhanById(Integer id){

        int res = jianchaLianluozhanMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectCunminjifenByVillageId(Integer id){
        CunmingJifenExample cunmingJifenExample = new CunmingJifenExample();
        //是所有类的方法，不是实例的方法
        CunmingJifenExample.Criteria criteria = cunmingJifenExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<CunmingJifen> cunmingJifenList = cunmingJifenMapper.selectByExample(cunmingJifenExample);
        returnMsg.setData(cunmingJifenList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateCunminjifenById(CunmingJifen cunmingJifen){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        cunmingJifen.setUpdateTime(date);
        CunmingJifenExample cunmingJifenExample = new CunmingJifenExample();
        CunmingJifenExample.Criteria criteria = cunmingJifenExample.createCriteria();
        criteria.andIdEqualTo(cunmingJifen.getId());
        int res = cunmingJifenMapper.updateByExampleSelective(cunmingJifen,cunmingJifenExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertCunminjifenById(CunmingJifen cunmingJifen){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        cunmingJifen.setCreateTime(date);
        cunmingJifen.setUpdateTime(date);
        int res = cunmingJifenMapper.insertSelective(cunmingJifen);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteCunminjifenById(Integer id){

        int res = cunmingJifenMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectShijianTongbanByVillageId(Integer id){
        ShijianTongbanExample shijianTongbanExample = new ShijianTongbanExample();
        //是所有类的方法，不是实例的方法
        ShijianTongbanExample.Criteria criteria = shijianTongbanExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<ShijianTongban> shijiantongbanList = shijianTongbanMapper.selectByExample(shijianTongbanExample);
        returnMsg.setData(shijiantongbanList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateShijianTongbanById(ShijianTongban shijianTongban){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        shijianTongban.setUpdateTime(date);
        ShijianTongbanExample shijianTongbanExample = new ShijianTongbanExample();
        ShijianTongbanExample.Criteria criteria = shijianTongbanExample.createCriteria();
        criteria.andIdEqualTo(shijianTongban.getId());
        int res = shijianTongbanMapper.updateByExampleSelective(shijianTongban,shijianTongbanExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertShijianTongbanById(ShijianTongban shijianTongban){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        shijianTongban.setCreateTime(date);
        shijianTongban.setUpdateTime(date);
        int res = shijianTongbanMapper.insertSelective(shijianTongban);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteShijianTongbanById(Integer id){

        int res = shijianTongbanMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectChuzufangByVillageId(Integer id){
        ChuzufangExample chuzufangExample = new ChuzufangExample();
        //是所有类的方法，不是实例的方法
        ChuzufangExample.Criteria criteria = chuzufangExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<Chuzufang> chuzufangList = chuzufangMapper.selectByExample(chuzufangExample);
        returnMsg.setData(chuzufangList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateChuzufangById(Chuzufang chuzufang){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        chuzufang.setUpdateTime(date);
        ChuzufangExample chuzufangExample = new ChuzufangExample();
        ChuzufangExample.Criteria criteria = chuzufangExample.createCriteria();
        criteria.andIdEqualTo(chuzufang.getId());
        int res = chuzufangMapper.updateByExampleSelective(chuzufang,chuzufangExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertChuzufangById(Chuzufang chuzufang){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        chuzufang.setCreateTime(date);
        chuzufang.setUpdateTime(date);
        int res = chuzufangMapper.insertSelective(chuzufang);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteChuzufangById(Integer id){

        int res = chuzufangMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectcollegeByVillageId(Integer id){
        CollegeExample collegeExample = new CollegeExample();
        //是所有类的方法，不是实例的方法
        CollegeExample.Criteria criteria = collegeExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<College> collegeList = collegeMapper.selectByExample(collegeExample);
        returnMsg.setData(collegeList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updatecollegeById(College college){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        college.setUpdateTime(date);
        CollegeExample collegeExample = new CollegeExample();
        CollegeExample.Criteria criteria = collegeExample.createCriteria();
        criteria.andIdEqualTo(college.getId());
        int res = collegeMapper.updateByExampleSelective(college,collegeExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertcollegeById(College college){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        college.setCreateTime(date);
        college.setUpdateTime(date);
        int res = collegeMapper.insertSelective(college);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteCollegeById(Integer id){

        int res = collegeMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
    public String selectDianpuByVillageId(Integer id){
        DianpuExample dianpuExample = new DianpuExample();
        //是所有类的方法，不是实例的方法
        DianpuExample.Criteria criteria = dianpuExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<Dianpu> dianpuList = dianpuMapper.selectByExampleWithBLOBs(dianpuExample);
        returnMsg.setData(dianpuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
    public String updateDianpuById(Dianpu dianpu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone( ZoneId.systemDefault()).toInstant());
        dianpu.setUpdateTime(date);
        DianpuExample dianpuExample = new DianpuExample();
        DianpuExample.Criteria criteria = dianpuExample.createCriteria();
        criteria.andIdEqualTo(dianpu.getId());
        int res = dianpuMapper.updateByExampleSelective(dianpu,dianpuExample);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "更新成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"更新失败");
        }
    }
    public String insertDianpuById(Dianpu dianpu){
        LocalDateTime dt = LocalDateTime.now();
        Date date = Date.from(dt.atZone(ZoneId.systemDefault()).toInstant());
        dianpu.setCreateTime(date);
        dianpu.setUpdateTime(date);
        int res = dianpuMapper.insertSelective(dianpu);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "添加成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"添加失败");
        }
    }
    public String logicDeleteDianpuById(Integer id){

        int res = dianpuMapper.logicdeleteByPrimaryKey(id);
        if(res ==1) {
            return returnMsg.toString(String.valueOf(res), "删除成功");
        }else{
            return returnMsg.toString(String.valueOf(res),"删除失败");
        }
    }
}
