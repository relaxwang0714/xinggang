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
        return digitalLifeService.selecRuoshiQuntiByVillageId(1);
    }
    @RequestMapping("lingliYouyue")
    public String lingliYouyue(HttpServletRequest request){
        return digitalLifeService.selectLingliYouyueByVillageId(1);
    }
    @RequestMapping("gongyiGuanggao")
    public String gongyiGuanggao(HttpServletRequest request){
        return digitalLifeService.selectGongyiGuanggaoByVillageId(1);
    }
    @RequestMapping("gongyiZuzhi")
    public String gongyiZuzhi(HttpServletRequest request){
        return digitalLifeService.selectGongyiZuzhiByVillageId(1);
    }
    @RequestMapping("gongyiHuodong")
    public String gongyiHuodong(HttpServletRequest request){
        return digitalLifeService.selectGongyiHuodongByVillageId(1);
    }
}
