package com.djn.cn.spring.cloud.feign.client.service;

public interface IHiService {
    /**
     * 
     * hiService 客户端调用
     *
     * @param name
     * @return   
     * @since 1.0
     * @author op.nie-dongjia
     */
    String hiService(String name);
}
