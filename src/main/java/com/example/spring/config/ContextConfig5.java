package com.example.spring.config;

import com.example.spring.dao.UserDao;
import com.example.spring.model.Pig;
import org.springframework.context.annotation.*;

/**
 * bean的自动装配
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
@ComponentScan({"com.example.spring.dao","com.example.spring.service"})
public class ContextConfig5 {

    @Primary
    @Bean
    public UserDao userDao2(){
        return new UserDao();
    }
}
