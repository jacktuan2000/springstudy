package com.yonyou.up.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

import com.yonyou.up.domain.Authoritie;
import com.yonyou.up.domain.Resource;
import com.yonyou.up.repository.AuthoritieRepository;
import com.yonyou.up.repository.ResourceRepository;
//服务器启动时，会将数据库中所有权限和资源提取出来，放在一个map里，等用户登录到该系统时，就会使用到map，从而判断该用户是否有这个权限。
public class SecurityMetadataSourceImpl implements
		FilterInvocationSecurityMetadataSource {
	private static final Logger logger = LoggerFactory
			.getLogger(SecurityMetadataSourceImpl.class);
	

	private ResourceRepository resourceRepository;
	@Autowired
	private AuthoritieRepository  authoritieRepository;

	@Autowired
	public SecurityMetadataSourceImpl(ResourceRepository resourceRepository) {
		this.resourceRepository=resourceRepository;
		initResources();
	}

	// 所有的资源和权限的映射就存在这里
	private HashMap<RequestMatcher, Collection<ConfigAttribute>> requestMap = new HashMap<RequestMatcher, Collection<ConfigAttribute>>();
	private Collection<ConfigAttribute> allAttribute = new HashSet<ConfigAttribute>();

	/**
	 * 初始化所有的资源,这个会在容器运行的时候的构造方法里调用
	 */
	private void initResources() {
		logger.debug("init SecurityMetadataSource load all resources");
		// 读取所有的资源,和资源相关联的的权限
		// 读取所有资源
		Iterable<Resource> allResources = resourceRepository.findAll();
		// 循环所有资源
		for (Resource resource : allResources) {
			// 获取资源
			String resourceContent = resource.getContent();
			// 把url资源转化为一个spring的工具类,请求匹配器类
			logger.debug("add new requestmatcher with [" + resourceContent
					+ "]");
			RequestMatcher matcher = new AntPathRequestMatcher(resourceContent);
			// 循环权限 定义一个权限的集合,和此资源对应起来,添加到HashMap里
			Collection<ConfigAttribute> array = new ArrayList<ConfigAttribute>();
			for (Authoritie auth : resource.getAuthorities()) {
				// 转化权限对象为SecurityConfig
				SecurityConfig securityConfig = new SecurityConfig(
						auth.getAuthority());
				array.add(securityConfig);
			}
			requestMap.put(matcher, array);
		}
	}

	/**
	 * 根据资源获取需要的权限名称
	 */
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		logger.debug("get resource " + object + " authority");
		// 把对象转化为请求
		final HttpServletRequest request = ((FilterInvocation) object)
				.getRequest();
		// 循环整个Map 看看有没有可以匹配的,如果有匹配的就立刻返回
		Collection<ConfigAttribute> attrHashMap = new HashSet<ConfigAttribute>();
		for (Map.Entry<RequestMatcher, Collection<ConfigAttribute>> entry : requestMap
				.entrySet()) {
			if (entry.getKey().matches(request)) {
				logger.debug("request matches :" + request.getRequestURL());
				attrHashMap.addAll(entry.getValue());
			}
		}
		if (attrHashMap.size() > 0) {
			// 如果有匹配的就转成ArrayList,然后返回list
			Collection<ConfigAttribute> attr = new ArrayList<ConfigAttribute>(
					attrHashMap);
			return attr;
		}
		logger.debug("request no matches");
		return Collections.emptyList();
	}

	/**
	 * 获取所有权限点
	 */
	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return this.allAttribute;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}
}