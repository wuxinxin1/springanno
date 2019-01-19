package com.example.spring.service;

import com.example.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/1/19/019.
 */
@Service
public class UserService {

    /*@Autowired
    private UserDao userDao3;*/

    //@Qualifier("userDao2")
    @Autowired
    private UserDao userDao3;

    @Override
    public String toString() {
        return "UserService{" +
                "userDao=" + userDao3 +
                '}';
    }
}
