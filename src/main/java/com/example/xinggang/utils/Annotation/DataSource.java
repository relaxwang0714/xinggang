package com.example.xinggang.utils.Annotation;


import java.lang.annotation.*;

/**
 * @Description: 多数据源注解
 * @Author: Lxq
 * @Date: 2019/10/18 11:10
 */
//只能被使用在方法上面
@Target(ElementType.METHOD)
//注解的生命周期，表示这个注解可以在运行期的加载阶段被加载到Class对象中。那么在程序运行阶段，我们可以通过反射得到这个注解，
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}