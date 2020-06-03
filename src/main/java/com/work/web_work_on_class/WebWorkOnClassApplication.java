package com.work.web_work_on_class;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.http.CookieSerializer;
import org.springframework.session.web.http.DefaultCookieSerializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("/com.work.web_work_on_class.mapper")
@EnableCaching
@EnableRedisHttpSession
public class WebWorkOnClassApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebWorkOnClassApplication.class, args);
    }

    @Bean
    public CookieSerializer httpSessionIdResolver() {
        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
        cookieSerializer.setUseHttpOnlyCookie(false);
        cookieSerializer.setSameSite("None");
        cookieSerializer.setUseSecureCookie(true);
        return cookieSerializer;
    }
}
