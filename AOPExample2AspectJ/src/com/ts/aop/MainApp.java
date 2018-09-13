package com.ts.aop;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext conn= new ClassPathXmlApplicationContext("a.xml");
		Student s=(Student) conn.getBean("bjk");
		s.getName();
		s.getAge();
		s.printThrowException();

	}

}
