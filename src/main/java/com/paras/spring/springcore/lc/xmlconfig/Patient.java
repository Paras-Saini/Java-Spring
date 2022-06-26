package com.paras.spring.springcore.lc.xmlconfig;

public class Patient {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Inside the setter method");
		this.id = id;
	}

	public void hi() {
		System.out.println("Inside hi method");
	}

	public void bye() {
		System.out.println("Inisde bye method");
	}

	@Override
	public String toString() {
		return String.format("Patient [id=%s]", id);
	}

}
