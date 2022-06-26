package com.paras.spring.springcore.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String args[]) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("interfaceconfig.xml");

		Patient patient = (Patient) ctx.getBean("patient");

		System.out.println(patient.toString());
		
		ctx.registerShutdownHook();

	}

}
