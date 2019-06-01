package com.djn.cn.spring.cloud.ribbon.ucenter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloServiceImpl {
	@Autowired
	private RestTemplate restTemplate;

	public String hiService(String name) {
		return restTemplate.getForObject("http://UCENTER-PROVIDER/user?name=" + name, String.class);
	}
}
