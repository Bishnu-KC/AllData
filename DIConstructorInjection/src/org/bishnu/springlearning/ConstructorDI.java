package org.bishnu.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorDI {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("NewFile.xml");
		Country countryObj=(Country) appContext.getBean("CountryBean");
		String countryName=countryObj.getCountryName();
		String capitalName=countryObj.getCapital().getCapitalName();
		
		System.out.println(capitalName+" is a capital of "+countryName);
		

	}

}
