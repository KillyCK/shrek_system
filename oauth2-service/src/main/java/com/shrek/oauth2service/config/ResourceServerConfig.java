package com.shrek.oauth2service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.HttpStatusReturningLogoutSuccessHandler;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.data.redis.RedisOperationsSessionRepository;
import org.springframework.session.security.SpringSessionBackedSessionRegistry;

/**
*
* @Author：shrek
* @Description: 被授权访问的资源(一般放在要求验证的客户端)
* @Date： 2018/6/27 14:58
*/
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Autowired
    private RedisConnectionFactory connectionFactory;//先引入redis防止后面引入的时候报错
    @Autowired(required = false)
    private AuthenticationEntryPoint authenticationEntryPoint;
    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;
    @Autowired
    private OauthLogoutHandler oauthLogoutHandler ;

    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        //制定配置一个或者多个resourceid
        resources.resourceId("resource01");
    }

    /**
     * 配置共享session在redis
     * @return
     */
    @Bean
    SpringSessionBackedSessionRegistry sessionRegistry() {
        return new SpringSessionBackedSessionRegistry(getSessionRepository());
    }

    @Bean
    public FindByIndexNameSessionRepository getSessionRepository() {
        return new RedisOperationsSessionRepository(connectionFactory);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .formLogin().loginPage("/login").successHandler(authenticationSuccessHandler).failureHandler(authenticationFailureHandler).permitAll()
            .and().logout().clearAuthentication(true).logoutSuccessUrl("/login").logoutSuccessHandler(new HttpStatusReturningLogoutSuccessHandler()).addLogoutHandler(oauthLogoutHandler).permitAll()
            .and().authorizeRequests().antMatchers( "/actuator/**" ,"/oauth/**","/login/**","/logout/**").permitAll() //放开admin监控
            .and().authorizeRequests().antMatchers( "/plugins/**","/bootstrap/**","/dist/**").permitAll()
            .and().authorizeRequests().anyRequest().authenticated()
            .and().httpBasic();

        // 基于密码 等模式可以无session,不支持授权码模式
        if (authenticationEntryPoint != null) {
            http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint);
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        } else {
            // 授权码模式单独处理，需要session的支持，此模式可以支持所有oauth2的认证
            http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);
        }

        // 解决不允许显示在iframe的问题
       // http.headers().frameOptions().disable();
        //http.headers().cacheControl();

        http.sessionManagement().maximumSessions(1).maxSessionsPreventsLogin(false).expiredUrl("/login?expired").sessionRegistry(sessionRegistry());

    }
}
