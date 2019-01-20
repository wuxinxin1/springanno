package com.example.spring.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 这是一个切面类
 * Created by Administrator on 2019/1/20/020.
 */
@Aspect
public class LogTest {

    @Pointcut("execution(public int com.example.spring.aop.CalculateTest.*(..))")
    public void pointCut(){}

   @Before("pointCut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after");
    }

   @AfterReturning(value = "pointCut()")
    public void afterRuturn(JoinPoint joinPoint){
        System.out.println("afterRuturn");
    }

    @AfterThrowing("pointCut()")
    public void afterException(){
        System.out.println("afterException");
    }


}
