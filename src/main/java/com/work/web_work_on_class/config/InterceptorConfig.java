package com.work.web_work_on_class.config;

import com.work.web_work_on_class.filter.GroupAuthInterceptor;
import com.work.web_work_on_class.filter.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    private final LoginInterceptor loginInterceptor;

    private final GroupAuthInterceptor groupAuthInterceptor;

    @Autowired
    public InterceptorConfig(LoginInterceptor loginInterceptor, GroupAuthInterceptor groupAuthInterceptor) {
        this.loginInterceptor = loginInterceptor;
        this.groupAuthInterceptor = groupAuthInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor).addPathPatterns("/**");
        registry.addInterceptor(groupAuthInterceptor).addPathPatterns("/**");
    }
}
