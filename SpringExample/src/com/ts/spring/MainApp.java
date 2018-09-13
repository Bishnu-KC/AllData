package com.ts.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("a.xml");
		HelloWorld obj=(HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

	}

}
