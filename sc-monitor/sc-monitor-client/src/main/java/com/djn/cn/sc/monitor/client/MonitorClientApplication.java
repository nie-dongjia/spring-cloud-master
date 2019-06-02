/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：MonitorClientApplication.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.monitor.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * <b>类   名：</b>MonitorClientApplication<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月8日 下午7:28:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月8日 下午7:28:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MonitorClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorClientApplication.class, args);
    }

}
