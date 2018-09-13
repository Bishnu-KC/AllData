package com.ts.initdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		Students s=(Students) conn.getBean("b");
		
		s.setStudentName("Bishnu Jung K C");
		s.setStudentId(1);
		s.getStudentName();
		s.getStudentId();
		
		((AbstractApplicationContext) conn).registerShutdownHook();
		
	
		Students s1=(Students) conn.getBean("c");
		s1.getStudentName();
		s1.getStudentId();
		
		

	}

}
