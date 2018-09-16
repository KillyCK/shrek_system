package com.shrek.apigateway.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xiaoleilu.hutool.collection.CollectionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
* @Author: shrek
* @Date: 2018/8/24 13:56
* @Description: 拦截器
**/
@Component
public class ShrekFilter extends ZuulFilter{

    private static Logger log = LoggerFactory.getLogger(ShrekFilter.class);
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        try {

            //解决zuul token传递问题
            Authentication user = SecurityContextHolder.getContext().getAuthentication();
            if(user!=null){

                if(user instanceof OAuth2Authentication){

                    Authentication athentication = (Authentication)user;

                    OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) athentication.getDetails() ;
                    ctx.addZuulRequestHeader("Authorization", "bearer "+details.getTokenValue());
                }

            }

        } catch (Exception e) {

        }
        return null;


    }
}