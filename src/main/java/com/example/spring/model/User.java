package com.example.spring.model;

/**
 * Created by Administrator on 2019/1/6/006.
 */
public class User {
    private  String userName;

    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String userName, String password) {
        //System.out.println("user----con");
        this.userName = userName;
        this.password = password;
    }

    public User() {
    }

    public void init(){
        System.out.println("user----init");
    }

    public void destroy(){
        System.out.println("user----destroy");
    }
}
