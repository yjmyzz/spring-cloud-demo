package com.cnblogs.yjmyzz.spring.cloud.study.service.client;

import com.cnblogs.yjmyzz.spring.cloud.study.api.UserService;
import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by yangjunming on 2017/6/28.
 */
@FeignClient(name = "service-provider-demo", configuration = BasicAuthConfiguration.class)
public interface UserFeignClient extends UserService {

    @GetMapping(value = "/user/{id}")
    UserDTO findUser(@PathVariable("id") Integer userId);

}
