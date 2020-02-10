/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：UserDao.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.dao;

import com.djn.cn.spring.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.dao.UserDao<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/10 15:36<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/10 15:36<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
