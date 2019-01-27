package com.example.spring.springmvcAndSpring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 *
 * 这是一个spring容器启动时候需要加载的配置类，类似原来的spring-context.xml
 * Created by Administrator on 2019/1/27/027.
 */
@ComponentScan(basePackages = {"com.example.spring.springmvcAndSpring"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class)}
        )
public class RootConfig {
}
