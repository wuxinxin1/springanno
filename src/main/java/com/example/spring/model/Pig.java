package com.example.spring.model;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by Administrator on 2019/1/19/019.
 */
public class Pig {

    public Pig() {
        //System.out.println("pig construct");
    }


    @Value("wuxinxin")//注入字面量
    private String userName;

    @Value("#{10-8}")//写spele表达式
    private String password;

    @Value("${nickName}")//注入外部环境变量
    private String nickName;

    @Override
    public String toString() {
        return "Pig{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
