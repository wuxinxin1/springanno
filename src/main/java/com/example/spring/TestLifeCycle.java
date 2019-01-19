package com.example.spring;

import com.example.spring.config.ContextConfig;
import com.example.spring.config.ContextConfig2;
import com.example.spring.config.ContextConfig3;
import com.example.spring.model.Car;
import com.example.spring.model.Cat;
import com.example.spring.model.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *  测试Bean的生命周期----怎样控制bean的生命周期
 *  1. @Bean里面指定初始化和销毁方法
 *     a.单例情况下，由ioc容器管理
 *     b.多实例情况下，ioc容器帮助我们创建bean但是不会在容器关闭时调用销毁方法
 *
 *  2.实现InitializingBean,DisposableBean接口的bean
 *     a.单例情况下，由ioc容器管理
 *     b.多实例情况下，ioc容器帮助我们创建bean但是不会在容器关闭时调用销毁方法
 *
 *  3.通过java规范自带的两个注解来标注初始化和销毁方法 @PostConstruct  @PreDestroy
 *
 *  4.为bean添加后置处理器，实现BeanPostProcessor接口，所有的bean就会在执行初始化方法前后分别执行postProcessBeforeInitialization和postProcessAfterInitialization
 */
public class TestLifeCycle
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig3.class);
        System.out.println("容器创建完成");
       // printBeans(applicationContext);

       /* Car car = (Car) applicationContext.getBean("car");
        car.destroy();*/

        /*Cat car = (Cat) applicationContext.getBean("cat");*/

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
