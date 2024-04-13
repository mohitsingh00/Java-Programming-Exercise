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
		Address add = new Address();
		add.setHno("H.123");
		add.setCity("Jaunpur");
		add.setState("UP");
		return add;
	}
	
	@Bean
	public Employee empl()
	{
		Employee emp = new Employee();
		emp.setId(01);
		emp.setName("Dave");
		emp.setAddress(addr());
		return emp;
	}

}
