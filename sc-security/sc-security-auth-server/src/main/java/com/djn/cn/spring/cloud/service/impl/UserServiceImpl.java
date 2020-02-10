/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：UserServiceImpl.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.service.impl;

import com.djn.cn.spring.cloud.entity.User;
import com.djn.cn.spring.cloud.repository.UserDAO;
import com.djn.cn.spring.cloud.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.service.impl.UserServiceImpl<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/10 23:14<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/10 23:14<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@Service
public class UserServiceImpl implements IUserService {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDAO userDAO;

    @Override
    public void create(User user) {
        User existing = userDAO.findByUsername(user.getUsername());
        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userDAO.save(user);
    }
}

