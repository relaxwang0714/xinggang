package com.example.xinggang.utils;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 多数据源配置
 * @Author: Lxq
 * @Date: 2019/10/18 11:37
 */
/*Config类上标注一个Configuration，向spring声明了这是一个Java配置类,
 表示一个类声明了一个或多个@Bean 方法
*/
@Configuration
public class DynamicDataSourceConfig {
    //Bean 表示注册bean，@Configuration表示在application中找到对应的数据字段
    //Bean表示注册，ConfigurationProperties表示装配
    @Bean
    //绑定注解
    @ConfigurationProperties("spring.datasource.druid.first")
    public DataSource firstDataSource(){
        return DruidDataSourceBuilder.create().build();
    }


    @Bean
    @ConfigurationProperties("spring.datasource.druid.second")
    public DataSource secondDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    //表示优先
    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource firstDataSource, DataSource secondDataSource) {
        Map<String, DataSource> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourcesNames.FIRST, firstDataSource);
        targetDataSources.put(DataSourcesNames.SECOND, secondDataSource);
        return new DynamicDataSource(firstDataSource, targetDataSources);
    }

}