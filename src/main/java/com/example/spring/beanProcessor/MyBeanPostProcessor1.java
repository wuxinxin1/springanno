package com.example.spring.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public class MyBeanPostProcessor1 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor1  postProcessBeforeInitialization:"+beanName+"===>"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("MyBeanPostProcessor1  postProcessAfterInitialization:"+beanName+"===>"+bean);
        return bean;
    }
}
