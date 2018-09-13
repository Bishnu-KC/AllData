package com.a.spring.learning.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("a.xml");
		
		Country countryObj=(Country) appContext.getBean("country");
		countryObj.setCountryName("Nepal");
		System.out.println("Country Name: "+countryObj.getCountryName());
		
		//getBean called second time
		Country countryObj1=(Country) appContext.getBean("country");
		countryObj1.setCountryName("Switzerland");
		System.out.println("Country Name: "+countryObj1.getCountryName());


	}

}
