package com.baeldung.task2.resource;

import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.task2.dto.UserDto;
import com.baeldung.task2.service.UserService;

import reactor.core.publisher.Flux;

@RestController
public class UserResource {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public Flux<UserDto> getAllUsers() throws InterruptedException {
		TimeUnit.SECONDS.sleep(1);
		return userService.findAllUsers();

	}
}
