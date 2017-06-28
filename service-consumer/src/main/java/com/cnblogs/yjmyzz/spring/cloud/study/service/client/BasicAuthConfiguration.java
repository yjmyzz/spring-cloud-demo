package com.cnblogs.yjmyzz.spring.cloud.study.service.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;

/**
 * Created by yangjunming on 2017/6/28.
 */
@Configuration
public class BasicAuthConfiguration {

    @Bean
    public BasicAuthorizationInterceptor basicAuthorizationInterceptor() {
        return new BasicAuthorizationInterceptor("app01", "passwd01");
    }
}
