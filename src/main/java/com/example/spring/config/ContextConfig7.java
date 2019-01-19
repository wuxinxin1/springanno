package com.example.spring.config;

import com.example.spring.beanProcessor.MyBeanPostProcessor1;
import com.example.spring.model.AwareTestBean;
import com.example.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

/**
 * 测试profile,根据环境来注册bean
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
public class ContextConfig7 {


    @Profile("default")
    @Bean
    public Person personDev(){
        Person person = new Person();
        person.setName("dev");
        person.setAge(1);
        return person;
    }

    @Profile("test")
    @Bean
    public Person personTest(){
        Person person = new Person();
        person.setName("test");
        person.setAge(2);
        return person;
    }

    @Profile("prod")
    @Bean
    public Person personProd(){
        Person person = new Person();
        person.setName("prod");
        person.setAge(3);
        return person;
    }

}
