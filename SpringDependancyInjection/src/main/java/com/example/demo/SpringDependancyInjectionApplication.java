package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.controller.ConstructorInjectedController;
import com.example.controller.ConstructorInjectedControllerTest;
import com.example.controller.PropertyInjectedController;
import com.example.controller.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = { "com.example.controller", "com.example.service" })
public class SpringDependancyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDependancyInjectionApplication.class, args);

		ConstructorInjectedController cont = (ConstructorInjectedController) context
				.getBean("constructorInjectedController");
		cont.booking();
	

		SetterInjectedController set = context.getBean(SetterInjectedController.class);
		set.booking();
		PropertyInjectedController prop = context.getBean(PropertyInjectedController.class);
		prop.booking();

	}
}
