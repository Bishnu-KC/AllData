package com.jdbc;


import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext conn = new ClassPathXmlApplicationContext("a.xml");
		
		StudentJDBCTemplate stdjdbctemp=(StudentJDBCTemplate) conn.getBean("b");
		
		System.out.println("-----Records Creation-----");
		stdjdbctemp.create("Bishnu", 11);
		stdjdbctemp.create("Unhsib", 2);
		stdjdbctemp.create("BishnuG", 15);
		
		
		System.out.println("---Listing Multiple Records---");
		List<Student> students=stdjdbctemp.listStudents();
		for(Student record:students)
		{
			System.out.println("ID : "+record.getId());
			System.out.println(", name : "+record.getName());
			System.out.println(", Age : "+record.getAge());
		}
		
		System.out.println("---Updating Record with ID=2 ---");
		stdjdbctemp.update(2, 20);
		
		System.out.println("---Listing Record with ID=2 ---");
		Student stds=stdjdbctemp.getStudent(2);
		System.out.println("ID : "+stds.getId());
		System.out.println(", name : "+stds.getName());
		System.out.println(", Age : "+stds.getAge());
	}

}
