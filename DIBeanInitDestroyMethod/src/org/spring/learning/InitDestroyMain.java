package org.spring.learning;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitDestroyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext appContext=new ClassPathXmlApplicationContext("a.xml");
		
		Country countryObj=(Country) appContext.getBean("country");
		countryObj.setCountryName("Nepal");
		System.out.println("Country Name: "+countryObj.getCountryName());
		appContext.registerShutdownHook();

	}

}
