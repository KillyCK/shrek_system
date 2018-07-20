package com.shrek.oauth2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
*
* @Author：shrek
* @Description: 权限认证服务器
* @Date： 2018/7/5 7:05
*/
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
public class Oauth2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ServiceApplication.class, args);
	}
}
