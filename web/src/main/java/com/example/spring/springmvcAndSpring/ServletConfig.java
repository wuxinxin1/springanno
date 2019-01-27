package com.example.spring.springmvcAndSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * web容器，只扫描和web相关的组件,相当于原来的springmvc-context.xml
 * Created by Administrator on 2019/1/27/027.
 */

@ComponentScan(basePackages = {"com.example.spring.springmvcAndSpring"},includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)}
        ,useDefaultFilters = false
)
@EnableWebMvc
public class ServletConfig  extends WebMvcConfigurerAdapter{

    //将配置交给tomcat处理，使具有处理静态资源的能力
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    //配置视图解析器
   /* @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/views/",".jsp");
    }*/

   @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
       return new InternalResourceViewResolver("/views/",".jsp");
   }

    //添加拦截器
}
