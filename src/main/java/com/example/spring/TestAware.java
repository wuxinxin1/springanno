package com.example.spring;

import com.example.spring.config.ContextConfig5;
import com.example.spring.config.ContextConfig6;
import com.example.spring.dao.UserDao;
import com.example.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  测试注入底层容器组件
 *  1.需要注入spring底层组件，那么需要实现相关的Aware接口
 *  2。容器有很多BeanPostProcessor，组成一个链，每个BeanPostProcessor都有自己的功能，
 *     其中ApplicationContextAwareProcessor就是用来给实现了ApplicationContextAware接口的bean 来注入容器对象的;
 *     如果ApplicationContextAwareProcessor判断bean实现了ApplicationContextAware接口，那么就会回调ApplicationContextAware的setApplicationContext方法
 *
 */


public class TestAware
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig6.class);

        printBeans(applicationContext);
        applicationContext.close();

    }


    public void printBeans(AnnotationConfigApplicationContext applicationContext){
        //获取到所有定义的bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }


}
