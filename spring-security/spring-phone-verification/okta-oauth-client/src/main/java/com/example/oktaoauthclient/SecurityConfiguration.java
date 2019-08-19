package com.example.oktaoauthclient;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Security Config to setup access rules in the App
 *
 * @author novoydarskiy
 * Date: 19.08.2019
 */
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

  /**
   * Only root URL (http://localhost:8080/) can be accessed by anyone.
   * All other Application Path require authorization and authentication by OAuth
   *
   * @param http
   *
   * @throws Exception
   */
  @Override
  public void configure(HttpSecurity http) throws Exception {
    http.antMatcher("/**").authorizeRequests()
        .antMatchers("/").permitAll()
        .anyRequest().authenticated()
        .and()
        .oauth2Login();
  }

}
