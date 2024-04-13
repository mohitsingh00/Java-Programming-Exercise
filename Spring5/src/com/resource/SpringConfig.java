package com.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Employee;
import com.bean.Subjects;

@Configuration
public class SpringConfig {
	
	//Creating multiple beans of Address
	@Bean
	public Address addr1()
	{
		Address add = new Address();
		add.setHno("H.123");
		add.setCity("Jaunpur");
		add.setState("UP");
		return add;
	}
	@Bean
	public Address addr2()
	{
		Address add = new Address();
		add.setHno("H.987");
		add.setCity("Madison Garden");
		add.setState("Los Angles");
		return add;
	}
	
	@Bean
	public Subjects subj()
	{
		Subjects sub = new Subjects();
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add(".Net");
		list.add("C++");
		sub.setSubjects(list);
		return sub;
	}
	
	@Bean
	public Employee empl()
	{
		Employee emp = new Employee();
		emp.setId(01);
		emp.setName("Dave");
		return emp;
	}

}
