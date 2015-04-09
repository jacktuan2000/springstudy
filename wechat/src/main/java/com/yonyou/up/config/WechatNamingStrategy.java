package com.yonyou.up.config;

import org.hibernate.cfg.DefaultNamingStrategy;
import org.hibernate.internal.util.StringHelper;



public class WechatNamingStrategy extends DefaultNamingStrategy{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    
	public String classToTableName(String className)
   {
	    return "WE_" +StringHelper.unqualify(className);
  }
}
