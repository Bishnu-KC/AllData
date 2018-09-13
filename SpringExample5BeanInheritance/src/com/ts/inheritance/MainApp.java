package com.ts.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext conn=new ClassPathXmlApplicationContext("a.xml");
		
		Student s=(Student) conn.getBean("b");
		s.getStudentName();
		s.getStudentAddress();
		
		StudentInfo s1=(StudentInfo) conn.getBean("c");
		s1.getStudentName();
		s1.getStudentAddress();
		s1.getStudentGender();

	}

}
