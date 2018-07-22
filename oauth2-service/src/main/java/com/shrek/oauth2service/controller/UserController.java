package com.shrek.oauth2service.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
* @Author: shrek
* @Date: 2018/7/22 12:09
* @Description: 验证信息
**/
@RestController
public class UserController {

    @RequestMapping("/user/me")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }
}
