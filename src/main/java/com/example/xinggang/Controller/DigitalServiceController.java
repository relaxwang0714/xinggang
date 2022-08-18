package com.example.xinggang.Controller;

import com.example.xinggang.Service.DigitalServiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/DigitalService")
public class DigitalServiceController {
    @Autowired
    DigitalServiceServices digitalServiceServicess;
    @RequestMapping("puhuiJinrong")
    public String puhuiJinrong(HttpServletRequest request){
        return digitalServiceServicess.selectPuhuiJinrongByVillageId(1);
    }


}
