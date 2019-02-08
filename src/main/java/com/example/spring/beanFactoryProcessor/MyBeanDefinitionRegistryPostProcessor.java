package com.example.spring.beanFactoryProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * /**
 * Modify the application context's internal bean definition registry after its
 * standard initialization. All regular bean definitions will have been loaded,
 * but no beans will have been instantiated yet. This allows for adding further
 * bean definitions before the next post-processing phase kicks in.
 * @param registry the bean definition registry used by the application context
 * @throws org.springframework.beans.BeansException in case of errors
 *
 * 可以修改bean定义的注册信息，所有的bean的定义信息还没有被加载，允许加载更多的bean定义信息，在被加载之前
 *
 * BeanFactoryPostProcessor的子接口
 * 1.BeanDefinitionRegistryPostProcessor在invokeBeanFactoryPostProcessors(beanFactory);中执行
 * 2.先执行BeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry方法，然后执行postProcessBeanFactory
 * 3.再执行BeanFactoryPostProcessor的postProcessBeanFactory方法
 * Created by Administrator on 2019/2/7/007.
 */

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //添加bean的定义
        //......
        System.out.println("MyBeanDefinitionRegistryPostProcessor.......postProcessBeanDefinitionRegistry");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor.......postProcessBeanFactory");
    }
}
