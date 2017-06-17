package com.cnblogs.yjmyzz.spring.cloud.study.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.api.UserService;
import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjunming on 2017/6/17.
 */
@RestController
public class UserController {

    @Autowired
    DiscoveryClient client;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    public UserDTO findUser(Integer userId) {
        return userService.findUser(userId);
    }
}
