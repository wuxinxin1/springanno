package com.example.spring.config;

import com.example.spring.model.Person;
import com.example.spring.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
public class ContextConfig  {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public User  user(){
        return  new User("wxx","123456");
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Person person(){
        return new Person();
    }
}
