package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	public Employee()
	{
		super();
		System.out.println("Added Employee");
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}

}
