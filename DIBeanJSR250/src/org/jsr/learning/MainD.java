package org.jsr.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("a.xml");
		 
        Country countryObj = (Country) appContext.getBean("CountryBean");
        String countryName=countryObj.getCountryName();
        Capital capital=countryObj.getCapital();
        String capitalName=capital.getCapitaName();
        System.out.println(capitalName+" is capital of "+countryName);

	}

}
