package com.shrek.oauth2service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;

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
    @Autowired(required = false)
    private AuthenticationEntryPoint authenticationEntryPoint;

    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        //制定配置一个或者多个resourceid
        resources.resourceId("resource01");
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
            //.csrf().disable()
            //.headers().frameOptions().disable()
              //  .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.NEVER)
            //.and().exceptionHandling().authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
            //.and().requestMatchers().antMatchers("/oauth/**","/login/**","/logout/**")
            //.and().authorizeRequests().antMatchers("/oauth/**").authenticated()
            //.and().formLogin().permitAll()
            .and().formLogin().loginPage("/login").permitAll()
            //.and().formLogin().loginPage("/login").defaultSuccessUrl("/main").failureUrl("//login?error=true").permitAll()
            //.and().logout().logoutSuccessUrl("/login").permitAll()
            .and().authorizeRequests().antMatchers( "/actuator/**" ,"/oauth/**","/login/**","/logout/**").permitAll() //放开admin监控
            .and().authorizeRequests().anyRequest().authenticated()
            .and().httpBasic();


        // 基于密码 等模式可以无session,不支持授权码模式
/*        if (authenticationEntryPoint != null) {
            http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint);
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        } else {
            // 授权码模式单独处理，需要session的支持，此模式可以支持所有oauth2的认证
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
        }*/

    }
}
