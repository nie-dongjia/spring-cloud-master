package com.djn.cn.spring.cloud.provider.ucenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * <b>类   名：</b>UCenterApplication<br/>
 * <b>类描述：</b>EurekaClient <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月1日 下午5:06:57<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月1日 下午5:06:57<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@SpringBootApplication
@EnableEurekaClient   // 开启 EurekaClient 
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