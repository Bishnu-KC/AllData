package com.spring.tp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("a.xml");
		HelloWorld obj=(HelloWorld) con.getBean("helloWorld");
		obj.getMessage();

	}

}
