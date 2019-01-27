package com.example.spring.servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Administrator on 2019/1/27/027.
 */
public class UserFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("UserFilter  init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("UserFilter  doFilter");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("UserFilter  destroy");
    }
}
