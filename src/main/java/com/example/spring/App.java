package com.example.spring;

import com.example.spring.config.ContextConfig;
import com.example.spring.config.ContextConfig2;
import com.example.spring.model.Person;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;
import java.util.Set;

/**
 * Hello world!
 *
 * 注册bean的方式
 * 1.自己手写的bean可以直接通过扫描+注解方式注册，比如@Service@Controller@res等注解进行注册
 * 2.第三方导入的jar包注册bean的方法
 *    a.使用@Bean的方式
 *    b.通过@Import
 *      a.通过加入一个普通类来添加组件
 *      b.通过加入一个ImportSelector类型的类，通过加入返回一个全类名数组来注册组件
 *      c.通过加入一个ImportBeanDefinitionRegistrar类型的类，在registerBeanDefinitions方法中定义一个自己需要的bean，bean相关参数完全自己定义
 * 3.通过FactoryBean注册一个需要类型的Bean工厂
 */
public class App 
{

    AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig2.class);

    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig.class);

        /*String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }*/
        applicationContext.close();
    }

    @Test
    public void testImport()
    {
        printBeans();
    }

    @Test
    public void testFactoryBean(){
        printBeans();

        System.out.println("===============");
        Object colorFactoryBean = applicationContext.getBean("colorFactoryBean");

        System.out.println(colorFactoryBean);

    }

    public void printBeans(){
        //获取到所有定义的bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }
    }


    /**
     * 测试条件注解
     */
    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig2.class);

        //获取到所有定义的bean
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();

        for (String name:beanDefinitionNames) {
            System.out.println(name);
        }

        System.out.println("======容器环境=======");

        //获取容器的运行环境
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        Map<String, Object> systemProperties = environment.getSystemProperties();

        Set<String> strings = systemProperties.keySet();

        Object o = systemProperties.get("os.name");

        System.out.println(o);


        System.out.println("======根据类型获取bean=======");

        Map<String, Person> beansOfType = applicationContext.getBeansOfType(Person.class);

        System.out.println(beansOfType);

    }

}
