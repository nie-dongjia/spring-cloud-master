/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：BlogController.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.controller;

import com.djn.cn.spring.cloud.entity.Blog;
import com.djn.cn.spring.cloud.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.controller.BlogController<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/10 15:18<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/10 15:18<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 *
 */
@RestController
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private IBlogService iBlogService;

    @GetMapping
    public ModelAndView list(Model model) {

        List<Blog> list = iBlogService.getBlogs();
        model.addAttribute("blogsList", list);
        return new ModelAndView("blogs/list", "blogModel", model);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")  //
    @GetMapping(value = "/{id}/deletion")
    public ModelAndView delete(@PathVariable("id") Long id, Model model) {
        iBlogService.deleteBlog(id);
        model.addAttribute("blogsList", iBlogService.getBlogs());
        return new ModelAndView("blogs/list", "blogModel", model);
    }
}