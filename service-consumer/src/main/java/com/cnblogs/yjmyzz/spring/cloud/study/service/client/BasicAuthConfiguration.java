package com.cnblogs.yjmyzz.spring.cloud.study.service.client;

import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangjunming on 2017/6/28.
 */
@Configuration
public class BasicAuthConfiguration {

    @Bean
    public BasicAuthRequestInterceptor basicAuthorizationInterceptor() {
        return new BasicAuthRequestInterceptor("app01", "passwd01");
    }
}
