/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：ResourceServerConfigurer.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.config.ResourceServerConfigurer<br/>
 * <b>类描述：</b>资源服务配置<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/11 17:59<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/11 17:59<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ResourceServerConfigurer extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/user/registry").permitAll()
                .anyRequest().authenticated();
    }
}
