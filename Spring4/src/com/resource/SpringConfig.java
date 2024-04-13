package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Employee;

@Configuration
public class SpringConfig {
	
	@Bean
	public Address addr()
	{
		Address add = new Address("H.123","Jaunpur","UP");
		return add;
	}
	
	@Bean
	public Employee empl()
	{
		Employee emp = new Employee(01,"Dave",addr());
		return emp;
	}

}
