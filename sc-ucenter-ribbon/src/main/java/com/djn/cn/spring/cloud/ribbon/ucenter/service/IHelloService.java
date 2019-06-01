package com.djn.cn.spring.cloud.ribbon.ucenter.service;
/**
 * 
 * <b>类   名：</b>IHelloService<br/>
 * <b>类描述：</b>IHelloService <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月1日 下午6:04:35<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月1日 下午6:04:35<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
public interface IHelloService {
    /**
     * 
     * hiService 客户端调用
     *
     * @param name
     * @return   
     * @since 1.0
     * @author op.nie-dongjia
     */
    String hiService(String name);
}
