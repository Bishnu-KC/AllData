package org.spring.learning.main;

import org.spring.learning.config.ApplicationConfiguration;
import org.spring.learning.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringJavaConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		ApplicationContext appContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Country countryObj=(Country) appContext.getBean("countryObj");
		String countryName=countryObj.getCountryName();
		System.out.println("Country Name: "+countryName);
		

	}

}
