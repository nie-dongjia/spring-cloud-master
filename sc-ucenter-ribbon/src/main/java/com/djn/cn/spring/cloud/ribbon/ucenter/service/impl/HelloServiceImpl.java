package com.djn.cn.spring.cloud.ribbon.ucenter.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.djn.cn.spring.cloud.ribbon.ucenter.service.IHelloService;

@Service
public class HelloServiceImpl implements IHelloService{
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public String hiService(String name) {
		return restTemplate.getForObject("http://UCENTER-PROVIDER/user?name=" + name, String.class);
	}
}
