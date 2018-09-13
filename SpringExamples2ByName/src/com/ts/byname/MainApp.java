package com.ts.byname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		TextEditor te=(TextEditor) conn.getBean("b");
		te.spellCheck();

	}

}
