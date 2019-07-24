package com.cubic.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.cubic.springbootdemo.entity.RoomEntity;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
	
	RoomEntity findByNumber(Integer number);

}
