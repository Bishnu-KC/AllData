package com.ts.initdestroy;

public class Students {
	
	private String studentName;
	private int studentId;
	
	
	public void getStudentName() {
		System.out.println("Name: "+studentName);
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public void getStudentId() {
		System.out.println("ID: "+studentId);
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public void init()
	{
		System.out.println("Bean is going through init.");
	}
	
	public void destroy()
	{
		System.out.println("Bean will destroy now.");
	}

}
