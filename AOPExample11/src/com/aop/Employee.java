package com.aop;

public class Employee {
	
	private Integer id;
	private String name;
	public Integer getId() {
		
		System.out.println("ID: "+id);
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		System.out.println("Name: "+name);
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printThrowException()
	{
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}

}
