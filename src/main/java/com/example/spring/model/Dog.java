package com.example.spring.model;

import org.omg.CORBA.PUBLIC_MEMBER;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public class Dog {

    public Dog() {
        System.out.println("dog construct");
    }

    @PostConstruct
    public void  aa(){
        System.out.println("dog init");
    }

    @PreDestroy
    public void bb(){
        System.out.println("dog destroy");
    }
}
