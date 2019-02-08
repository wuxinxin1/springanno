package com.example.spring.beanFactoryProcessor;

import com.example.spring.model.Blue;
import com.sun.deploy.util.ArrayUtil;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.stereotype.Component;

/**
 * BeanFactoryPostProcessor在其他bean创建之前执行
 *
 * 这个接口作用的定义的英文原文
 * /**
 * Allows for custom modification of an application context's bean definitions,
 * adapting the bean property values of the context's underlying bean factory.
 *
 * 允许自定义修改容器中bean的定义；
 * 调整(修改)ioc容器中bean的一些属性
 *
 * <p>Application contexts can auto-detect BeanFactoryPostProcessor beans in
 * their bean definitions and apply them before any other beans get created.
 *
 * 容器会自动发现BeanFactoryPostProcessor定义的并且执行他们，在其他bean创建之前
 *
 * <p>Useful for custom config files targeted at system administrators that
 * override bean properties configured in the application context.
 *
 * 用来自定义bean的定义属性来覆盖bean之前的定义
 *
 * <p>See PropertyResourceConfigurer and its concrete implementations
 * for out-of-the-box solutions that address such configuration needs.
 *
 * <p>A BeanFactoryPostProcessor may interact with and modify bean
 * definitions, but never bean instances. Doing so may cause premature bean
 * instantiation, violating the container and causing unintended side-effects.
 * If bean instance interaction is required, consider implementing
 *
 * BeanFactoryPostProcessor可以和bean的定义交互，但是最好不要去实例化对象，这样会导致提前创建bean,无意识就破坏了容器
 *
 * {@link BeanPostProcessor} instead.
 *
 * @author Juergen Hoeller
 * @since 06.07.2003
 * @see BeanPostProcessor
 * @see PropertyResourceConfigurer
 *
 *
 *
 *
 * /**
 * Modify the application context's internal bean factory after its standard
 * initialization. All bean definitions will have been loaded, but no beans
 * will have been instantiated yet. This allows for overriding or adding
 * properties even to eager-initializing beans.
 * @param beanFactory the bean factory used by the application context
 * @throws org.springframework.beans.BeansException in case of errors
 *
 * 1.执行时机是所有的beanfactory的定义已经加载了，在创建其它bean之前执行
 * Created by Administrator on 2019/1/28/028.
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor  postProcessBeanFactory");

        System.out.println("===============所有bean的定义信息==========================");
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();

        for (String s:beanDefinitionNames) {
            System.out.println(s);
        }

        //会导致提前创建bean
        System.out.println("===============获取bean==========================");
        /*Blue bean = beanFactory.getBean(Blue.class);

        System.out.println(bean);*/

    }
}
