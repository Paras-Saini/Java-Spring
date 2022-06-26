package com.paras.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSet {

	public static void main(String args[]) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("propertyconfig.xml");

		CountriesAndLanguages countryAndLangs = (CountriesAndLanguages) ctx.getBean("countryAndLanguages");
		
		System.out.println(countryAndLangs.toString());
		

	}

}
