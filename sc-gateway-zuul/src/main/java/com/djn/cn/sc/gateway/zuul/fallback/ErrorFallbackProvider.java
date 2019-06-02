/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：ErrorFallbackProvider.java
 * 创建人：op.nie-dongjia
 * 联系方式：327803131@qq.com
 * 开源地址: github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.gateway.zuul.fallback;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * <b>类   名：</b>ErrorFallbackProvider<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月5日 下午7:43:06<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月5日 下午7:43:06<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@Component
public class ErrorFallbackProvider implements ZuulFallbackProvider {

    /* (非 Javadoc)
    * <p>Title: fallbackResponse</p>
    * <p>Description: </p>
    * @return
    * @see org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider#fallbackResponse()
    */
    @Override
    public ClientHttpResponse fallbackResponse() {
        return new ClientHttpResponse(){

            @Override
            public InputStream getBody() throws IOException {         
                return new ByteArrayInputStream("微服务错误，请稍后重试".getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers ;
            }

            @Override
            public HttpStatus getStatusCode() throws IOException {
                // TODO Auto-generated method stub
                return HttpStatus.OK ;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                // TODO Auto-generated method stub
                return 200;
            }

            @Override
            public String getStatusText() throws IOException {
                // TODO Auto-generated method stub
                return "OK";
            }
            @Override
            public void close() {
                
            }
        };
    }

    /* (非 Javadoc)
    * <p>Title: getRoute</p>
    * <p>Description: </p>
    * @return
    * @see org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider#getRoute()
    */
    @Override
    public String getRoute() {
        // TODO Auto-generated method stub
        return "*";
    }

}
