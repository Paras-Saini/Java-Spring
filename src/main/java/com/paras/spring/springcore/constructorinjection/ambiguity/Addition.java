package com.paras.spring.springcore.constructorinjection.ambiguity;

public class Addition {
	
	

	
	/*Addition(double a,double b){
		System.out.println("Inside constructor Double");
	}*/
	
	Addition(int a,double b){
		System.out.println("Inside the constructor");
		System.out.println(a+ " " + b);
	}
}
