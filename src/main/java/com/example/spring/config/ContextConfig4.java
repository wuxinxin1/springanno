package com.example.spring.config;

import com.example.spring.beanProcessor.MyBeanPostProcessor1;
import com.example.spring.model.Car;
import com.example.spring.model.Cat;
import com.example.spring.model.Dog;
import com.example.spring.model.Pig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * bean的外部属性注入@Value
 * Created by Administrator on 2019/1/6/006.
 */
@PropertySource("pig.properties")
@Configuration
public class ContextConfig4 {
    @Bean
    public Pig pig(){
        return  new Pig();
    }
}
