package com.example.spring.springmvcAndSpring.controller;

import com.example.spring.springmvcAndSpring.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2019/1/27/027.
 */
@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return helloService.hello("liujingbao");
    }



    @RequestMapping("/hello1")
    public String hello1(){
        return "hello";
    }
}
