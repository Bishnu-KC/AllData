package com.ts.jbc;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;


@Configuration
public class EmployeeConfig {
	
	@Bean
	public Employee getInfo()
	{
		return new Employee();
	}

}
