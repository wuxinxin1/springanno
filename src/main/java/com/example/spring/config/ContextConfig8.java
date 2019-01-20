package com.example.spring.config;

import com.example.spring.aop.CalculateTest;
import com.example.spring.aop.LogTest;
import com.example.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;

/**
 * 测试aop
 *
 */
@Configuration
@EnableAspectJAutoProxy
public class ContextConfig8 {
    @Bean
    public LogTest logTest(){
        return new LogTest();
    }

    @Bean
    public CalculateTest calculateTest(){
        return new CalculateTest();
    }
}
