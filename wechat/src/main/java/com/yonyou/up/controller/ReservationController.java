package com.yonyou.up.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yonyou.up.domain.Reservation;
import com.yonyou.up.repository.ReservationRepository;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	@Autowired
	private ReservationRepository reservationRepo;

	@RequestMapping("/all")
	public Iterable<Reservation> findAll() {

		return reservationRepo.findAll();
	}

	@RequestMapping("/findByPage")
	public Iterable<Reservation> findByPage(Pageable pageable) {
     //org.springframework.data.domain.PageRequest

		return reservationRepo.findAll(pageable);
	}
	@RequestMapping("/save")
	public Reservation save(Reservation reservation) {
		return reservationRepo.save(reservation);
	}

	@RequestMapping("/deleteById")
	public Boolean delete(@RequestParam Long id) {
		reservationRepo.delete(id);
		return true;
	}
}
