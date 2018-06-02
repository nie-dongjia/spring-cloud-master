package com.djn.cn.spring.cloud.provider.ucenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UCenterApplication {
	   public static void main(String[] args) {
	        SpringApplication.run(UCenterApplication.class, args);
	    }
	    @Value("${server.port}")
	    private String port;
	    @RequestMapping("/user")
	    public String home(@RequestParam String name) {
	        return "hi "+name+",i am from port:" +port;
	    }
}