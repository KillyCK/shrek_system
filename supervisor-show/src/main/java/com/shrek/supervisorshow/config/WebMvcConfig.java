package com.shrek.supervisorshow.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/** 
* @Author: shrek
* @Date: 2018/7/18 17:11
* @Description: 页面跳转
**/    
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /**
     * 重写方法描述：实现在url中输入相应的地址的时候直接跳转到某个地址
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //  跳转到登陆页
        registry.addViewController("/").setViewName("forward:login");

        //registry.addViewController("/login").setViewName("login");
        // 登陆成功跳转到首页
        registry.addViewController("/main").setViewName("main");
        // 登陆成功tab首页
        registry.addViewController("/index").setViewName("index");
        // 职位列表页
        registry.addViewController("/position/list").setViewName("/position/list");
        // 用户列表页
        registry.addViewController("/supervisor/list").setViewName("/supervisor/list");
        // 角色列表页
        registry.addViewController("/role/list").setViewName("/role/list");
        // 部门列表页
        registry.addViewController("/department/list").setViewName("/department/list");
        // 菜单列表页
        registry.addViewController("/menu/list").setViewName("/menu/list");
        // 权限列表页
        registry.addViewController("/permission/list").setViewName("/permission/list");

    }

}
