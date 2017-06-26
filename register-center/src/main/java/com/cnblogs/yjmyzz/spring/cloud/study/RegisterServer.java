package com.cnblogs.yjmyzz.spring.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by 菩提树下的杨过 on 2017/6/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterServer {

    public static void main(String[] args) {
        SpringApplication.run(RegisterServer.class, args);
    }
}
