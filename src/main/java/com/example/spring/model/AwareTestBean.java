package com.example.spring.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * Created by Administrator on 2019/1/19/019.
 */
public class AwareTestBean implements ApplicationContextAware {
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext applicationContext:"+applicationContext);
    }
}
