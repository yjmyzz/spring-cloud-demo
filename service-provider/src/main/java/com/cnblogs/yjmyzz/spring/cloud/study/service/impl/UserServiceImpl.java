package com.cnblogs.yjmyzz.spring.cloud.study.service.impl;

import com.cnblogs.yjmyzz.spring.cloud.study.api.UserService;
import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO findUser(Integer userId) {
        UserDTO user = new UserDTO();
        user.setUserId(userId);
        user.setUserName("菩提树下的杨过");
        return user;
    }
}
