package com.example.xinggang.Service;

import com.example.xinggang.Entity.WanggeXinxi;
import com.example.xinggang.Entity.ZhihuiDangjianExample;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    CunmingJifenMapper cumnmingJifenMapper;
    @Autowired
    ChuzufangMapper chuzufangMapper;
    @Autowired
    DianpuMapper dianpuMapper;
    @Autowired
    ShijianTongbanMapper shijianTongbanMapper;
    @Autowired
    CollegeMapper collegeMapper;

}
