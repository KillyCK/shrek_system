package com.shrek.consumer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

import javax.servlet.http.HttpServletResponse;


/**
*
* @Author：shrek
* @Description: 被授权访问的资源(一般放在要求验证的客户端)
* @Date： 2018/6/27 14:58
*/
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        resources.resourceId("resource01");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .authorizeRequests()
            .antMatchers("/swagger-ui.html/**","/webjars/**","/swagger-resources/**","/v2/**") //开放访问swagger文档的权限
            .permitAll()
            .and()
            .authorizeRequests() //Authorize Request Configuration
            .antMatchers( "/actuator/**" )
            .permitAll() //放开admin监控
            .and()
            .exceptionHandling()
            .authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
            .and()
            .authorizeRequests()
            .anyRequest().authenticated()
            .and()
            .httpBasic();

    }
}
