package com.example.xinggang.Controller;

import com.example.xinggang.Entity.*;
import com.example.xinggang.Service.DigitalLifeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/DigitalLife")
public class DigitalLifeController {
    @Autowired
    DigitalLifeService digitalLifeService;

    @GetMapping("lingliZhongxin")
    public String lingliZhongxin(HttpServletRequest request){
        return digitalLifeService.selecLingliZhongxinByVillageId(1);
    }
    @PutMapping("lingliZhongxin")
    public String lingliZhongxinUpdate(HttpServletRequest request, @RequestBody LingliZhongxin lingliZhongxin){
        return  digitalLifeService.updateLingliZhongxinById(lingliZhongxin);
    }
    @PostMapping("lingliZhongxin")
    public String lingliZhongxinInsert(HttpServletRequest request ,@RequestBody LingliZhongxin lingliZhongxin){
        return digitalLifeService.insertLingliZhongxinById(lingliZhongxin);
    }
    @DeleteMapping("lingliZhongxin/{id}")
    public String lingliZhongxinDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteLingliZhongxinById(id);
    }
    @GetMapping("ruoshiQunti")
    public String ruoshiQunti(HttpServletRequest request){
        return digitalLifeService.selectRuoshiQuntiByVillageId(1);
    }
    @PutMapping("ruoshiQunti")
    public String ruoshiQuntiUpdate(HttpServletRequest request, @RequestBody RuoshiQunti ruoshiQunti){
        return  digitalLifeService.updateRuoshiQuntiById(ruoshiQunti);
    }
    @PostMapping("ruoshiQunti")
    public String ruoshiQuntiInsert(HttpServletRequest request ,@RequestBody RuoshiQunti ruoshiQunti){
        return digitalLifeService.insertRuoshiQuntiById(ruoshiQunti);
    }
    @DeleteMapping("ruoshiQunti/{id}")
    public String ruoshiQuntiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteRuoshiQuntiById(id);
    }
    @GetMapping("canji")
    public String canjiList(HttpServletRequest request){
        return digitalLifeService.selectCanjirenByVillageId(1);
    }
    @GetMapping("dibao")
    public String dibaoList(HttpServletRequest request){
        return digitalLifeService.selectdibaohuByVillageId(1);
    }
    @GetMapping("oldPeople")
    public String oldPeopleList(HttpServletRequest request){
        return digitalLifeService.selectOldPeopleByVillageId(1);
    }
    @GetMapping("lingliYouyue")
    public String lingliYouyue(HttpServletRequest request){
        return digitalLifeService.selectLingliYouyueByVillageId(1);
    }
    @PutMapping("lingliYouyue")
    public String lingliYouyueUpdate(HttpServletRequest request, @RequestBody LingliYouyue lingliYouyue){
        return  digitalLifeService.updateLingliYouyueById(lingliYouyue);
    }
    @PostMapping("lingliYouyue")
    public String lingliYouyueInsert(HttpServletRequest request ,@RequestBody LingliYouyue lingliYouyue){
        return digitalLifeService.insertLingliYouyueById(lingliYouyue);
    }
    @DeleteMapping("lingliYouyue/{id}")
    public String lingliYouyueDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteLingliYouyueById(id);
    }
    @GetMapping("gongyiGuanggao")
    public String gongyiGuanggao(HttpServletRequest request){
        return digitalLifeService.selectGongyiGuanggaoByVillageId(1);
    }
    @PutMapping("gongyiGuanggao")
    public String gongyiGuanggaoUpdate(HttpServletRequest request, @RequestBody GongyiGuanggao gongyiGuanggao){
        return  digitalLifeService.updateGongyiGuanggaoById(gongyiGuanggao);
    }
    @PostMapping("gongyiGuanggao")
    public String gongyiGuanggaoInsert(HttpServletRequest request ,@RequestBody GongyiGuanggao gongyiGuanggao){
        return digitalLifeService.insertGongyiGuanggaoById(gongyiGuanggao);
    }
    @DeleteMapping("gongyiGuanggao/{id}")
    public String gongyiGuanggaoDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteGongyiGuanggaoById(id);
    }
    @GetMapping("laonianxiehui")
    public String laonianxiehui(HttpServletRequest request){
        return digitalLifeService.selectLaonianXiehuiByVillageId(1);
    }
    @PutMapping("laonianxiehui")
    public String laonianxiehuiUpdate(HttpServletRequest request, @RequestBody LaonianXiehui laonianXiehui){
        return  digitalLifeService.updateLaonianXiehuiById(laonianXiehui);
    }
    @PostMapping("laonianxiehui")
    public String laonianxiehuiInsert(HttpServletRequest request ,@RequestBody LaonianXiehui laonianXiehui){
        return digitalLifeService.insertLaonianXiehuiById(laonianXiehui);
    }
    @DeleteMapping("laonianxiehui/{id}")
    public String laonianxiehuiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteLaonianXiehuiById(id);
    }
    @GetMapping("funvxiehui")
    public String funvxiehui(HttpServletRequest request){
        return digitalLifeService.selectFunvXiehuiByVillageId(1);
    }
    @PutMapping("funvxiehui")
    public String funvxiehuiUpdate(HttpServletRequest request, @RequestBody FunvXiehui funvXiehui){
        return  digitalLifeService.updateFunvXiehuiById(funvXiehui);
    }
    @PostMapping("funvxiehui")
    public String funvxiehuiInsert(HttpServletRequest request ,@RequestBody FunvXiehui funvXiehui){
        return digitalLifeService.insertFunvXiehuiById(funvXiehui);
    }
    @DeleteMapping("funvxiehui/{id}")
    public String funvxiehuiDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteFunvXiehuiById(id);
    }
    @GetMapping("gongyiHuodong")
    public String gongyiHuodong(HttpServletRequest request){
        return digitalLifeService.selectGongyiHuodongByVillageId(1);
    }
    @PutMapping("gongyiHuodong")
    public String gongyiHuodongUpdate(HttpServletRequest request, @RequestBody GongyiHuodong gongyiHuodong){
        return  digitalLifeService.updateGongyiHuodongById(gongyiHuodong);
    }
    @PostMapping("gongyiHuodong")
    public String gongyiHuodongInsert(HttpServletRequest request ,@RequestBody GongyiHuodong gongyiHuodong){
        return digitalLifeService.insertGongyiHuodongById(gongyiHuodong);
    }
    @DeleteMapping("gongyiHuodong/{id}")
    public String gongyiHuodongDelete(HttpServletRequest request,@PathVariable("id") Integer id){
        return digitalLifeService.logicDeleteGongyiHuodongById(id);
    }
}
