package com.djn.cn.sc.monitor.turbine.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

import de.codecentric.boot.admin.config.EnableAdminServer;

/**
 * 
 * <b>类 名：</b>MonitorTurbineServerApplication<br/>
 * <b>类描述：</b>MonitorTurbineServerApplication<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020年2月8日 下午11:32:49<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020年2月8日 下午11:32:49<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0<br/>
 *
 */
@SpringBootApplication
@EnableAdminServer
@EnableHystrix
@EnableTurbine
@EnableHystrixDashboard
public class MonitorTurbineServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MonitorTurbineServerApplication.class, args);
    }
}
