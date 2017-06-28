package com.cnblogs.yjmyzz.spring.cloud.study.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@ComponentScan("com.cnblogs.yjmyzz.spring.cloud.study.service")
public class ServiceConsumer {

    public static void main(String[] args) {
        SpringApplication.run(ServiceConsumer.class, args);
    }
}
