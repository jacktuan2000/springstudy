package com.yonyou.up.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration 
@ImportResource("classpath:spring_quartz.xml") 
public class QuartzConfig {

}
