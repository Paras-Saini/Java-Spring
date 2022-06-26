package com.paras.spring.springcore.constructorinjection.ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("constructorinjectionambiguityconfig.xml");
		
		Addition addition=(Addition) context.getBean("addition");
		
		System.out.println(addition);
		

	}

}
