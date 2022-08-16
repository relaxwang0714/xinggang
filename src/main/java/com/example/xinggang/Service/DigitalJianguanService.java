package com.example.xinggang.Service;

import com.example.xinggang.Mapper.FengmaoGuankongMapper;
import com.example.xinggang.Mapper.ZaijianListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigitalJianguanService {
    @Autowired
    ZaijianListMapper zaijianListMapper;
    @Autowired
    FengmaoGuankongMapper fengmaoGuankongMapper;


}
