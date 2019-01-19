package com.example.spring.importBanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by Administrator on 2019/1/13/013.
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * 手动注册要注册的bean
     * @param importingClassMetadata   标注import注解的类的所有类注解信息
     * @param registry    用来注册用的
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition();

        rootBeanDefinition.setBeanClassName("com.example.spring.model.RainBow");

        registry.registerBeanDefinition("rainBow",rootBeanDefinition);
    }
}
