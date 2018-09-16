package com.shrek.oauth2service.security;

import com.shrek.oauth2service.entity.Supervisor;
import com.shrek.oauth2service.entity.SupervisorExample;
import com.shrek.oauth2service.service.SupervisorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Set;

/**
*
* @Author：shrek
* @Description: 
* @Date： 2018/6/27 15:00
*/
public class ShrekUserDetailsService implements UserDetailsService {

/*    @Autowired
    private RedisConnectionFactory connectionFactory;//先引入redis防止后面引入的时候报错*/
    @Autowired
    private SupervisorService supervisorService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        System.out.println(username);
        SupervisorExample example = new SupervisorExample();
       // example.or().andUsernameIsNotNull().andUsernameEqualTo(username);
       // System.out.println(example.toString());

        List<Supervisor> supervisors =  supervisorService.selectByExample(example);

        System.out.println("--------------------獲取到supervisor---------------------");
        System.out.println("-----------------------"+supervisors.size());
       // System.out.println(supervisors.get(0).toString());

        if (supervisors.size() != 0){

            //connectionFactory.getConnection().set(("id"+supervisors.get(0).getUsername()).getBytes(),String.valueOf(supervisors.get(0).getSupervisorId()).getBytes());
            Set<GrantedAuthority> grantedAuthorities = supervisors.get(0).getAuthorities();
            //System.out.println(supervisors.get(0).getUsername()+supervisors.get(0).getPasswd()+grantedAuthorities);
            return new User(supervisors.get(0).getUsername(),supervisors.get(0).getPasswd(),grantedAuthorities);
        }else{
            throw  new UsernameNotFoundException("用户:" + username + "不存在!");
        }

    }
}
