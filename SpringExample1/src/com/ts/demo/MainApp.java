package com.ts.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		Hello h=(Hello) conn.getBean("b");
		h.printHello();
	}

}
