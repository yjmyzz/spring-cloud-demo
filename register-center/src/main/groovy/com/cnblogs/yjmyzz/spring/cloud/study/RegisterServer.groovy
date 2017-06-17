package com.cnblogs.yjmyzz.spring.cloud.study

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

/**
 * Created by yangjunming on 2017/6/17.
 */
@EnableEurekaServer
@SpringBootApplication
class RegisterServer {

    static void main(args) {
        SpringApplication.run(RegisterServer.class, args)
    }
}
