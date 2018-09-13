package com.ts.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn= new ClassPathXmlApplicationContext("a.xml");
		TextEditior t=(TextEditior) conn.getBean("b");
		t.getSpellChecker();

	}

}
