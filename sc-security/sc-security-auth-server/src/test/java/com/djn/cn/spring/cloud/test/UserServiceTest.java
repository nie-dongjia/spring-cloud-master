/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：UserServiceTest.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.test;

import com.djn.cn.spring.cloud.entity.User;
import com.djn.cn.spring.cloud.service.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.test.UserServiceTest<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/11 15:28<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/11 15:28<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
public class UserServiceTest extends AbstractTestCase{
    @Autowired
    private IUserService iUserService;


    @Test
    public void createTest() {
        User user = new User();
        user.setUsername("nie-dongjia");
        user.setPassword("123456");
        iUserService.create(user);
        System.out.println("Insert ");
    }


}
