package org.spring.main;

import org.spring.config.ApplicationConfig;
import org.spring.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigMain {
	public static void main(String args[])
	{
		 @SuppressWarnings("resource")
		  ApplicationContext appContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		  Country countryObj = (Country) appContext.getBean("countryObj");
		  String countryName=countryObj.getCountryName();
		  
		  System.out.println("Country name: "+ countryName);
	}

}
