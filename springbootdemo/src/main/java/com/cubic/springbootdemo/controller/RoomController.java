package com.cubic.springbootdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cubic.springbootdemo.dto.RoomDto;
import com.cubic.springbootdemo.service.RoomService;

@RestController
@RequestMapping(value="/rooms")
public class RoomController {
	
	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="", method= RequestMethod.POST)
	public void createRoom(@RequestBody @Valid RoomDto roomDto) {
		roomService.saveRoom(roomDto);
		
	}

}
