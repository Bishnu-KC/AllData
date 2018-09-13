package com.ts.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("a.xml");
		Students s=(Students) con.getBean("b");
		
		s.setStudentName("Bishnu Jung K C");
		s.getStudentName();
		
		Students s1=(Students) con.getBean("b");
		s.getStudentName();

	}

}
