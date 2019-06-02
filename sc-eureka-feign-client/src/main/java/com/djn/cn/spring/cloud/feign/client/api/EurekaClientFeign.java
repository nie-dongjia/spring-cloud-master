package com.djn.cn.spring.cloud.feign.client.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.djn.cn.spring.cloud.feign.client.config.FeignConfig;

/**
 * 
 * <b>类   名：</b>EurekaClientFeign<br/>
 * <b>类描述：</b>EurekaClientFeign<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月1日 下午11:00:11<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月1日 下午11:00:11<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@FeignClient(value = "ucenter-provider",configuration = FeignConfig.class)
public interface EurekaClientFeign {
    @RequestMapping(value = "/user")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);
}
