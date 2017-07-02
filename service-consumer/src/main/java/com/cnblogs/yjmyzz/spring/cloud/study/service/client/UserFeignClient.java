package com.cnblogs.yjmyzz.spring.cloud.study.service.client;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-provider-demo", configuration = BasicAuthConfiguration.class)
public interface UserFeignClient {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    UserDTO findUser(@PathVariable("id") Integer userId);

}
