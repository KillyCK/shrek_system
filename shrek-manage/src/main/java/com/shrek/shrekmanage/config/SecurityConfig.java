package com.shrek.shrekmanage.config;

import com.shrek.shrekmanage.filter.TokenFilter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.boot.autoconfigure.security.oauth2.resource.ResourceServerProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

/**
*
* @Author：shrek
* @Description:
* @Date： 2018/6/27 14:53
*/
@Configuration
@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .csrf().disable()
                .headers().frameOptions().disable()
                //.and()
                //.sessionManagement()
                //.sessionCreationPolicy(SessionCreationPolicy.NEVER)
                .and().formLogin().successForwardUrl("/main").permitAll()
                .and().authorizeRequests().antMatchers( "/actuator/**" ).permitAll() //放开admin监控
                .and().authorizeRequests().anyRequest().authenticated()
                .and().httpBasic();

    }

    @Bean
    public FilterRegistrationBean mytokenFilter(SecurityProperties security ) {
        FilterRegistrationBean registration = new FilterRegistrationBean();

        TokenFilter tokenFilter = new TokenFilter();
        registration.setFilter(tokenFilter);
       // registration.setOrder(（security.getFilter()-11)）;

        return registration;
    }

}
