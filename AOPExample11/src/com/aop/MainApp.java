package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		
		Employee e=(Employee) conn.getBean("b");
		e.getName();
		e.getId();
		e.printThrowException();
	

	}

}
