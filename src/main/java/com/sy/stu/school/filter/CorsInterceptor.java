package com.sy.stu.school.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
@WebFilter(filterName="Servlet3Filter",urlPatterns="/*")
public class CorsInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("CorsInterceptor.preHandle");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("CorsInterceptor.postHandle");
        System.out.println("request:"+request.getRequestURI());
        // Access-Control-Allow-Origin
        String origin = request.getHeader("Origin");
        System.out.println("origin.........."+origin);

        response.setHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Vary", "Origin");

        // Access-Control-Max-Age
        response.setHeader("Access-Control-Max-Age", "3600");

        // Access-Control-Allow-Credentials
        response.setHeader("Access-Control-Allow-Credentials", "true");

        // Access-Control-Allow-Methods
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");

        // Access-Control-Allow-Headers
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type,Accept,X-Custom-Header,Set-Cookie,authorization");


    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("CorsInterceptor.afterCompletion");
    }
}
