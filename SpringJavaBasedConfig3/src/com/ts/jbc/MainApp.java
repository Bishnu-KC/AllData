package com.ts.jbc;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn=new AnnotationConfigApplicationContext(StudentConfig.class);
		Student s=conn.getBean(Student.class);
		s.setName("Bishnu Jung K C");
		//s.getName();
		s.setId(1);
		System.out.print("Name: "+ s.getName());
		System.out.println("\t"+"ID: "+s.getId());
		

	}

}
