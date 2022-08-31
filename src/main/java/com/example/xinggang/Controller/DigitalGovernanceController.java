package com.example.xinggang.Controller;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Service.DigitalGovernanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalGovernance")
public class DigitalGovernanceController {
    @Autowired
    DigitalGovernanceService digitalGovernanceService;
    @GetMapping("CaomaoFengcai")
    public String CaomaoFengcai(HttpServletRequest request){
        return digitalGovernanceService.selectCaomaoFengcaiByVillageId(1);
    }
    @PutMapping("CaomaoFengcai")
    public String CaomaoFengcaiUpdate(HttpServletRequest request, @RequestBody CaomaoFengcai caomaoFengcai){
        return digitalGovernanceService.updateCaomaoFengcaiById(caomaoFengcai);
    }
    @PostMapping("CaomaoFengcai")
    public String CaomaoFengcaiLogicDelete(HttpServletRequest request,@RequestBody CaomaoFengcai caomaoFengcai){
        return digitalGovernanceService.insertCaomaoFengcaiById(caomaoFengcai);
    }
    @DeleteMapping("CaomaoFengcai/{id}")
    public String CaomaoFengcaiInsert(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteCaomaoFengcaiById(id);
    }
    @GetMapping("Caomaoyishi")
    public String Caomaoyishi(HttpServletRequest request){
        return digitalGovernanceService.selectCaomaoyishiByVillageId(1);
    }
    @PutMapping("Caomaoyishi")
    public String CaomaoyishiUpdate(HttpServletRequest request, @RequestBody CaomaoYishi caomaoYishi){
        return digitalGovernanceService.updateCaomaoyishiById(caomaoYishi);
    }
    @PostMapping("Caomaoyishi")
    public String CaomaoyishiInsert(HttpServletRequest request,@RequestBody CaomaoYishi caomaoYishi){
        return digitalGovernanceService.insertCaomaoyishiById(caomaoYishi);
    }
    @DeleteMapping("Caomaoyishi/{id}")
    public String CaomaoyishiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteCaomaoyishiById(id);
    }
    @GetMapping("Chuzufang")
    public String Chuzufang(HttpServletRequest request){
        return digitalGovernanceService.selectChuzufangByVillageId(1);
    }
    @PutMapping("Chuzufang")
    public String ChuzufangUpdate(HttpServletRequest request,@RequestBody Chuzufang chuzufang){
        return digitalGovernanceService.updateChuzufangById(chuzufang);
    }
    @PostMapping("Chuzufang")
    public String ChuzufangInsert(HttpServletRequest request,@RequestBody Chuzufang chuzufang){
        return digitalGovernanceService.insertChuzufangById(chuzufang);
    }
    @DeleteMapping("Chuzufang/{id}")
    public String ChuzufangDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteChuzufangById(id);
    }
    @GetMapping("college")
    public String college(HttpServletRequest request){
        return digitalGovernanceService.selectcollegeByVillageId(1);
    }
    @PutMapping("college")
    public String collegeUpdate(HttpServletRequest request,@RequestBody College college){
        return digitalGovernanceService.updatecollegeById(college);
    }
    @PostMapping("college")
    public String collegeInsert(HttpServletRequest request,@RequestBody College college){
        return digitalGovernanceService.insertcollegeById(college);
    }
    @DeleteMapping("college/{id}")
    public String collegeDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteCollegeById(id);
    }
    @GetMapping("cunminjifen")
    public String cunminjifen(HttpServletRequest request){
        return digitalGovernanceService.selectCunminjifenByVillageId(1);
    }
    @PutMapping("cunminjifen")
    public String cunminjifenUpdate(HttpServletRequest request,@RequestBody CunmingJifen cunmingJifen){
        return digitalGovernanceService.updateCunminjifenById(cunmingJifen);
    }
    @PostMapping("cunminjifen")
    public String cunminjifenInsert(HttpServletRequest request,@RequestBody CunmingJifen cunmingJifen){
        return digitalGovernanceService.insertCunminjifenById(cunmingJifen);
    }
    @DeleteMapping("cunminjifen/{id}")
    public String cunminjifenDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteCunminjifenById(id);
    }
    @GetMapping("dangjianZhendi")
    public String dangjianZhendi(HttpServletRequest request){
        return digitalGovernanceService.selectDangjianZhendiByVillageId(1);
    }
    @PutMapping("dangjianZhendi")
    public String dangjianZhendiUpdate(HttpServletRequest request,@RequestBody DangjianZhendi dangjianZhendi){
        return digitalGovernanceService.updateDangjianZhendiById(dangjianZhendi);
    }
    @PostMapping("dangjianZhendi")
    public String dangjianZhendiInsert(HttpServletRequest request,@RequestBody DangjianZhendi dangjianZhendi){
        return digitalGovernanceService.insertDangjianZhendiById(dangjianZhendi);
    }
    @DeleteMapping("dangjianZhendi/{id}")
    public String dangjianZhendiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteDangjianZhendiById(id);
    }
    @GetMapping("dianpu")
    public String dianpu(HttpServletRequest request){
        return digitalGovernanceService.selectDianpuByVillageId(1);
    }
    @PutMapping("dianpu")
    public String dianpuUpdate(HttpServletRequest request,@RequestBody Dianpu dianpu){
        return digitalGovernanceService.updateDianpuById(dianpu);
    }
    @PostMapping("dianpu")
    public String dianpuInsert(HttpServletRequest request,@RequestBody Dianpu dianpu){
        return digitalGovernanceService.insertDianpuById(dianpu);
    }
    @DeleteMapping("dianpu/{id}")
    public String dianpuDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteDianpuById(id);
    }
    @GetMapping("jianchaLianluozhan")
    public String jianchaLianluozhan(HttpServletRequest request){
        return digitalGovernanceService.selectJianchaLianluozhanByVillageId(1);
    }
    @PutMapping("jianchaLianluozhan")
    public String jianchaLianluozhanUpdate(HttpServletRequest request,@RequestBody JianchaLianluozhan jianchaLianluozhan){
        return digitalGovernanceService.updateJianchaLianluozhanById(jianchaLianluozhan);
    }
    @PostMapping("jianchaLianluozhan")
    public String jianchaLianluozhanInsert(HttpServletRequest request,@RequestBody JianchaLianluozhan jianchaLianluozhan){
        return digitalGovernanceService.insertJianchaLianluozhanById(jianchaLianluozhan);
    }
    @DeleteMapping("jianchaLianluozhan/{id}")
    public String jianchaLianluozhanDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteJianchaLianluozhanById(id);
    }
    @GetMapping("dangyuanAcitivity")
    public String dangyuanActivity(HttpServletRequest request){
        return digitalGovernanceService.selectDangyuanAcitivityByVillageId(1);
    }
    @PutMapping("dangyuanAcitivity")
    public String dangyuanActivityUpdate(HttpServletRequest request,@RequestBody DangyuanHuodong dangyuanHuodong){
        return digitalGovernanceService.updateDangyuanActivityById(dangyuanHuodong);
    }
    @PostMapping("dangyuanAcitivity")
    public String dangyuanActivityInsert(HttpServletRequest request,@RequestBody DangyuanHuodong dangyuanHuodong){
        return digitalGovernanceService.insertDangyuanActivityById(dangyuanHuodong);
    }
    @DeleteMapping("dangyuanAcitivity/{id}")
    public String dangyuanActivityDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteDangyuanActivityById(id);
    }
    @GetMapping("dangyuan/{wanggeId}")
    public String dangyuan(HttpServletRequest request, @PathVariable("wanggeId") Integer wanggeId){
        return digitalGovernanceService.selectDangyuanByWangGeId(1,wanggeId);
    }
    @PutMapping("dangyuan")
    public String dangyuanUpdate(HttpServletRequest request,@RequestBody Dangyuan dangyuan){
        return digitalGovernanceService.updateDangyuanByWangGeId(dangyuan);
    }
    @PostMapping("dangyuan")
    public String dangyuanInsert(HttpServletRequest request,@RequestBody Dangyuan dangyuan){
        return digitalGovernanceService.insertDangyuanByWangGeId(dangyuan);
    }
    @DeleteMapping("dangyuan/{id}")
    public String dangyuanDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteDangyuanById(id);
    }
    @GetMapping("lianxihu/{wanggeId}/{dangyuanId}")
    public String lianxihu(HttpServletRequest request,@PathVariable("wanggeId")Integer wanggeId ,@PathVariable("dangyuanId") Integer dangyuanId){
        return digitalGovernanceService.selectLianxihuByWangGeId(1,wanggeId,dangyuanId);
    }
    @PutMapping("lianxihu")
    public String lianxihuUpdate(HttpServletRequest request,@RequestBody Lianxihu lianxihu){
        return digitalGovernanceService.updateLianxihuById(lianxihu);
    }
    @PostMapping("lianxihu")
    public String lianxihuInsert(HttpServletRequest request,@RequestBody Lianxihu lianxihu){
        return digitalGovernanceService.insertLianxihuById(lianxihu);
    }
    @DeleteMapping("lianxihu/{id}")
    public String lianxihuDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteLianxihuById(id);
    }
    @GetMapping("ShijianTongban")
    public String shijianTongban(HttpServletRequest request){
        return digitalGovernanceService.selectShijianTongbanByVillageId(1);
    }
    @PutMapping("ShijianTongban")
    public String shijianTongbanUpdate(HttpServletRequest request,@RequestBody ShijianTongban shijianTongban){
        return digitalGovernanceService.updateShijianTongbanById(shijianTongban);
    }
    @PostMapping("ShijianTongban")
    public String shijianTongbanInsert(HttpServletRequest request,@RequestBody ShijianTongban shijianTongban){
        return digitalGovernanceService.insertShijianTongbanById(shijianTongban);
    }
    @DeleteMapping("ShijianTongban/{id}")
    public String ShijianTongbanDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteShijianTongbanById(id);
    }
    @GetMapping("wanggeXinxi")
    public String wanggeXinxi(HttpServletRequest request){
        return digitalGovernanceService.selectWanggeXinxiByVillageId(1);
    }
    @PutMapping("wanggeXinxi")
    public String wanggeXinxiUpdate(HttpServletRequest request,@RequestBody WanggeXinxi wanggeXinxi){
        return digitalGovernanceService.updateWanggeXinxiById(wanggeXinxi);
    }
    @PostMapping("wanggeXinxi")
    public String wanggeXinxiInsert(HttpServletRequest request,@RequestBody WanggeXinxi wanggeXinxi){
        return digitalGovernanceService.insertWanggeXinxiById(wanggeXinxi);
    }
    @DeleteMapping("wanggeXinxi/{id}")
    public String wanggeXinxiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteWanggeXinxiById(id);
    }
    @GetMapping("xiangmuGongkai")
    public String xiangmuGongkai(HttpServletRequest request){
        return digitalGovernanceService.selectXiangmuGongkaiByVillageId(1);
    }
    @PutMapping("xiangmuGongkai")
    public String xiangmuGongkaiUpdate(HttpServletRequest request,@RequestBody XiangmuGongkai xiangmuGongkai){
        return digitalGovernanceService.updateXiangmuGongkaiById(xiangmuGongkai);
    }
    @PostMapping("xiangmuGongkai")
    public String xiangmuGongkaiInsert(HttpServletRequest request,@RequestBody XiangmuGongkai xiangmuGongkai){
        return digitalGovernanceService.insertXiangmuGongkaiById(xiangmuGongkai);
    }
    @DeleteMapping("xiangmuGongkai/{id}")
    public String xiangmuGongkaiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicDeleteXiangmuGongkaiById(id);
    }
    @GetMapping("zhihuiDangjian")
    public String zhihuiDangjian(HttpServletRequest request){
        return digitalGovernanceService.selectZhihuiDangjianByVillageId(1);
    }
    @PutMapping("zhihuiDangjian")
    public String zhihuiDangjianUpdate(HttpServletRequest request,@RequestBody ZhihuiDangjian zhihuiDangjian){
        return digitalGovernanceService.updateZhihuiDangjianById(zhihuiDangjian);
    }
    @PostMapping("zhihuiDangjian")
    public String zhihuiDangjianInsert(HttpServletRequest request,@RequestBody ZhihuiDangjian zhihuiDangjian){
        return digitalGovernanceService.insertZhihuiDangjianById(zhihuiDangjian);
    }
    @DeleteMapping("zhihuiDangjian/{id}")
    public String zhihuiDangjianDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalGovernanceService.logicdeleteZhihuiDangjianById(id);
    }
}
