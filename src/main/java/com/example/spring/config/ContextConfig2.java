package com.example.spring.config;

import com.example.spring.condition.LinuxCondition;
import com.example.spring.condition.WindowsCondition;
import com.example.spring.factoryBean.ColorFactoryBean;
import com.example.spring.importBanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import com.example.spring.importSelector.MyImportSelector;
import com.example.spring.model.Color;
import com.example.spring.model.Person;
import com.example.spring.model.Red;
import com.example.spring.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2019/1/6/006.
 */
@Configuration
@Import({Color.class,Red.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class ContextConfig2 {

    @Conditional(WindowsCondition.class)
    @Bean
    public Person bill(){
        return new Person("bill gates",60);
    }


    @Conditional(LinuxCondition.class)
    @Bean
    public Person linux(){
        return new Person("linux",48);
    }

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
