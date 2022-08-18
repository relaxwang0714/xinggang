package com.example.xinggang;

import com.example.xinggang.Config.CorsFilter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.example.xinggang.Mapper")
@ServletComponentScan(basePackageClasses = CorsFilter.class)
public class XinggangApplication {

    public static void main(String[] args) {
        SpringApplication.run(XinggangApplication.class, args);
    }

}
