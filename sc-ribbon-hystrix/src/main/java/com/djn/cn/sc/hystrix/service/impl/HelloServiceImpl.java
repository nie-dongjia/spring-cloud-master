package com.djn.cn.sc.hystrix.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.djn.cn.sc.hystrix.service.IHelloService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloServiceImpl implements IHelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError")
    @Override
    public String hiService(String name) {
        // 采用断路器的好处 可以防止 
        return restTemplate.getForObject("http://UCENTER-PROVIDER/user?name=" + name, String.class);
    }
    
    public String hiError(String name) {
        return "Hi ! " + name + " ,远程调用错误" ;
    }
}
