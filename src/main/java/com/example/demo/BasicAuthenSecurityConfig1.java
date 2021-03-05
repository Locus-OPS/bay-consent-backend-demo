package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

@Configuration
@EnableWebSecurity
@Order(1)
public class BasicAuthenSecurityConfig1 extends WebSecurityConfigurerAdapter { // extends WebSecurityConfigurerAdapter
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		  http
	         .csrf().disable()
	         .antMatcher("/consent-service/**")
	         .authorizeRequests()		
	         .anyRequest()
	         //.authenticated()
	         .hasRole("CUSTOMER")
	         .and()
	         .httpBasic();
		  
//		  http.antMatcher("/customers/**")
//          .authorizeRequests().anyRequest().hasRole("CUSTOMER")
//          .and().httpBasic();
          //.authenticationEntryPoint(authenticationEntryPoint());
    }

//    @Bean
//    public AuthenticationEntryPoint authenticationEntryPoint(){
//        BasicAuthenticationEntryPoint entryPoint = 
//          new BasicAuthenticationEntryPoint();
//        entryPoint.setRealmName("admin realm");
//        return entryPoint;
//    }

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
        	.inMemoryAuthentication()
            .withUser("customer")
            .password("{noop}password")
            .roles("CUSTOMER");
	}
}