package com.paras.spring.springcore.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("dependencycheckconfig.xml");

		Prescription prescription = (Prescription) ctx.getBean("prescription");

		System.out.println(prescription);
		

	}

}
