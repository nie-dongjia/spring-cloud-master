package com.djn.cn.spring.cloud.ribbon.ucenter.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * <b>类   名：</b>RibbonConfig<br/>
 * <b>类描述：</b>RibbonConfig<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月1日 下午8:57:16<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月1日 下午8:57:16<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
