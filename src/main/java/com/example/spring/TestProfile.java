package com.example.spring;

import com.example.spring.config.ContextConfig6;
import com.example.spring.config.ContextConfig7;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  测试profile注解
 *  @Profile分为两步
 *  1.将注册的bean使用注解标明激活的环境；
 *    a.@Profile注解用于指定bean在哪个环境被激活，默认激活环境是default(spring.profiles.active=default)
 *    b.没有指定环境的bean,都会激活
 *  2.激活环境
 *    a.使用改变虚拟机参数 -Dspring.profiles.active=test
 *    b.使用编写代码的方式，在ico容器启动前，先设置好激活的环境
 *  3.@Profile使用范围
 *    a.使用在方法上，根据环境激活当前单个bean
 *    b.使用在类上面，根据环境激活整个配置文件的bean
 *
 */


public class TestProfile
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig7.class);

        printBeans(applicationContext);

        applicationContext.close();

    }

    @Test
    public void testBean1()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext();

        applicationContext.getEnvironment().setActiveProfiles("prod");
        applicationContext.register(ContextConfig7.class);
        applicationContext.refresh();

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
