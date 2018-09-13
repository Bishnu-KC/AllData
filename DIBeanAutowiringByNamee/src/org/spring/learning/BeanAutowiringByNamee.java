package org.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiringByNamee {
	public static void main(String args[])
	{
		ApplicationContext appContext=new ClassPathXmlApplicationContext("a.xml");
		
		Country countryObj=(Country) appContext.getBean("country");
		
		String countryName=countryObj.getCountryName();
		 String capitalName=countryObj.getCapitalObj().getCapitalName();
		System.out.println(capitalName+" is capita of "+countryName+" Mero Desh Nepal.");
	}

}
