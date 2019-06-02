/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：LoggerFilter.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.zipkin.gateway.service.filter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;

/**
 * <b>类   名：</b>LoggerFilter<br/>
 * <b>类描述：</b>在链路数据中添加自定义数据 过滤器<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月7日 下午2:16:47<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月7日 下午2:16:47<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@Component
public class LoggerFilter extends ZuulFilter{
    @Autowired
    private Tracer tracer;
    @Override
    public boolean shouldFilter() {
        // TODO Auto-generated method stub
        return true;
    }
    @Override
    public Object run() {
        tracer.addTag("operator", "op-platform");
        System.out.println("traceId:"+tracer.getCurrentSpan().traceIdString());
        return null;
    }
    @Override
    public String filterType() {
        // tracer Auto-generated method stub
        
        return FilterConstants.POST_TYPE;
    }
    @Override
    public int filterOrder() {
        // TODO Auto-generated method stub
        return 900;
    }
    
}
