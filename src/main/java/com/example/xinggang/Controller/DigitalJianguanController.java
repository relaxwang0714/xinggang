package com.example.xinggang.Controller;

import com.example.xinggang.Service.DigitalJianguanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalJianguan")
public class DigitalJianguanController {
    @Autowired
    DigitalJianguanService digitalJianguanService;
    @RequestMapping("fengmaoGuankong")
    public String fengmaoGuankong(HttpServletRequest request){
        return digitalJianguanService.selectFengmaoGuankongByVillageId(1);
    }
    @RequestMapping("zaijian")
    public String zaijian(HttpServletRequest request){
        return digitalJianguanService.selectZaijianByVillageId(1);
    }

}
