package com.example.spring.model;

/**
 * Created by Administrator on 2019/1/14/014.
 */
public class Car {

    public Car() {
        System.out.println("car  construct");
    }

    public void init(){
        System.out.println("car init");
    }

    public void destroy(){
        System.out.println("car destroy");
    }
}
