package com.cnblogs.yjmyzz.spring.cloud.study.service.controller;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import com.cnblogs.yjmyzz.spring.cloud.study.service.client.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yangjunming on 2017/6/17.
 */
@RestController
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private LoadBalancerClient loadBalancerClient;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;

    @GetMapping("/order/{userId}/{orderNo}")
    public String findOrder(@PathVariable Integer userId, @PathVariable String orderNo) {
        //UserDTO user = restTemplate.getForEntity("http://SERVICE-PROVIDER-DEMO/user/" + userId, UserDTO.class).getBody();
        UserDTO user = userFeignClient.findUser(userId);
        if (user != null) {
            return user.getUserName() + " 的订单" + orderNo + " 找到啦！";
        }

        return "用户不存在！";
    }

//    @GetMapping("/user-instance")
//    public List<ServiceInstance> showInfo() {
//        return this.discoveryClient.getInstances("SERVICE-PROVIDER-DEMO");
//    }
//
//    @GetMapping("/log-instance")
//    public ServiceInstance chooseInstance() {
//        return this.loadBalancerClient.choose("SERVICE-PROVIDER-DEMO");
//    }


}
