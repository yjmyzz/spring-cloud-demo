package com.cnblogs.yjmyzz.spring.cloud.study.service.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import com.cnblogs.yjmyzz.spring.cloud.study.service.client.UserFeignClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

    private final Random rnd = new Random(System.currentTimeMillis());

    @GetMapping("/order/{userId}/{orderNo}")
    @HystrixCommand(fallbackMethod = "findOrderFallback", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")
    })
    public String findOrder(@PathVariable Integer userId, @PathVariable String orderNo) throws InterruptedException {
        Thread.sleep(rnd.nextInt(2000));
        UserDTO user = userFeignClient.findUser(userId);
        if (user != null) {
            return user.getUserName() + " 的订单" + orderNo + " 找到啦！";
        }
        return "用户不存在！";
    }


    public String findOrderFallback(Integer userId, String orderNo) {
        return "订单查找失败！";
    }


}
