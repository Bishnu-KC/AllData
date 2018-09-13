package com.ts.jbc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;


@Configuration
public class HelloWorldConfig {
	
	@Bean
	public HelloWorld helloWorld()
	{
		return new HelloWorld();
	}


}
