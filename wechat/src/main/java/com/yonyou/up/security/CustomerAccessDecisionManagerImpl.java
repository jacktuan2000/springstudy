package com.yonyou.up.security;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

//   判断当前用户是否拥有访问该资源的权限。
public class CustomerAccessDecisionManagerImpl implements AccessDecisionManager {
	@Override
	public void decide(Authentication authentication, Object object,
			Collection<ConfigAttribute> configAttributes)
			throws InsufficientAuthenticationException {
		if (null == configAttributes) {
			return;
		}
		Iterator<ConfigAttribute> cons = configAttributes.iterator();
		while (cons.hasNext()) {
			ConfigAttribute ca = cons.next();
			String needRole = ((SecurityConfig) ca).getAttribute();
			// gra 为用户所被赋予的权限，needRole为访问相应的资源应具有的权限
			for (GrantedAuthority gra : authentication.getAuthorities()) {
				if (needRole.trim().equals(gra.getAuthority().trim())) {
					return;
				}
			}
		}
		throw new InsufficientAuthenticationException("没有权限");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return true;
	}
}