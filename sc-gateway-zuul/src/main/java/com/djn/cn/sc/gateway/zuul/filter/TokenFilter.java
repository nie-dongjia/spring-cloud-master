/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：TokenFilter.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网: 
 */
package com.djn.cn.sc.gateway.zuul.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * <b>类   名：</b>TokenFilter<br/>
 * <b>类描述：</b>Token Filter<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月5日 下午10:31:27<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月5日 下午10:31:27<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@Component
public class TokenFilter extends ZuulFilter{
    private static final Logger logger = LoggerFactory.getLogger(TokenFilter.class);

    @Override
    public Object run() {
        RequestContext  requestContext = RequestContext.getCurrentContext(); 
        HttpServletRequest request = requestContext.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken ==null){
            logger.warn("token is empty");
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            try {
                requestContext.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
            
        }
        logger.info("ok");
        
        return null;
    }


    @Override
    public boolean shouldFilter() {
        // TODO Auto-generated method stub
        return true;
    }

   
    @Override
    public int filterOrder() {
        // TODO Auto-generated method stub
        return 0;
    }

    
    @Override
    public String filterType() {
        // TODO Auto-generated method stub
        return "pre";
    }

}
