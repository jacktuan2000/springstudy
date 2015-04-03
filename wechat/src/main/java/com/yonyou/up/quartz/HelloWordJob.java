package com.yonyou.up.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWordJob {
	/** 日志对象 */
	private static final Logger log = LoggerFactory
			.getLogger(HelloWordJob.class);

	public void sayHello() {

		if (log.isInfoEnabled()) {
			log.info("HelloWord任务线程开始执行");
		}
	}
}