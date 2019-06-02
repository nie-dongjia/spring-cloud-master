package com.djn.cn.sc.config.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * <b>类   名：</b>ConfigServerApplication<br/>
 * <b>类描述：</b>ConfigServerApplication<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月6日 下午2:23:29<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月6日 下午2:23:29<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0.0<br/>
 *
 */
@SpringBootApplication
@EnableConfigServer
public class GitConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(GitConfigServerApplication.class, args);
	}
}
