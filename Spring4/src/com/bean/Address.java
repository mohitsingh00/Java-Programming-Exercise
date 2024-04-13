package com.bean;

public class Address {
	
	private String hno;
	private String city;
	private String state;
	
	public Address(String hno, String city, String state) {
		super();
		this.hno = hno;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "[House No.= " + hno + ", city= " + city + ", state= " + state + "]";
	}

}
