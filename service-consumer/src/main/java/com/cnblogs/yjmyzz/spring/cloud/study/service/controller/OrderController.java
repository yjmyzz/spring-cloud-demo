package com.cnblogs.yjmyzz.spring.cloud.study.service.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yangjunming on 2017/6/17.
 */
@RestController
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/findOrder", method = RequestMethod.GET)
    public String findOrder(Integer userId, String orderNo) {
        UserDTO user = restTemplate.getForEntity("http://localhost/findUser?userId" + userId, UserDTO.class).getBody();
        if (user != null) {
            return user.getUserName() + " 的订单" + orderNo + " 找到啦！";
        }

        return "用户不存在！";
    }
}
