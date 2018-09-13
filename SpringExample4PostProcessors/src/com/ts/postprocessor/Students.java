package com.ts.postprocessor;

public class Students {
	
	private String studentName;

	public void getStudentName() {
		System.out.println("Name: "+studentName);
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void init()
	{
		System.out.println("Bean is going through init.");
	}
	
	public void destroy()
	{
		System.out.println("Bean will destroy now");
	}
	
	

}
