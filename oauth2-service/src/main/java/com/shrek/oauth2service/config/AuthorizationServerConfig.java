package com.shrek.oauth2service.config;

import com.shrek.oauth2service.security.BataApprovalHandler;
import com.shrek.oauth2service.security.MyClientDetailsService;
import com.shrek.oauth2service.security.MyRedisTokenStore;
import com.shrek.oauth2service.security.RedisAuthenticationCodeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.OAuth2RequestFactory;
import org.springframework.security.oauth2.provider.approval.ApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenApprovalStore;
import org.springframework.security.oauth2.provider.approval.TokenStoreUserApprovalHandler;
import org.springframework.security.oauth2.provider.approval.UserApprovalHandler;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.RandomValueAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.endpoint.AuthorizationEndpoint;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.security.oauth2.provider.error.WebResponseExceptionTranslator;
import org.springframework.security.oauth2.provider.request.DefaultOAuth2RequestFactory;
import org.springframework.security.oauth2.provider.token.TokenStore;

import javax.annotation.PostConstruct;

/**
*
* @Author：shrek
* @Description: OAUTH2认证授权中心（进行验证和授权）
* @Date： 2018/6/27 14:51
*/
@Configuration
@EnableAuthorizationServer//提供/oauth/authorize,/oauth/token,/oauth/check_token,/oauth/confirm_access,/oauth/error
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {
    
    @Autowired
    private RedisConnectionFactory connectionFactory;//先引入redis防止后面引入的时候报错
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private AuthorizationEndpoint authorizationEndpoint;
    @Autowired
    UserDetailsService userDetailsService;

    /**
     * 初始化授权页面
     */
    @PostConstruct
    public void init() {
        authorizationEndpoint.setUserApprovalPage("forward:/oauth2/shrek_approval_page");
        authorizationEndpoint.setErrorPage("forward:/oauth2/shrek_error_page");
    }

    /**
     * 进行 token的保存
     * @return
     */
    @Bean
    public MyRedisTokenStore tokenStore() {
        return new MyRedisTokenStore(connectionFactory);
    }

    /**
     * redis保存AuthorizationCode
     * @return
     */
    @Bean
    public RandomValueAuthorizationCodeServices authorizationCodeServices(){
        RedisAuthenticationCodeServices redisAuthorizationCodeServices = new RedisAuthenticationCodeServices(connectionFactory) ;
        return  redisAuthorizationCodeServices ;
    }

    /**
     * clientDetail详情——》数据库
     * @return
     */
    @Bean
    public ClientDetailsService clientDetailsService(){
        return new MyClientDetailsService();
    }

    @Bean
    public OAuth2AccessDeniedHandler oauth2AccessDeniedHandler() {
        return new OAuth2AccessDeniedHandler();
    }

    @Bean
    public OAuth2AuthenticationEntryPoint oauth2AuthenticationEntryPoint() {
        return new OAuth2AuthenticationEntryPoint();
    }
    @Bean
    public ApprovalStore approvalStore() {
        TokenApprovalStore store = new TokenApprovalStore();
        store.setTokenStore(tokenStore());
        return store;
    }

    @Bean
    public OAuth2RequestFactory oAuth2RequestFactory() {
        return new DefaultOAuth2RequestFactory(clientDetailsService());
    }

    @Bean
    public UserApprovalHandler userApprovalHandler() {
        return new BataApprovalHandler(clientDetailsService(),approvalStore(),oAuth2RequestFactory());
    }


    @Bean
    @Autowired
    public TokenStoreUserApprovalHandler userApprovalHandler(TokenStore tokenStore){
        TokenStoreUserApprovalHandler handler = new TokenStoreUserApprovalHandler();
        handler.setRequestFactory(new DefaultOAuth2RequestFactory(clientDetailsService()));
        handler.setClientDetailsService(clientDetailsService());
        handler.setTokenStore(tokenStore);
        return handler;
    }

    @Bean
    @Autowired
    public ApprovalStore approvalStore(TokenStore tokenStore) throws Exception {
        TokenApprovalStore store = new TokenApprovalStore();
        store.setTokenStore(tokenStore);
        return store;
    }

    //配置身份认证器，配置认证方式，TokenStore，TokenGranter，OAuth2RequestFactory
    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

        endpoints.tokenStore(tokenStore())
                .authorizationCodeServices(authorizationCodeServices())
                .authenticationManager(authenticationManager)
                .userApprovalHandler(userApprovalHandler())
                .userDetailsService(userDetailsService)  //refresh_token的时候需要
                .approvalStore(approvalStore());
               // .pathMapping("/oauth/confirm_access", "/oauth/confirm_access")
               // .tokenServices(tokenServices);

    }


    @Override
    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

        security
                .authenticationEntryPoint(oauth2AuthenticationEntryPoint())
                .accessDeniedHandler(oauth2AccessDeniedHandler())
                .checkTokenAccess("isAuthenticated()") // 开启/oauth/check_token验证端口认证权限访问
                .allowFormAuthenticationForClients()
                // 开启/oauth/token_key验证端口无权限访问
                .tokenKeyAccess("permitAll()");

    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {

/*        clients.inMemory()
                .withClient("curl-client")//客户端ID
                .authorizedGrantTypes("password", "authorization_code", "refresh_token", "implicit","client_credentials")
                .authorities("ROLE_CLIENT", "ROLE_TRUSTED_CLIENT")
                .scopes("read", "write", "trust")//授权用户的操作权限
                .redirectUris("http://www.baidu.com")
                .secret("curl-secret");//密码*/
               // .accessTokenValiditySeconds(3600).//token有效期为3600秒
               // refreshTokenValiditySeconds(86400);//刷新token有效期为600秒

        clients.withClientDetails(clientDetailsService());

    }

}
