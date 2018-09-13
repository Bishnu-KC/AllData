package com.ts.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("a.xml");

	      Students obj = (Students) context.getBean("b");
	      obj.getStudentName();
	      ((AbstractApplicationContext) context).registerShutdownHook();

	}

}
