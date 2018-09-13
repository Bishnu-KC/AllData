package com.ts.quali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		
		Profile p=(Profile) conn.getBean("b");
		
		p.printAge();
		p.printName();

	}

}
