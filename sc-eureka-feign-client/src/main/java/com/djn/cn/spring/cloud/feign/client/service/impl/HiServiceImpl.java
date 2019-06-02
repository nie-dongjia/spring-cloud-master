package com.djn.cn.spring.cloud.feign.client.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.djn.cn.spring.cloud.feign.client.api.EurekaClientFeign;
import com.djn.cn.spring.cloud.feign.client.service.IHiService;
@Service
public class HiServiceImpl implements IHiService{
    @Autowired
    private EurekaClientFeign eurekaClientFeign ;
    @Override
    public String hiService(String name) {
        return eurekaClientFeign.sayHiFromClientEureka (name);
    }
}
