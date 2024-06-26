package com.example.securitysession.service;

import com.example.securitysession.dto.CustomUserDetails;
import com.example.securitysession.entity.UserEntity;
import com.example.securitysession.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UserEntity userEntity = userRepository.findByUsername(username);
        if(userEntity != null) {
            return new CustomUserDetails(userEntity);
        }
        return null;
    }
}
