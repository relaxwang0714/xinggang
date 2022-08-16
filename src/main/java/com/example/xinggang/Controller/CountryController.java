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
}
