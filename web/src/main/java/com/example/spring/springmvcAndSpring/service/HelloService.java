package com.example.spring.springmvcAndSpring.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/27/027.
 */
@Service
public class HelloService {

    public String hello(String name){
        return "hello  "+name;
    }

}
