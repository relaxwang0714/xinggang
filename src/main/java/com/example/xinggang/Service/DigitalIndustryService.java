package com.example.xinggang.Service;

import com.example.xinggang.Mapper.JingjiZengshouMapper;
import com.example.xinggang.Mapper.JitiFangchanMapper;
import com.example.xinggang.Mapper.TudiLiuzhuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DigitalIndustryService {
    @Autowired
    JitiFangchanMapper jitiFangchanMapper;
    @Autowired
    TudiLiuzhuanMapper tudiLiuzhuanMapper;
    @Autowired
    JingjiZengshouMapper jingjiZengshouMapper;
}
