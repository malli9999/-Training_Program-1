package io.usecase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.usecase.model.DemoUser;
import io.usecase.repository.DemoUserRepository;

import java.util.ArrayList;

@Service
public class DemoUserDetailsService implements UserDetailsService {
    @Autowired
    private DemoUserRepository repository;

    @ Autowired
    private  JdbcTemplate jdbcTemplate;
    
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        DemoUser user = repository.findByUserName(username);
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), new ArrayList<>());
    }
    
   
    
}