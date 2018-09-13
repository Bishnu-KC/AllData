package org.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext beanFactory = new ClassPathXmlApplicationContext("a.xml");
		 
         HelloWorld myBean = (HelloWorld) beanFactory.getBean("HelloWorldBean");
         myBean.printHello();

	}

}
