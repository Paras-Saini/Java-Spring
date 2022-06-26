package com.paras.spring.springcore.constructorinjection;


public class Employee {

	private int id;
	private Address address;

	Employee(int id, Address address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}


	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, address=%s]", id, address);
	}

}
