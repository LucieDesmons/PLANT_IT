package com.plantit.bll.auth.service;

import com.plantit.dal.entities.User;
import com.plantit.dal.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@EntityScan(basePackages = {
        "com.plantit.dal.entities",
        "com.plantit.dal.repositories"
})
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user = userRepository.getUserByLogin(username);

        return user.map(AuthUserDetails::new)
                .orElseThrow(() -> new UsernameNotFoundException("user not found"));

    }
}
