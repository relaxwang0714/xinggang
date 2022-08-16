package com.example.xinggang.Service;

import com.example.xinggang.Entity.YetaiFenbu;
import com.example.xinggang.Entity.YetaiFenbuExample;
import com.example.xinggang.Entity.YunyouXingang;
import com.example.xinggang.Mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    YetaiFenbuMapper yetaiFenbuMapper;
    @Autowired
    YunyouXingangMapper yunyouXingangMapper;
    @Autowired
    ZuimeiXilieMapper zuimeiXilieMapper;
    @Autowired
    XiangtuMinsuMapper xiangtuMinsuMapper;
    @Autowired
    XingangFengcaiMapper xingangFengcaiMapper;
    @Autowired
    ReturnMsg returnMsg;
    public String selectYetaiFenbuByVillageId(int id){
        YetaiFenbuExample yetaiFenbuExample = new YetaiFenbuExample();
        YetaiFenbuExample.Criteria criteria = yetaiFenbuExample.createCriteria();
        criteria.andVillageIdEqualTo(1);
        List<YetaiFenbu> yetaiFenbuList = yetaiFenbuMapper.selectByExample(yetaiFenbuExample);
        returnMsg.setData(yetaiFenbuList);
        returnMsg.setCode("0");
        returnMsg.setMsg("成功");
//        JSONObject jsonObject = (JSONObject) JSONObject.toJSON(place);
        return returnMsg.toString();
    }
}
