package com.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	//@Autowired
	private Address address;

	//@Autowired
	public Employee(Address address) {
		this.address = address;
		System.out.println("using constructor");
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setAddress");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
}
