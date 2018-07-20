package com.shrek.oauth2service.config;

import com.shrek.oauth2service.security.ShrekPasswordEncoder;
import com.shrek.oauth2service.security.ShrekUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.data.repository.query.SecurityEvaluationContextExtension;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.http.HttpServletResponse;

/**
*
* @Author：shrek
* @Description:
* @Date： 2018/6/27 14:53
*/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //@Autowired(required = false)
   // private AuthenticationEntryPoint authenticationEntryPoint;

    @Bean
    public UserDetailsService userDetailsService(){
        return new ShrekUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new ShrekPasswordEncoder();
    }

    @Bean
    public SecurityEvaluationContextExtension securityEvaluationContextExtension() {
        return new SecurityEvaluationContextExtension();
    }

    //不定义没有password grant_type
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth
            .userDetailsService(userDetailsService())
            .passwordEncoder(passwordEncoder());
    }
    /**
     * 1\这里记得设置requestMatchers,不拦截需要token验证的url
     * 不然会优先被这个filter拦截,走用户端的认证而不是token认证
     * 2\这里记得对oauth的url进行保护,正常是需要登录态才可以
     */

/*    @Override
    public void configure(HttpSecurity http) throws Exception {
      http.csrf().disable();
        http
            .requestMatchers().antMatchers("/oauth/**","/login/**","/logout/**")
            .and()
            .authorizeRequests()
            .antMatchers("/oauth/**").authenticated()
            .and()
            .formLogin().permitAll();
    }*/

/*    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
            .csrf().disable()
            .headers().frameOptions().disable()
            .and().exceptionHandling().authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
            .and().requestMatchers().antMatchers("/oauth/**","/login/**","/logout/**")
            //.and().authorizeRequests().antMatchers("/oauth/**").authenticated()
            .and().formLogin().permitAll()
            //.and().formLogin().loginPage("/login").permitAll()
            //.and().formLogin().loginPage("/login").defaultSuccessUrl("/main").failureUrl("//login?error=true").permitAll()
            //.and().logout().logoutSuccessUrl("/login").permitAll()
            .and().authorizeRequests().antMatchers( "/actuator/**" ,"/oauth/**","/login/**","/logout/**").permitAll() //放开admin监控
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

    }*/

}
