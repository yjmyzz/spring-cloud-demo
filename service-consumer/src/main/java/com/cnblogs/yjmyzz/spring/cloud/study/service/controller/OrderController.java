package com.cnblogs.yjmyzz.spring.cloud.study.service.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import com.cnblogs.yjmyzz.spring.cloud.study.service.client.UserFeignClient;
import feign.Client;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.cloud.netflix.feign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjunming on 2017/6/17.
 */
@Import(FeignClientsConfiguration.class)
@RestController
public class OrderController {

    private UserFeignClient userFeignClient;

    public OrderController(Decoder decoder, Encoder encoder, Client client) {
        this.userFeignClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .requestInterceptor(new BasicAuthRequestInterceptor("app01", "passwd01"))
                .target(UserFeignClient.class, "http://service-provider-demo");
    }

    @GetMapping("/order/{userId}/{orderNo}")
    public String findOrder(@PathVariable Integer userId, @PathVariable String orderNo) {
        UserDTO user = userFeignClient.findUser(userId);
        if (user != null) {
            return user.getUserName() + " 的订单" + orderNo + " 找到啦！";
        }

        return "用户不存在！";
    }


}
