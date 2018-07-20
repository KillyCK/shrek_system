package com.shrek.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

/**
 *
 * @Author：shrek
 * @Description: 负载均衡
 * @Date： 2018/6/19 16:48
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@EnableGlobalMethodSecurity(prePostEnabled = true)//开启注解
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
