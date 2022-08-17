package com.example.xinggang.Service;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public String selectDangjianZhendiByVillageId(Integer id){
        DangjianZhendiExample dangjianZhendiExample = new DangjianZhendiExample();
        //是所有类的方法，不是实例的方法
        DangjianZhendiExample.Criteria criteria = dangjianZhendiExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<DangjianZhendi> dangjianZhendiList = dangjianZhendiMapper.selectByExample(dangjianZhendiExample);
        returnMsg.setData(dangjianZhendiList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
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
    public String selectDianpuByVillageId(Integer id){
        DianpuExample dianpuExample = new DianpuExample();
        //是所有类的方法，不是实例的方法
        DianpuExample.Criteria criteria = dianpuExample.createCriteria();
        criteria.andVillageIdEqualTo(id);
        List<Dianpu> dianpuList = dianpuMapper.selectByExample(dianpuExample);
        returnMsg.setData(dianpuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
        return returnMsg.toString();
    }
}
