package com.example.spring.servletContainerInitializer;

import com.example.spring.beans.HelloService;
import com.example.spring.servlet.UserFilter;
import com.example.spring.servlet.UserServlet;
import com.example.spring.servlet.servletListener;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.EnumSet;
import java.util.Set;

/**
 * 用于测试
 * 按照3.0规范要求，ServletContainerInitializer的实现类，都需要配置在jar包的 META-INF/services/javax.servlet.ServletContainerInitializer里面
 * 容器在启动的时候会调用
 *
 * @HandlesTypes注解的作用就是把需要在加载的类加载进来，在onStartup调用的人时候
 * Created by Administrator on 2019/1/27/027.
 */

@HandlesTypes(value = {HelloService.class})
public class MySCI implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("hello");

        System.out.println("感兴趣的类");
        for (Class c :
                set) {
            System.out.println(c);
        }

        //添加servlet
        ServletRegistration.Dynamic user = servletContext.addServlet("user", UserServlet.class);
        user.addMapping("/user");

        //添加监听器
        servletContext.addListener(servletListener.class);

        //添加过滤器
        FilterRegistration.Dynamic userFilter = servletContext.addFilter("userFilter", UserFilter.class);
        userFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");


    }
}
