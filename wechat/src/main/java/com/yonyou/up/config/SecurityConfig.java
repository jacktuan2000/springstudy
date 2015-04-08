package com.yonyou.up.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.event.LoggerListener;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import com.yonyou.up.service.impl.UserServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private Logger logger = LoggerFactory.getLogger(SecurityConfig.class);   
	@Override
	public void configure(WebSecurity web) throws Exception {  
	// 设置不拦截规则
	        web.ignoring().antMatchers("/static/**", "/**/*.jsp");  
	    }  
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
    	   auth
           .inMemoryAuthentication()
               .withUser("user").password("password").roles("USER").and()
               .withUser("admin").password("password").roles("USER", "ADMIN");
    }
    
    protected void configure(HttpSecurity http) throws Exception {
    	 http
         .authorizeRequests()                                                                
             .antMatchers("/resources/**", "/signup", "/about").permitAll()                  
             .antMatchers("/admin/**").hasRole("ADMIN")                                      
             .antMatchers("/db/**").access("hasRole('ROLE_ADMIN') and hasRole('ROLE_DBA')")  
             .anyRequest().authenticated()                                                   
             .and()
            .formLogin()
                .loginPage("/login") 
                .permitAll();       
    	 
    	 
    	// 开启默认登录页面
    	// http.formLogin();
//    	// 自定义登录页面
//    	        http.csrf().disable().formLogin().loginPage("/login")  
//    	                .failureUrl("/login?error=1")  
//    	                .loginProcessingUrl("/j_spring_security_check")  
//    	                .usernameParameter("j_username")  
//    	                .passwordParameter("j_password").permitAll();  
//    	// 自定义注销
//    	        http.logout().logoutUrl("/logout").logoutSuccessUrl("/login")  
//    	                .invalidateHttpSession(true);  
//    	// session管理
//    	        http.sessionManagement().sessionFixation().changeSessionId()  
//    	                .maximumSessions(1).expiredUrl("/");  
//    	// RemeberMe
//    	        http.rememberMe().key("webmvc#FD637E6D9C0F1A5A67082AF56CE32485");  
    }
    
//    @Configuration
//    @Order(1)                                                        
//    public static class ApiWebSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                .antMatcher("/api/**")                               
//                .authorizeRequests()
//                    .anyRequest().hasRole("ADMIN")
//                    .and()
//                .httpBasic();
//        }
//    }
//
//    @Configuration                                                   
//    public static class FormLoginWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                .authorizeRequests()
//                    .anyRequest().authenticated()
//                    .and()
//                .formLogin();
//        }
//    }
    
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth)  
    throws Exception {  
    // 自定义UserDetailsService
            auth.userDetailsService(userDetailsService()).passwordEncoder(  
    new Md5PasswordEncoder());  
        }  
    @Bean
    public UserServiceImpl userDetailsService() {  
    	logger.info("UserServiceImpl");  
    	UserServiceImpl userDetailsService = new UserServiceImpl();  
    return userDetailsService;  
        }  
    @Bean
    public LoggerListener loggerListener() {  
            logger.info("org.springframework.security.authentication.event.LoggerListener");  
            LoggerListener loggerListener = new LoggerListener();  
    return loggerListener;  
        }  
    @Bean
    public org.springframework.security.access.event.LoggerListener eventLoggerListener() {  
            logger.info("org.springframework.security.access.event.LoggerListener");  
            org.springframework.security.access.event.LoggerListener eventLoggerListener = new org.springframework.security.access.event.LoggerListener();  
    return eventLoggerListener;  
        }  
   
}