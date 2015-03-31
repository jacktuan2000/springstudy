package com.yonyou.up.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yonyou.up.domain.Equipment;

public interface EquipmentRepository  extends PagingAndSortingRepository<Equipment,Long>{

}
