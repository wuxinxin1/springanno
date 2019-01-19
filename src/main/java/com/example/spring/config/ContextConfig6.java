package com.example.spring.config;

import com.example.spring.beanProcessor.MyBeanPostProcessor1;
import com.example.spring.dao.UserDao;
import com.example.spring.model.AwareTestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * 测试关于实现aware接口的bean
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
public class ContextConfig6 {
    @Bean
    public AwareTestBean awareTestBean(){
        return new AwareTestBean();
    }

    @Bean
    public MyBeanPostProcessor1 myBeanPostProcessor1(){
        return new MyBeanPostProcessor1();
    }
}
