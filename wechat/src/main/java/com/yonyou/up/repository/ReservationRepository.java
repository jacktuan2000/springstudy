package com.yonyou.up.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.yonyou.up.domain.Reservation;

public interface ReservationRepository  extends PagingAndSortingRepository<Reservation,Long>{

}
