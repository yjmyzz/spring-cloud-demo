//package com.cnblogs.yjmyzz.spring.cloud.study.service.client;
//
//import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.PathVariable;
//
///**
// * Created by yangjunming on 2017/6/30.
// */
//@Component
//public class UserFeignClientFallBack implements UserFeignClient {
//
//    @Override
//    public UserDTO findUser(@PathVariable("id") Integer userId) {
//        UserDTO dto = new UserDTO();
//        dto.setUserId(-1);
//        dto.setUserName("默认用户");
//        return dto;
//    }
//}
