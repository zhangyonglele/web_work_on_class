package com.work.web_work_on_class;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
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

}
