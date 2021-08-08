package com.baeldung.task2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder=true)
public class UserDto {

	private String id;
	private String name;
	
}
