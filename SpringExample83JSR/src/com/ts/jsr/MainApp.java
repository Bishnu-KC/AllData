package com.ts.jsr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		
		HelloWorld obj=(HelloWorld) conn.getBean("b");
		obj.getMessage();
		conn.registerShutdownHook();

	}

}
