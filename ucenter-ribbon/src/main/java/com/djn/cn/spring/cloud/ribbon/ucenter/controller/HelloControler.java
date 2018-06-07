package com.djn.cn.spring.cloud.ribbon.ucenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.spring.cloud.ribbon.ucenter.service.HelloServiceImpl;

/**
 * 
 * @ClassName HelloControler
 * @Description
 * @author 聂冬佳
 * @date 2018年6月7日 下午5:59:12
 *
 */
@RestController
public class HelloControler {
	@Autowired
	private HelloServiceImpl helloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return helloService.hiService(name);
	}
}
