package org.bishnu.springlearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;

public class SetterInjectionMain {

	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile.xml");
		Country countryObj=(Country) appContext.getBean("CountryBean");
		
		String countryName=countryObj.getCountryName();
		String capitalName=countryObj.getCapital().getCapitalName();
		System.out.println(capitalName+" is capital of "+countryName);

	}

}
