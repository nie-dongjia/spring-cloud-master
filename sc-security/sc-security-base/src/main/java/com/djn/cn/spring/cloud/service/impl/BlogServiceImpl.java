/**
 * Copyright (c) 2020-2025. op-platform.cn All Rights Reserved.
 * 项目名称：开放开发平台
 * 类名称：BlogServiceImpl.java
 * 创建人：op.nie-dongjia
 * 联系方式：niedongjiamail@qq.com
 * 开源地址: https://github.com/nie-dongjia
 * 项目官网:
 */
package com.djn.cn.spring.cloud.service.impl;

import com.djn.cn.spring.cloud.entity.Blog;
import com.djn.cn.spring.cloud.service.IBlogService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * <b>类  名：</b>com.djn.cn.spring.cloud.service.impl.BlogServiceImpl<br/>
 * <b>类描述：</b>TODO<br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2020/2/10 15:33<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2020/2/10 15:33<br/>
 * <b>修改备注：</b><br/>
 *
 * @version 1.0.0 <br/>
 */
@Service
public class BlogServiceImpl implements IBlogService {

    private List<Blog> list = new ArrayList<>();

    public BlogServiceImpl() {
        list.add(new Blog(1L, " spring in action", "good!"));
        list.add(new Blog(2L, "spring boot in action", "nice!"));
    }

    @Override
    public List<Blog> getBlogs() {
        return list;
    }

    @Override
    public void deleteBlog(long id) {
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            Blog blog = (Blog) iter.next();
            if (blog.getId() == id) {
                iter.remove();
            }
        }
    }
}
