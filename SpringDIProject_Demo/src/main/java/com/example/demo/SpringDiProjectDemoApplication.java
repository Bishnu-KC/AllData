package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Account;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.model","com.example.demo"})
public class SpringDiProjectDemoApplication {

	public static void main(String[] args) {
		ApplicationContext cont= SpringApplication.run(SpringDiProjectDemoApplication.class, args);
		Person p1=(Person) cont.getBean(Person.class);
		//Person p1=(Person) cont.getBean("person");// beans are lower case of class name
		//p1.getShow();
		
		
		Employee emp=cont.getBean(Employee.class);
		emp.setName("Mike");
		System.out.println("Employee name: "+emp.getName());
		Account account =(Account)cont.getBean(Account.class);
		
	}
}
