package com.shrek.apigateway.service;

import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/** 
* @Author: shrek
* @Date: 2018/8/24 13:41
* @Description: 获取权限列表
**/    
public interface PermissionService {
    boolean hasPermission(HttpServletRequest request, Authentication authentication);
}
