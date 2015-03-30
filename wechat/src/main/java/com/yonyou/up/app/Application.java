package com.yonyou.up.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableAutoConfiguration  
@ComponentScan("com.yonyou.up")  
@EntityScan("com.yonyou.up.domain")  
@EnableJpaRepositories("com.yonyou.up.repository")  
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
