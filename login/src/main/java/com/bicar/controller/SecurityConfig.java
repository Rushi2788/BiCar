package com.bicar.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http
                .antMatcher("/abc").authorizeRequests()
                .antMatchers(new String[]{"/", "/notrestricted"  ,"/Customer/** "}).permitAll()
                .anyRequest().authenticated()
                .and()
                .oauth2Login();
    }
}
