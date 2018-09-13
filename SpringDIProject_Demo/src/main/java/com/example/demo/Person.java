package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class Person {
	String name;
	public Person()
	{
		super();
		System.out.println("Object Created");
	}
	public String getShow()
	{
		System.out.println("THis is method from person class");
		return "show";
	}

}
