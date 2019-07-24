package com.cubic.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.springbootdemo.dto.RoomDto;
import com.cubic.springbootdemo.entity.RoomEntity;
import com.cubic.springbootdemo.entity.RoomEntity.Type;
import com.cubic.springbootdemo.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository;

	public void saveRoom(RoomDto roomDto) {

		if (roomDto != null) {
			RoomEntity roomEntity = roomRepository.findByNumber(roomDto.getNumber());
			if (roomEntity == null) {
				roomEntity = new RoomEntity();
				roomEntity.setNumber(roomDto.getNumber());

				System.out.println("type" + Type.valueOf(roomDto.getType()));

				
				roomEntity.setType(Type.valueOf(roomDto.getType()));
				roomEntity.setTypeDescription(roomDto.getDescription());
				roomEntity.setIsSmoking(roomDto.getIsSmoking());
				roomEntity.setWifiAvailable(roomDto.getWifi());
				roomEntity.setBasePrice(roomDto.getPrice());

				roomRepository.save(roomEntity);
			} else {
				System.out.println("Room number " + roomDto.getNumber() + " already exists");
			}
		} else {
			System.out.println("room dto is null");
		}

	}
}
