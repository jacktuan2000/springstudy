package com.yonyou.up.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.yonyou.up.domain.Authoritie;
import com.yonyou.up.domain.User;
import com.yonyou.up.repository.AuthoritieRepository;
import com.yonyou.up.repository.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
    
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthoritieRepository authoritieRepository;
	
	// 当用户登录时，会使用输入的用户信息，与数据库中的比较，用户名错误或密码错误，
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
//		User user=new User();
//		user.setUsername("admin");
//		user.setPassword("test");
		User user=userRepository.findByUsername(userName);
	  // 读取权限
        Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
       // 这里需要从数据库里读取所有的权限点
          List<Authoritie> aes = authoritieRepository.findByUserId(user.getId());
		  for (Authoritie ae : aes) {
		   auths.add(new SimpleGrantedAuthority(ae.getAuthority()));
		  }
         user.setAuthorities(auths);
         return (UserDetails) user;

//	        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//	        authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
//	        authorities.add(new GrantedAuthorityImpl("ROLE_USER"));
	      
		
		
	}

}
