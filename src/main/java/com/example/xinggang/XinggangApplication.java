package com.example.xinggang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.xinggang.Mapper")
public class XinggangApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinggangApplication.class, args);
    }

}
