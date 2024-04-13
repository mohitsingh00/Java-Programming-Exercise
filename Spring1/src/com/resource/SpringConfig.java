package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.beans.Students;

@Configuration
public class SpringConfig {
	
	@Bean
	public Students stdID()
	{
		Students std = new Students();
		std.setId(101);
		std.setName("Mark");
		std.setEmail("mark@gmail.com");
		return std;
	}

}
