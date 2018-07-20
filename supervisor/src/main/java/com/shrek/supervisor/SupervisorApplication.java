package com.shrek.supervisor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @Author：shrek
 * @Description: 后台服务
 * @Date： 2018/6/19 9:56
 */
@SpringBootApplication
@EnableEurekaClient
@RefreshScope
@MapperScan("com.shrek.supervisor.dao")
public class SupervisorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SupervisorApplication.class, args);
    }
}
