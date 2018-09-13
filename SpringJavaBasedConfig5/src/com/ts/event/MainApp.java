package com.ts.event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("a.xml");
		
		// Let us raise a start event
		
		context.start();
		
		HelloWorld obj=(HelloWorld) context.getBean("b");
		obj.getMessage();
		
		//let us raise a stop event
		
		context.stop();

	}

}
