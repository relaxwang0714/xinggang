package com.example.xinggang.Controller;

import com.example.xinggang.Entity.JingjiZengshou;
import com.example.xinggang.Entity.JitiFangchan;
import com.example.xinggang.Entity.TudiLiuzhuan;
import com.example.xinggang.Service.DigitalIndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalIndustry")
public class DigitalIndustryController {
    @Autowired
    DigitalIndustryService digitalIndustryService;
    @GetMapping("jingjiZengshou")
    public String jingjiZengshou(HttpServletRequest request){
        return digitalIndustryService.selectJingjiZengshouByVillageId(1);
    }
    @PutMapping("jingjiZengshou")
    public String jingjiZengshouUpdate(HttpServletRequest request, @RequestBody JingjiZengshou jingjiZengshou){
        return digitalIndustryService.updateJingjiZengshouById(jingjiZengshou);
    }
    @PostMapping("jingjiZengshou")
    public String jingjiZengshouInsert(HttpServletRequest request ,@RequestBody JingjiZengshou jingjiZengshou){
        return digitalIndustryService.insertJingjiZengshouById(jingjiZengshou);
    }
    @GetMapping("tudiLiuzhuan")
    public String tudiLiuzhuan(HttpServletRequest request){
        return digitalIndustryService.selectTudiLiuzhuanByVillageId(1);
    }
    @PutMapping("tudiLiuzhuan")
    public String tudiLiuzhuanUpdate(HttpServletRequest request, @RequestBody TudiLiuzhuan tudiLiuzhuan){
        return digitalIndustryService.updateTudiLiuzhuanById(tudiLiuzhuan);
    }
    @PostMapping("tudiLiuzhuan")
    public String tudiLiuzhuanInsert(HttpServletRequest request ,@RequestBody TudiLiuzhuan tudiLiuzhuan){
        return digitalIndustryService.insertTudiLiuzhuanById(tudiLiuzhuan);
    }
    @RequestMapping("jitiFangchan")
    public String jitiFangchan(HttpServletRequest request){
        return digitalIndustryService.selectJitiFangchanByVillageId(1);
    }
    @PutMapping("jitiFangchan")
    public String jitiFangchanUpdate(HttpServletRequest request, @RequestBody JitiFangchan jitiFangchan){
        return digitalIndustryService.updateJitiFangchanById(jitiFangchan);
    }
    @PostMapping("jitiFangchan")
    public String jitiFangchanInsert(HttpServletRequest request ,@RequestBody JitiFangchan jitiFangchan){
        return digitalIndustryService.insertJitiFangchanById(jitiFangchan);
    }

}
