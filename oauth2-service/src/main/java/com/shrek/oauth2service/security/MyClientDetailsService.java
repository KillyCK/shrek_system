package com.shrek.oauth2service.security;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.shrek.oauth2service.entity.ShrekClientDetails;
import com.shrek.oauth2service.service.ShrekClientDetailsService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

import java.util.*;

/**
 * @Author: 客户端详情
 * @Description :
 * @Date: create in 2018/7/5 9:12
 **/
public class MyClientDetailsService implements ClientDetailsService {

    @Autowired
    private ShrekClientDetailsService shrekClientDetailsService;

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {

        ShrekClientDetails  shrekClientDetails= shrekClientDetailsService.selectByPrimaryKey(s);

        if (shrekClientDetails != null) {

            ClientDetails clientDetails = new ClientDetails() {
                @Override
                public String getClientId() {
                    return shrekClientDetails.getClientId();
                }

                @Override
                public Set<String> getResourceIds() {
                    if (!StringUtils.isEmpty(shrekClientDetails.getResourceIds())) {
                        String[] strArray = shrekClientDetails.getResourceIds().split(";");

                        if (strArray.length != 0) {
                            Set<String> strSet = new HashSet<String>(Arrays.asList(strArray));

                            return strSet;
                        }
                    }
                    return  null;

                }

                @Override
                public boolean isSecretRequired() {
                    return true;
                }

                @Override
                public String getClientSecret() {
                    return shrekClientDetails.getClientSecret();
                }

                @Override
                public boolean isScoped() {
                    return false;
                }

                @Override
                public Set<String> getScope() {
                    if (!StringUtils.isEmpty(shrekClientDetails.getScope())) {
                        String[] strArray = shrekClientDetails.getScope().split(";");

                        if (strArray.length != 0) {
                            Set<String> strSet = new HashSet<String>(Arrays.asList(strArray));

                            return strSet;
                        }
                    }
                    return  null;
                }

                @Override
                public Set<String> getAuthorizedGrantTypes() {
                    if (!StringUtils.isEmpty(shrekClientDetails.getAuthorizedGrantTypes())) {
                        String[] strArray = shrekClientDetails.getAuthorizedGrantTypes().split(";");

                        if (strArray.length != 0) {
                            Set<String> strSet = new HashSet<String>(Arrays.asList(strArray));

                            return strSet;
                        }
                    }
                    return null;
                }

                @Override
                public Set<String> getRegisteredRedirectUri() {
                    if (!StringUtils.isEmpty(shrekClientDetails.getWebServerRedirectUri())){

                        String[] strArray = shrekClientDetails.getWebServerRedirectUri().split(";");

                        if (strArray.length != 0){

                            Set<String> strSet = new HashSet<String>(Arrays.asList(strArray));
                            return strSet;
                        }
                    }
                    return  null;
                }

                @Override
                public Collection<GrantedAuthority> getAuthorities() {

                    if (!StringUtils.isEmpty(shrekClientDetails.getAuthorities())) {
                        String[] strArray = shrekClientDetails.getAuthorities().split(";");

                        if (strArray.length != 0) {

                            Set strSet = new HashSet();

                            for (int i = 0; i < strArray.length; i++) {
                                strSet.add(new SimpleGrantedAuthority(strArray[i]));
                            }
                            return strSet;
                        }
                    }
                    return  null;
                }

                @Override
                public Integer getAccessTokenValiditySeconds() {
                    return shrekClientDetails.getAccessTokenValidity();
                }

                @Override
                public Integer getRefreshTokenValiditySeconds() {
                    return shrekClientDetails.getRefreshTokenValidity();
                }

                @Override
                public boolean isAutoApprove(String s) {
                    return  shrekClientDetails.getAutoapprove().equals("true");
                }

                @Override
                public Map<String, Object> getAdditionalInformation() {

                    if (!StringUtils.isEmpty(shrekClientDetails.getAdditionalInformation())) {

                        Map<String, Object> res = null;
                        try {
                            Gson gson = new Gson();
                            res = gson.fromJson(shrekClientDetails.getAdditionalInformation(), new TypeToken<Map<String, Object>>() {
                            }.getType());
                        } catch (JsonSyntaxException e) {
                        }
                        return res;
                    }

                    return  null;

                }
            };

            return clientDetails;
        }

        return  null;
    }
}
