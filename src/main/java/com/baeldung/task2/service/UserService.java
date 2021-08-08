package com.baeldung.task2.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.baeldung.task2.dto.UserDto;

import reactor.core.publisher.Flux;

@Service
public class UserService {
	
	static Map<String,UserDto> users;
	
	static {
		users = new HashMap<>();
		users.put("1", UserDto.builder().id("1").name("Umair").build());
		users.put("2", UserDto.builder().id("2").name("Baig").build());
	}
	
	public Flux<UserDto> findAllUsers() {
		return Flux.fromIterable(users.values());
	}
}
