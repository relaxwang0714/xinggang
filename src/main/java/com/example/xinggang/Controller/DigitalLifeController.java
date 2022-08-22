package com.example.xinggang.Controller;

import com.example.xinggang.Service.DigitalLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/DigitalLife")
public class DigitalLifeController {
    @Autowired
    DigitalLifeService digitalLifeService;

    @RequestMapping("lingliZhongxin")
    public String lingliZhongxin(HttpServletRequest request){
        return digitalLifeService.selecLingliZhongxinByVillageId(1);
    }
    @RequestMapping("ruoshiQunti")
    public String ruoshiQunti(HttpServletRequest request){
        return digitalLifeService.selectRuoshiQuntiByVillageId(1);
    }
    @RequestMapping("canji")
    public String canjiList(HttpServletRequest request){
        return digitalLifeService.selectCanjirenByVillageId(1);
    }
    @RequestMapping("dibao")
    public String dibaoList(HttpServletRequest request){
        return digitalLifeService.selectdibaohuByVillageId(1);
    }
    @RequestMapping("oldPeople")
    public String oldPeopleList(HttpServletRequest request){
        return digitalLifeService.selectOldPeopleByVillageId(1);
    }
    @RequestMapping("lingliYouyue")
    public String lingliYouyue(HttpServletRequest request){
        return digitalLifeService.selectLingliYouyueByVillageId(1);
    }
    @RequestMapping("gongyiGuanggao")
    public String gongyiGuanggao(HttpServletRequest request){
        return digitalLifeService.selectGongyiGuanggaoByVillageId(1);
    }
    @RequestMapping("laonianxiehui")
    public String laonianxiehui(HttpServletRequest request){
        return digitalLifeService.selectLaonianXiehuiByVillageId(1);
    }
    @RequestMapping("funvxiehui")
    public String funvxiehui(HttpServletRequest request){
        return digitalLifeService.selectFunvXiehuiByVillageId(1);
    }
    @RequestMapping("gongyiHuodong")
    public String gongyiHuodong(HttpServletRequest request){
        return digitalLifeService.selectGongyiHuodongByVillageId(1);
    }
}
