package com.yonyou.up.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.Authoritie;

public interface AuthoritieRepository extends  CrudRepository<Authoritie, Long> {

	public List<Authoritie> findByUserId(Long userId);
}