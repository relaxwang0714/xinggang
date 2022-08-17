package com.example.xinggang.Controller;

import com.example.xinggang.Service.DigitalIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalIndustry")
public class DigitalIndustryController {
    @Autowired
    DigitalIndustryService digitalIndustryService;
    @RequestMapping("jingjiZengshou")
    public String jingjiZengshou(HttpServletRequest request){
        return digitalIndustryService.selectJingjiZengshouByVillageId(1);
    }
    @RequestMapping("tudiLiuzhuan")
    public String tudiLiuzhuan(HttpServletRequest request){
        return digitalIndustryService.selectTudiLiuzhuanByVillageId(1);
    }
    @RequestMapping("jitiFangchan")
    public String jitiFangchan(HttpServletRequest request){
        return digitalIndustryService.selectJitiFangchanByVillageId(1);
    }


}
