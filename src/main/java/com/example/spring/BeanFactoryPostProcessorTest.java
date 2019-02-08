package com.example.spring;

import com.example.spring.config.ContextConfig8;
import com.example.spring.ext.ExtConfig;
import com.example.spring.model.Blue;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2019/1/28/028.
 */
public class BeanFactoryPostProcessorTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(ExtConfig.class);

        //发布事件
        applicationContext.publishEvent(new ApplicationEvent(new String("aaaaa")) {
        });
        System.out.println("================容器创建完成=====================");
        //Blue bean = applicationContext.getBean("blue",Blue.class);

        //System.out.println(bean);
        applicationContext.close();
    }
}
