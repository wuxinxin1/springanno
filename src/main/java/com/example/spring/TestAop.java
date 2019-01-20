package com.example.spring;

import com.example.spring.aop.CalculateTest;
import com.example.spring.config.ContextConfig6;
import com.example.spring.config.ContextConfig8;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  测试切面编程
 *  1.编写一个切面类，里面需要编写通知方法，并且添加通知类型和切入点
 *  2.将业务类和切面类都添加到aop容器中
 *  3.开启aop的功能
 *
 *
 * 注解解释
 * 1.@Pointcut  指明切点方法
 * 2.@@Before  在方法执行前执行
 * 3.@After  在方法执行后执行
 * 4.@afterRuturn 正常返回结果时候执行，在@After后面执行
 * 5.@AfterThrowing 在抛出异常后执行 ，在@After后面执行
 *
 *
 * @EnableAspectJAutoProxy
 *
 * 1.首先注册了一个AnnotationAwareAspectJAutoProxyCreator类型的对象(使用@Import)，
 *   并且将beanName设置为org.springframework.aop.config.internalAutoProxyCreator;
 *
 */

public class TestAop
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig8.class);

        printBeans(applicationContext);

        /*CalculateTest bean = applicationContext.getBean(CalculateTest.class);

        bean.div(1,1);*/

        Object bean = applicationContext.getBean("org.springframework.aop.config.internalAutoProxyCreator");


        applicationContext.close();

    }


    public void printBeans(AnnotationConfigApplicationContext applicationContext){
        //获取到所有定义的bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("================创建容器完成=============");
    }


}
