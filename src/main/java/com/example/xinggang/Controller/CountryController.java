package com.example.xinggang.Controller;

import com.example.xinggang.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Country")
public class CountryController {
    @Autowired
    CountryService countryService;
    @RequestMapping("yetaifenbu")
    public String yetaifenbu(HttpServletRequest request){
        return countryService.selectYetaiFenbuByVillageId(1);
    }
    @RequestMapping("overview")
    public String Overview(HttpServletRequest request){
        return countryService.selectOverviewByVillageId(1);
    }
    @RequestMapping("zuimei")
    public String Zuimei(HttpServletRequest request){
        return countryService.selectZuimeiByVillageId(1);
    }
    @RequestMapping("xingangFengcai")
    public String XingangFengcai(HttpServletRequest request){
        return countryService.selectXingangFengcaiByVillageId(1);
    }
    @RequestMapping("xiangtuminsu")
    public String Xiangtuminsu(HttpServletRequest request){
        return countryService.selectXiangtuminsuByVillageId(1);
    }
    @RequestMapping("Peoplestructure")
    public String Peoplestructure(HttpServletRequest request){
        return countryService.selectPeoplestructureByVillageId(1);
    }
}
