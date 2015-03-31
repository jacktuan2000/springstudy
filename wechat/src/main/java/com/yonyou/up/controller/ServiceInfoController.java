package com.yonyou.up.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.up.domain.ServiceInfo;
import com.yonyou.up.repository.ServiceInfoRepository;


@RestController
@RequestMapping("/serviceInfo")
public class ServiceInfoController {
	private ServiceInfoRepository serviceInfoRepo;
	
	@RequestMapping("/all")
	public Iterable<ServiceInfo> findAll()
	{
		
		return serviceInfoRepo.findAll();
	}
	
	@RequestMapping("/save")
	public ServiceInfo save(ServiceInfo ServiceInfo)
	{
		return serviceInfoRepo.save(ServiceInfo);
	}
	
	@RequestMapping("/deleteById")
	public Boolean delete(@RequestParam Long id)
	{
		  serviceInfoRepo.delete(id);
		  return true;
	}
}
