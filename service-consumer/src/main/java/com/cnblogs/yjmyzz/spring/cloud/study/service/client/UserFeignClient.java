package com.cnblogs.yjmyzz.spring.cloud.study.service.client;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import feign.Param;
import feign.RequestLine;

/**
 * Created by yangjunming on 2017/6/28.
 */
//@FeignClient(name = "service-provider-demo")
public interface UserFeignClient {

    @RequestLine("GET /user/{id}")
    UserDTO findUser(@Param("id") Integer userId);

}
