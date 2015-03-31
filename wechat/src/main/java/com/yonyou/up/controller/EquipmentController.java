package com.yonyou.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.up.domain.Equipment;
import com.yonyou.up.repository.EquipmentRepository;

@RestController
@RequestMapping("/equipment")
public class EquipmentController {
	@Autowired
	private EquipmentRepository  equipmentRepo;
	
	@RequestMapping("/all")
	public Iterable<Equipment> findAll()
	{
		
		return  equipmentRepo.findAll();
	}
	
	@RequestMapping("/findByPage")
	public Iterable<Equipment> findByPage(Pageable pageable ) {
     //org.springframework.data.domain.PageRequest

		return equipmentRepo.findAll(pageable);
	}
	@RequestMapping("/save")
	public Equipment save(Equipment equipment)
	{
		return  equipmentRepo.save(equipment);
	}
	
	@RequestMapping("/deleteById")
	public Boolean delete(@RequestParam Long id)
	{
		  equipmentRepo.delete(id);
		  return true;
	}
}
