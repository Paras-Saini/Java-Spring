package com.paras.spring.springcore.innerbean;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String args[]) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("innerbeanconfig.xml");

		Employee emp = (Employee) ctx.getBean("emp");

		System.out.println(emp.toString());

		Employee emp2 = (Employee) ctx.getBean("emp");

		System.out.println(emp2.toString());

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());

	}

}
