package com.paras.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("setconfig.xml");

		CarDealer cardealer = (CarDealer) ctx.getBean("carDealer");
		
		System.out.println(cardealer.getName());
		System.out.println(cardealer.getModels());
		

	}

}
