package com.yonyou.up.repository;


import org.springframework.data.repository.CrudRepository;

import com.yonyou.up.domain.Resource;


public interface ResourceRepository extends  CrudRepository<Resource, Long> {

}
