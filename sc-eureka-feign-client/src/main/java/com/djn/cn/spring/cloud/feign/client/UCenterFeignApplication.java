package com.djn.cn.spring.cloud.feign.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@SpringBootApplication
@EnableDiscoveryClient
public class UCenterFeignApplication {
	public static void main(String[] args) {
		SpringApplication.run(UCenterFeignApplication.class, args);
	}
}
