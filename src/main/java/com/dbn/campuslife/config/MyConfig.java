package com.dbn.campuslife.config;

import com.dbn.campuslife.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 添加自定义的拦截器
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/login/login.html")
                .excludePathPatterns("/register/register.html")
                .excludePathPatterns("/user/login")
                .excludePathPatterns("/user/register")
                .excludePathPatterns("/vue/**")
                .excludePathPatterns("/login/**")
                .excludePathPatterns("/image/**")
                .excludePathPatterns("/register/**");
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
