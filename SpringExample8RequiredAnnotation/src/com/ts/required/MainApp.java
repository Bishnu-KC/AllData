package com.ts.required;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		Student s=(Student) conn.getBean("b");
		
		System.out.println("Name: "+s.getName());
		System.out.println("Age: "+s.getAge());

	}

}
