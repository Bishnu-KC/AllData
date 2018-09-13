package com.ts.jbc;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class StudentConfig {
	
	@Bean
	
	public Student getInfo()
	{
		return new Student();
	}

}
