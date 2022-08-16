package com.example.xinggang.Service;

import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigitalLifeService {
    @Autowired
    GongyiZuzhiMapper gongyiZuzhiMapper;
    @Autowired
    GongyiHuodongMapper gongyiHuodongMapper;
    @Autowired
    GongyiGuanggaoMapper gongyiGuanggaoMapper;
    @Autowired
    LingliYouyueMapper lingliYouyueMapper;
    @Autowired
    LingliZhongxinMapper lingliZhongxinMapper;
    @Autowired
    RuoshiQuntiMapper ruoshiQuntiMapper;



}
