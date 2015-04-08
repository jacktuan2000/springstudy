package com.yonyou.up.service.impl;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yonyou.up.domain.User;
@Service
@Transactional
public class UserServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;

//	        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//	        authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
//	        authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
	      
	}

}
