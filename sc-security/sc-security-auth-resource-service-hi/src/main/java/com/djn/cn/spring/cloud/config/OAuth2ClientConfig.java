/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：OAuth2ClientConfig.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.config;

import feign.RequestInterceptor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.config.OAuth2ClientConfig<br/>
 * <b>类描述：</b>OAuth2ClientConfig<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/11 18:14<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/11 18:14<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@EnableOAuth2Client
@EnableConfigurationProperties
@Configuration
public class OAuth2ClientConfig {

    @Bean
    @ConfigurationProperties(prefix = "security.oauth2.client")
    public ClientCredentialsResourceDetails clientCredentialsResourceDetails() {
        return new ClientCredentialsResourceDetails();
    }


    /**
     * oauth2FeignRequestInterceptor    @EnableOAuth2Client.
     * 1.oauth2ClientContextFilter
     * 2.AccessTokenReques
     * @param []
     * @return feign.RequestInterceptor
     * @since 1.0.0
     * @author op.nie-dongjia
     */
    @Bean
    public RequestInterceptor oauth2FeignRequestInterceptor(){
        return new OAuth2FeignRequestInterceptor(new DefaultOAuth2ClientContext(), clientCredentialsResourceDetails());
    }

    @Bean
    public OAuth2RestTemplate clientCredentialsRestTemplate() {
        return new OAuth2RestTemplate(clientCredentialsResourceDetails());
    }
}
