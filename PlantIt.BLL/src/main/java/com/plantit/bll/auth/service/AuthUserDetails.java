package com.plantit.bll.auth.service;

import com.plantit.dal.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

public class AuthUserDetails implements UserDetails {

    private String login;
    private String password;
    private List<GrantedAuthority> authorities;

    public AuthUserDetails(User user) {
        this.login = user.getLogin();
        this.password = user.getPassword();
        this.authorities = new ArrayList<>(Collections.singleton(
                new SimpleGrantedAuthority(user.getUserType().getLabel())
                ));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
