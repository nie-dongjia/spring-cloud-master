/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：HiController.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.controller.HiController<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/11 18:52<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/11 18:52<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@RestController
public class HiController {
    Logger logger= LoggerFactory.getLogger(HiController.class);

    @Value("${server.port}")
    String port;
    @RequestMapping("/hi")
    public String home() {
        return "hi :"+",i am from port:" +port;
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")  //
    @RequestMapping("/hello")
    public String hello (){
        return "hello you!";
    }
    @GetMapping("/getPrinciple")
    public OAuth2Authentication getPrinciple(OAuth2Authentication oAuth2Authentication, Principal principal,
                                             Authentication authentication){

        logger.info(oAuth2Authentication.getUserAuthentication().getAuthorities().toString());
        logger.info(oAuth2Authentication.toString());
        logger.info("principal.toString()"+principal.toString());
        logger.info("principal.getName()"+principal.getName());
        logger.info("authentication:"+authentication.getAuthorities().toString());

        return oAuth2Authentication;

    }
}
