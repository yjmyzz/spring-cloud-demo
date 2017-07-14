package com.cnblogs.yjmyzz.spring.cloud.study.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by yangjunming on 2017/7/13.
 */
@EnableZuulProxy
@SpringCloudApplication
public class ServiceGateway {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ServiceGateway.class).web(true).run(args);
    }

}
