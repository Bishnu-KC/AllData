package org.spring.learning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.ClassPathResource;

public class SpringHelloWorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext beanFactory = new ClassPathXmlApplicationContext("SpringHelloWorld.xml");
		 
         SpringHelloWorld myBean = (SpringHelloWorld) beanFactory.getBean("SpringHelloWorldBean");
         myBean.printHello();

	}

}
