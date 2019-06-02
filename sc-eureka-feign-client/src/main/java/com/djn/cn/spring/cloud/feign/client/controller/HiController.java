package com.djn.cn.spring.cloud.feign.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.spring.cloud.feign.client.service.IHiService;

/**
 * <b>类   名：</b>HiController<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年6月2日 上午10:20:16<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年6月2日 上午10:20:16<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@RestController
public class HiController {
    @Autowired
    private IHiService iHiService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return iHiService.hiService(name);
    }
}
