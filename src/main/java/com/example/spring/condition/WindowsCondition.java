package com.example.spring.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Administrator on 2019/1/13/013.
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {


        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();//获得beanfactory

        Environment environment = context.getEnvironment();

        String property = environment.getProperty("os.name");

        if(property.contains("Windows")){
            return true;
        }

        return false;
    }
}
