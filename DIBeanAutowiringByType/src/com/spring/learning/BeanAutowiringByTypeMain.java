package com.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAutowiringByTypeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new ClassPathXmlApplicationContext("a.xml");
        Country countryObj = (Country) appContext.getBean("country");
        String countryName=countryObj.getCountryName();
        String capitalName=countryObj.getCapitalObj().getCapitalName();
        System.out.println(capitalName+" is capital of "+countryName);

	}

}
