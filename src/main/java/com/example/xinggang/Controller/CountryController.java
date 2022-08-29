package com.example.xinggang.Controller;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/Country")
public class CountryController {
    @Autowired
    CountryService countryService;
    @GetMapping("yetaifenbu")
    public String yetaifenbu(HttpServletRequest request){
        return countryService.selectYetaiFenbuByVillageId(1);
    }
    @PutMapping("yetaifenbu")
    public String yetaifenbuUpdate(HttpServletRequest request, @RequestBody YetaiFenbu yetaiFenbu){
        return countryService.updateYetaiFenbuById(yetaiFenbu);
    }
    @PostMapping("yetaifenbu")
    public String yetaifenbuInsert(HttpServletRequest request, @RequestBody YetaiFenbu yetaiFenbu){
        return countryService.insertYetaiFenbuById(yetaiFenbu);
    }
    @GetMapping("overview")
    public String Overview(HttpServletRequest request){
        return countryService.selectOverviewByVillageId(1);
    }
    @PutMapping("overview")
    public String OverviewUpdate(HttpServletRequest request, @RequestBody Overview overview){
        return countryService.updateOverviewById(overview);
    }
    @PostMapping("overview")
    public String OverviewInsert(HttpServletRequest request, @RequestBody Overview overview){
        return countryService.insertOverviewById(overview);
    }
    @GetMapping("zuimei")
    public String Zuimei(HttpServletRequest request){
        return countryService.selectZuimeiByVillageId(1);
    }
    @PutMapping("zuimei")
    public String ZuimeiUpdate(HttpServletRequest request, @RequestBody ZuimeiXilie zuimeiXilie){
        return countryService.updateZuimeiById(zuimeiXilie);
    }
    @PostMapping("zuimei")
    public String ZuimeiInsert(HttpServletRequest request, @RequestBody ZuimeiXilie zuimeiXilie){
        return countryService.insertZuimeiById(zuimeiXilie);
    }
    @GetMapping("xingangFengcai")
    public String XingangFengcai(HttpServletRequest request){
        return countryService.selectXingangFengcaiByVillageId(1);
    }
    @PutMapping("xingangFengcai")
    public String XingangFengcaiUpdate(HttpServletRequest request, @RequestBody XingangFengcai xingangFengcai){
        return countryService.updateXingangFengcaiById(xingangFengcai);
    }
    @PostMapping("xingangFengcai")
    public String XingangFengcaiInsert(HttpServletRequest request, @RequestBody XingangFengcai xingangFengcai){
        return countryService.insertXingangFengcaiById(xingangFengcai);
    }
    @GetMapping("xiangtuminsu")
    public String Xiangtuminsu(HttpServletRequest request){
        return countryService.selectXiangtuminsuByVillageId(1);
    }
    @PutMapping("xiangtuminsu")
    public String XiangtuminsuUpdate(HttpServletRequest request, @RequestBody XiangtuMinsu xiangtuMinsu){
        return countryService.updateXiangtuminsuById(xiangtuMinsu);
    }
    @PostMapping("xiangtuminsu")
    public String XiangtuminsuInsert(HttpServletRequest request, @RequestBody XiangtuMinsu xiangtuMinsu){
        return countryService.insertXiangtuminsuById(xiangtuMinsu);
    }
    @GetMapping("Peoplestructure")
    public String Peoplestructure(HttpServletRequest request){
        return countryService.selectPeoplestructureByVillageId(1);
    }
    @PutMapping("Peoplestructure")
    public String PeoplestructureUpdate(HttpServletRequest request, @RequestBody PeopleStructure peopleStructure){
        return countryService.updatePeoplestructureById(peopleStructure);
    }
    @PostMapping("Peoplestructure")
    public String PeoplestructureInsert(HttpServletRequest request, @RequestBody PeopleStructure peopleStructure){
        return countryService.insertPeoplestructureById(peopleStructure);
    }
}
