package com.example.xinggang.Controller;

import com.example.xinggang.Entity.PuhuiJinrong;
import com.example.xinggang.Service.DigitalServiceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/DigitalService")
public class DigitalServiceController {
    @Autowired
    DigitalServiceServices digitalServiceServicess;
    @GetMapping("puhuiJinrong")
    public String puhuiJinrong(HttpServletRequest request){
        return digitalServiceServicess.selectPuhuiJinrongByVillageId(1);
    }
    @PutMapping("puhuiJinrong")
    public String puhuiJinrongUpdate(HttpServletRequest request, @RequestBody PuhuiJinrong puhuiJinrong){
        return digitalServiceServicess.updatePuhuiJinrongById(puhuiJinrong);
    }
    @PostMapping("puhuiJinrong")
    public String puhuiJinrongInsert(HttpServletRequest request, @RequestBody PuhuiJinrong puhuiJinrong){
        return digitalServiceServicess.insertPuhuiJinrongById(puhuiJinrong);
    }
    @DeleteMapping("puhuiJinrong/{id}")
    public String gongyiHuodongDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalServiceServicess.logicDeletePuhuiJinrongById(id);
    }

}
