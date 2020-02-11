/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：OAuth2AuthorizationConfig.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.config;

import com.djn.cn.spring.cloud.service.security.OAuthUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.config.OAuth2AuthorizationConfig<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/11 11:44<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/11 11:44<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthorizationConfig extends AuthorizationServerConfigurerAdapter {
    @Autowired
    @Qualifier("dataSource")
    private DataSource dataSource;
    @Autowired
    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;
    @Autowired
    private OAuthUserDetailsService oAuthUserDetailsService;


    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("browser")
                .authorizedGrantTypes("refresh_token", "password")
                .scopes("ui")
                .and()
                .withClient("service-hi")
                .secret("123456")
                .authorizedGrantTypes("client_credentials", "refresh_token","password")
                .scopes("server");
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // 在默认情况下 ， AuthorizationServerEndpointsConfigurer 配置开启了所有的验证类型
        // 除了密码类型的验证 ， 密码验证只有配置了 authenticationManager 的配置才会开启。
        JdbcTokenStore tokenStore=new JdbcTokenStore(dataSource);
        endpoints
                .tokenStore(tokenStore)
                .authenticationManager(authenticationManager)  //
                .userDetailsService(oAuthUserDetailsService); // 配置获取用户认证信息的接口
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {
        // 如果资源服务和授权服务是在同一个服务中，用默认的配置即可，不需要做其他任何的配置

        // 但是如果资源服务和授权服务不在同一个服务中，则需要做一些额外配置 。
        // 如果采用RemoteTokenServices （远程 Token 校验），资源服务器的每次请求所携带的 Token 都需要从授
        // 权服务做校验 。这时需要配置“／oauth/check token”校验节点的校验策略 。
        oauthServer
                .tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");

    }
}
