package com.shrek.supervisorshow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
* @Author: shrek
* @Date: 2018/7/18 16:33
* @Description: 后台页面
**/
@SpringBootApplication
@EnableEurekaClient
//@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
@RefreshScope
@EnableOAuth2Sso
public class SupervisorShowApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupervisorShowApplication.class, args);
    }
}
