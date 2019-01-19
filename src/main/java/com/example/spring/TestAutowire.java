package com.example.spring;

import com.example.spring.config.ContextConfig4;
import com.example.spring.config.ContextConfig5;
import com.example.spring.dao.UserDao;
import com.example.spring.model.Pig;
import com.example.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *  测试Bean的自动装配
 *  1.@autowire
 *     a.是按照类型来装配的,如果根据类型获取到的bean有多个，那么会使用属性名称来获取bean<getBean(属性名称)>，如果给的属性名称没有对应的bean，那么装配会失败
 *     b.当有多个匹配类型的bean，我们可以可以通过@Qualifier("userDao2")注解来根据bean名称获取bean，就不会使用属性名称来查找bean；
 *     如果@Qualifier指定的bean名称不对，那么也会装配失败
 *     c.@autowire和@Qualifier是配合使用的，只有@autowire才有装配的功能
 *     d.当@autowire匹配到多个满足类型要求的bean时，@Primary是用于首选哪个bean的
 *     e.@autowire可以标注在方法，参数，属性，构造方法上
 */
public class TestAutowire
{

    @Test
    public void testBean()
    {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ContextConfig5.class);

        printBeans(applicationContext);

        System.out.println("====================");

        UserService userService = applicationContext.getBean(UserService.class);

        System.out.println(userService);

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        System.out.println(userDao);

        UserDao userDao2 = (UserDao) applicationContext.getBean("userDao2");
        System.out.println(userDao2);

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
