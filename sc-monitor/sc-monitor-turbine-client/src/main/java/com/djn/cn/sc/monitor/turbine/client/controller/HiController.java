/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：HiController.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.monitor.turbine.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * <b>类   名：</b>HiController<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月8日 下午9:57:20<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月8日 下午9:57:20<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@RestController
public class HiController {
  @Value("${server.port}")  
  private String port;  
  @GetMapping("/hi")
  @HystrixCommand(fallbackMethod="hiError")
  public String hi() {
      return "你好，静静-静静。。"+port;
  }
  public String hiError() {
      return "你好，静静-静静-I'm error。。"+port;
  }
  
}
