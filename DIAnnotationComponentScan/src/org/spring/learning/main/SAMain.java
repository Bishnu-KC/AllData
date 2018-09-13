package org.spring.learning.main;

import org.spring.learning.componentscan.Country;
import org.spring.learning.controller.CountryController;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SAMain {

	public static void main(String[] args)  throws NoSuchBeanDefinitionException{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("a.xml");
		  CountryController controller = (CountryController) context.getBean("countryController");
		  Country country = controller.createNewCountry();
		  System.out.println("Country Name : " + country.getCountryName());
		  System.out.println("Country's Population : " + country.getPopulation());

	}

}
