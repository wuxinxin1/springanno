package com.example.spring.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Administrator on 2019/1/14/014.
 */
public class Cat implements InitializingBean,DisposableBean{
    public Cat() {
        System.out.println("cat construct");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("cat init");
    }
}
