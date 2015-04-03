package com.yonyou.up.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class ExampleJob extends QuartzJobBean {
    /** 日志对象 */
	private static final Logger log = LoggerFactory
			.getLogger(HelloWordJob.class);
	
    private String name;
	/**
     * Setter called after the ExampleJob is instantiated
     * with the value from the JobDetailFactoryBean (5)
     */
    public void setName(String name) {
		this.name = name;
	}



    protected void executeInternal(JobExecutionContext ctx) throws JobExecutionException {
        // do the actual work
    	log.info(name+"任务线程开始执行");
    }

    


}