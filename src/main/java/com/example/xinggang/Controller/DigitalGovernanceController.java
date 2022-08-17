package com.example.xinggang.Controller;

import com.example.xinggang.Service.DigitalGovernanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalGovernance")
public class DigitalGovernanceController {
    @Autowired
    DigitalGovernanceService digitalGovernanceService;
    @RequestMapping("CaomaoFengcai")
    public String CaomaoFengcai(HttpServletRequest request){
        return digitalGovernanceService.selectCaomaoFengcaiByVillageId(1);
    }
    @RequestMapping("Caomaoyishi")
    public String Caomaoyishi(HttpServletRequest request){
        return digitalGovernanceService.selectCaomaoyishiByVillageId(1);
    }
    @RequestMapping("Chuzufang")
    public String Chuzufang(HttpServletRequest request){
        return digitalGovernanceService.selectChuzufangByVillageId(1);
    }
    @RequestMapping("college")
    public String college(HttpServletRequest request){
        return digitalGovernanceService.selectcollegeByVillageId(1);
    }
    @RequestMapping("cunminjifen")
    public String cunminjifen(HttpServletRequest request){
        return digitalGovernanceService.selectCunminjifenByVillageId(1);
    }
    @RequestMapping("dangjianZhendi")
    public String dangjianZhendi(HttpServletRequest request){
        return digitalGovernanceService.selectDangjianZhendiByVillageId(1);
    }
    @RequestMapping("dianpu")
    public String dianpu(HttpServletRequest request){
        return digitalGovernanceService.selectDianpuByVillageId(1);
    }
    @RequestMapping("jianchaLianluozhan")
    public String jianchaLianluozhan(HttpServletRequest request){
        return digitalGovernanceService.selectJianchaLianluozhanByVillageId(1);
    }
    @RequestMapping("dangyuanAcitivity")
    public String dangyuanAcitivity(HttpServletRequest request){
        return digitalGovernanceService.selectDangyuanAcitivityByVillageId(1);
    }
    @RequestMapping("ShijianTongban")
    public String shijianTongban(HttpServletRequest request){
        return digitalGovernanceService.selectShijianTongbanByVillageId(1);
    }
    @RequestMapping("wanggeXinxi")
    public String wanggeXinxi(HttpServletRequest request){
        return digitalGovernanceService.selectWanggeXinxiByVillageId(1);
    }
    @RequestMapping("xiangmuGongkai")
    public String xiangmuGongkai(HttpServletRequest request){
        return digitalGovernanceService.selectXiangmuGongkaiByVillageId(1);
    }
    @RequestMapping("zhihuiDangjian")
    public String zhihuiDangjian(HttpServletRequest request){
        return digitalGovernanceService.selectZhihuiDangjianByVillageId(1);
    }
}
