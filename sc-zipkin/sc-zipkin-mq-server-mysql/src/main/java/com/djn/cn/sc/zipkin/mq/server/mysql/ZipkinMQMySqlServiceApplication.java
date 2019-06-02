/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：ZipkinServiceApplication.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.zipkin.mq.server.mysql;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
import org.springframework.context.annotation.Bean;

import zipkin.storage.mysql.MySQLStorage;


/**
 * <b>类 名：</b>ZipkinMQServiceApplication<br/>
 * <b>类描述：</b>ZipkinMQServiceApplication<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月6日 下午8:04:42<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月6日 下午8:04:42<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br/>
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinStreamServer
public class ZipkinMQMySqlServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinMQMySqlServiceApplication.class, args);
    }
    @Bean
    public MySQLStorage mySQLStorage(DataSource dataSource) {
        return MySQLStorage.builder().datasource(dataSource).executor(Runnable::run).build();
    }
}
