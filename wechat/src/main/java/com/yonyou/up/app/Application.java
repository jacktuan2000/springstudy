package com.yonyou.up.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration  
@ComponentScan("com.yonyou.up")  
@EntityScan("com.yonyou.up.domain")  
@EnableJpaRepositories("com.yonyou.up.repository")  
@EnableTransactionManagement
@EnableSpringDataWebSupport

//@EnableJpaAuditing 
public class Application extends SpringBootServletInitializer {

    @Override 
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
       
    	
    	SpringApplication.run(Application.class, args);

    }

}