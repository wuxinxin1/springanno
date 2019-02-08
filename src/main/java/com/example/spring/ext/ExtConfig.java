package com.example.spring.ext;

import com.example.spring.model.Blue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/1/28/028.
 */
@ComponentScan("com.example.spring.beanFactoryProcessor")
@Configuration
public class ExtConfig {

    @Bean
    public Blue blue(){
        return new Blue();
    }

}
