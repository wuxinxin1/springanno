package com.example.spring;

import com.example.spring.config.ContextConfig3;
import com.example.spring.config.ContextConfig4;
import com.example.spring.model.Pig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  测试Bean的属性注入
 *  1.@Value
 *    a.通过注解可以注入任意字面量
 *    b.通过注解可以注入spel表达式
 *    c.通过注解可以注入外部properties文件的键值对
 *  2.@PropertySource
 *    a.采用PropertySource注解来引入属性文件
 */
public class TestProperties
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig4.class);

        printBeans(applicationContext);

        Pig pig = (Pig) applicationContext.getBean("pig");
        System.out.println(pig);

        String nickName = applicationContext.getEnvironment().getProperty("os.name");

        System.out.println("nickName:"+nickName);

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
