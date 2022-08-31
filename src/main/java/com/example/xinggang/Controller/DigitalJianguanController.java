package com.example.xinggang.Controller;

import com.example.xinggang.Entity.FengmaoGuankong;
import com.example.xinggang.Entity.JitiFangchan;
import com.example.xinggang.Entity.ZaijianList;
import com.example.xinggang.Service.DigitalJianguanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/digitalJianguan")
public class DigitalJianguanController {
    @Autowired
    DigitalJianguanService digitalJianguanService;
    @GetMapping("fengmaoGuankong")
    public String fengmaoGuankong(HttpServletRequest request){
        return digitalJianguanService.selectFengmaoGuankongByVillageId(1);
    }
    @PutMapping("fengmaoGuankong")
    public String fengmaoGuankongUpdate(HttpServletRequest request, @RequestBody FengmaoGuankong fengmaoGuankong){
        return digitalJianguanService.updateFengmaoGuankongById(fengmaoGuankong);
    }
    @PostMapping("fengmaoGuankong")
    public String fengmaoGuankongInsert(HttpServletRequest request ,@RequestBody FengmaoGuankong fengmaoGuankong){
        return digitalJianguanService.insertFengmaoGuankongById(fengmaoGuankong);
    }
    @DeleteMapping("fengmaoGuankong/{id}")
    public String fengmaoGuankongDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalJianguanService.logicDeleteFengmaoGuankongById(id);
    }
    @GetMapping("zaijian")
    public String zaijian(HttpServletRequest request){
        return digitalJianguanService.selectZaijianByVillageId(1);
    }
    @PutMapping("zaijian")
    public String zaijianUpdate(HttpServletRequest request, @RequestBody ZaijianList zaijianList){
        return digitalJianguanService.updateZaijianById(zaijianList);
    }
    @PostMapping("zaijian")
    public String zaijianInsert(HttpServletRequest request ,@RequestBody ZaijianList zaijianList){
        return digitalJianguanService.insertZaijianById(zaijianList);
    }
    @DeleteMapping("zaijian/{id}")
    public String zaijianDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalJianguanService.logicDeleteZaijianById(id);
    }

}
