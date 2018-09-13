package com.ts.jbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import java.util.*;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext conn=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee e=conn.getBean(Employee.class);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the employee information.");
		System.out.println(".................................");
		System.out.println("Enter Name:");
		e.setName(s.nextLine());
		System.out.println("Enter ID:");
		e.setId(s.nextInt());
		System.out.println("Enter Department:");
		e.setName(s.nextLine());
		System.out.println(".................................");
		System.out.println("Name: "+e.getName()+"\n"+"ID: "+e.getId()+"\n"+"Department:"+e.getDepartment());
		
		

	}

}
