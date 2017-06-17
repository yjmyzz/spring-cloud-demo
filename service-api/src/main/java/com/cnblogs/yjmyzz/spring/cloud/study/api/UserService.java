package com.cnblogs.yjmyzz.spring.cloud.study.api;

import com.cnblogs.yjmyzz.spring.cloud.study.dto.UserDTO;

/**
 * Created by yangjunming on 2017/6/17.
 */
public interface UserService {

    UserDTO findUser(Integer userId);
}
