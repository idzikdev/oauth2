package pl.idzikdev.oauth2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.idzikdev.oauth2.models.UserInfo;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService {
    @Autowired
    private UserService service;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserInfo userInfo=service.getUserInfoByUsername(userName);
        GrantedAuthority authority=new SimpleGrantedAuthority(userInfo.getRole());
        return new User(userInfo.getUsername(),userInfo.getPassword(), Arrays.asList(authority));
    }
}
