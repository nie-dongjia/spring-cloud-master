package com.djn.cn.sc.monitor.turbine.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 
 * <b>类 名：</b>MonitorTurbineServiceApplication<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月8日 下午11:00:44<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月8日 下午11:00:44<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br/>
 *
 */
@SpringBootApplication
@EnableTurbine
public class MonitorTurbineServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorTurbineServiceApplication.class, args);
    }
}
