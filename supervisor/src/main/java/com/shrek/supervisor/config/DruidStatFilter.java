package com.shrek.supervisor.config;

import com.alibaba.druid.support.http.WebStatFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * druid过滤器. 
 * @author shrek
 * create date ：2018年5月30日 下午5:52:49
 */
@WebFilter(filterName = "druidWebStatFilter", urlPatterns = "/*",
 initParams = {
     // 忽略资源
     @WebInitParam(name = "exclusions", value = "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*")
 }
)
public class DruidStatFilter extends WebStatFilter {
}
