package com.paras.spring.springcore;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
		
		Employee emp=(Employee) ctx.getBean("emp");
		
		System.out.println("Employee id: " + emp.getId());
		System.out.println("Employee name: " + emp.getName());
		
		
	}
}
