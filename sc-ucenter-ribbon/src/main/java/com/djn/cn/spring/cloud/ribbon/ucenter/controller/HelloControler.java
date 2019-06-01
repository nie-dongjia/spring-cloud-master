package com.djn.cn.spring.cloud.ribbon.ucenter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.spring.cloud.ribbon.ucenter.service.IHelloService;
import com.djn.cn.spring.cloud.ribbon.ucenter.service.impl.HelloServiceImpl;

/**
 * 
 * <b>类   名：</b>HelloControler<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月1日 下午6:03:47<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月1日 下午6:03:47<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@RestController
public class HelloControler {
	@Autowired
	private IHelloService iHelloService;

	@RequestMapping(value = "/hi")
	public String hi(@RequestParam String name) {
		return iHelloService.hiService(name);
	}
}
