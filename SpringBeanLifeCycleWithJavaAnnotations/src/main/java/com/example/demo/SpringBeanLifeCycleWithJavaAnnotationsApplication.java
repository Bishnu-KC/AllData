package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.config.AppConfig;
import com.example.model.Employee;
import com.example.model.MailServices;

//@SpringBootApplication
public class SpringBeanLifeCycleWithJavaAnnotationsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBeanLifeCycleWithJavaAnnotationsApplication.class, args);
		AnnotationConfigApplicationContext contextWithJava= new AnnotationConfigApplicationContext(AppConfig.class);
		
		//send mail1
		MailServices m1=contextWithJava.getBean(MailServices.class);
		m1.send("SpringBean@example.com");
		
		
		//send mail 2
		MailServices m2=contextWithJava.getBean(MailServices.class);
		m2.send("javasession@example.com");
		contextWithJava.close();
		
		ConfigurableApplicationContext contextWithSpring=new ClassPathXmlApplicationContext("Bean.xml");
		System.out.println("Spring Bean started");
		Employee e1=(Employee) contextWithSpring.getBean("employeeBean");
		System.out.println(e1.toString());
		contextWithSpring.close();
		
	}
}
