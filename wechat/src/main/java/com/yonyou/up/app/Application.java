package com.yonyou.up.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
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
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
