package com.example.xinggang.utils.Aspect;

import com.example.xinggang.utils.Annotation.DataSource;
import com.example.xinggang.utils.DataSourcesNames;
import com.example.xinggang.utils.DynamicDataSource;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Author: Lxq
 * @Date: 2019/10/18 11:13
 */
@Aspect
@Component
public class DataSourceAspect implements Ordered {

    protected Logger logger = LoggerFactory.getLogger(getClass());
    //对自定义的注解定义切面
    @Pointcut("@annotation(com.example.xinggang.utils.Annotation.DataSource)")
    public void dataSourcePointCut() {

    }
    //表示围绕这个方法周围
    @Around("dataSourcePointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        //反射的方式获取到注解
        DataSource ds = method.getAnnotation(DataSource.class);
        if (ds == null) {
            //设置数据源
            DynamicDataSource.setDataSource(DataSourcesNames.FIRST);
            logger.debug("set datasource is " + DataSourcesNames.FIRST);
        } else {
            DynamicDataSource.setDataSource(ds.name());
        }

        try {
            return point.proceed();
        } finally {
            DynamicDataSource.clearDataSource();
            logger.debug("clean datasource");
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
