package com.example.spring.config;

import com.example.spring.beanProcessor.MyBeanPostProcessor1;
import com.example.spring.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * bean的生命周期配置
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
public class ContextConfig3 {

    //@Scope("prototype")
    @Bean(initMethod = "init" ,destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

    //@Scope("prototype")
    @Bean
    public Cat cat(){
        return  new Cat();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor1 myBeanPostProcessor1(){
        return new MyBeanPostProcessor1();
    }

    @Bean
    public Pig pig(){
        return  new Pig();
    }
}
