package com.wipro.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@EnableWebSecurity
public class SpringSecurityIntializer extends WebSecurityConfigurerAdapter {
	@Autowired
	private DataSource dataSource;
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth
		.jdbcAuthentication()
		.passwordEncoder(passwordEncoder)
		.dataSource(dataSource);
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests()
		.antMatchers("/trainer").hasAuthority("trainer")
		.antMatchers("/coder").hasAuthority("coder")
		.antMatchers("/").authenticated()
		.antMatchers("/welcome").permitAll()
		.and().formLogin().loginPage("/login")
		.and()
		.httpBasic()
		.and().logout()
		.and().exceptionHandling().accessDeniedPage("/error");
	}
	
}
