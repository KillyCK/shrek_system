package com.shrek.supervisorshow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;


/**
*
* @Author：shrek
* @Description: 被授权访问的资源(一般放在要求验证的客户端)
* @Date： 2018/6/27 14:58
*/
//@Configuration
//@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

/*    @Bean
    LoginSuccessHandle loginSuccessHandle(){return new LoginSuccessHandle();}

    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        resources.resourceId("resource01");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

       http
            .csrf().disable()
            .headers().frameOptions().disable()
            .and().authorizeRequests().anyRequest().authenticated()
            .and().formLogin().loginPage("/login").defaultSuccessUrl("/main").successHandler(loginSuccessHandle()).failureUrl("//login?error=true").permitAll()
            .and().logout().logoutSuccessUrl("/login").permitAll()
            .and().authorizeRequests().antMatchers( "/actuator/**" ).permitAll() //放开admin监控
            .and().httpBasic();

    }*/
}
