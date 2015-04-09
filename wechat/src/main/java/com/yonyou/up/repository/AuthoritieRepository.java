package com.yonyou.up.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.Authoritie;

public interface AuthoritieRepository extends  CrudRepository<Authoritie, Long> {
    @Query(" from Authoritie a where a.user.id=?1")
	public List<Authoritie> findByUserId(Long userId);
}