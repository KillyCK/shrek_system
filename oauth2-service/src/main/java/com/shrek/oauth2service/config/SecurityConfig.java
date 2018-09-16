package com.shrek.oauth2service.config;

import com.shrek.oauth2service.security.ShrekPasswordEncoder;
import com.shrek.oauth2service.security.ShrekUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
*
* @Author：shrek
* @Description:
* @Date： 2018/6/27 14:53
*/
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 验证用户
     * @return
     */
    @Bean
    public UserDetailsService userDetailsService(){
        return new ShrekUserDetailsService();
    }

    /**
     * 密码的解析方式
     * @return
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new ShrekPasswordEncoder();
    }

/*    @Bean
    public SecurityEvaluationContextExtension securityEvaluationContextExtension() {
        return new SecurityEvaluationContextExtension();
    }*/

    //不定义没有password grant_type
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    /**
     * 验证用户
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService()).passwordEncoder(passwordEncoder());
    }
    /**
     * 1\这里记得设置requestMatchers,不拦截需要token验证的url
     * 不然会优先被这个filter拦截,走用户端的认证而不是token认证
     * 2\这里记得对oauth的url进行保护,正常是需要登录态才可以
     */

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/favor.ioc");
    }

}
