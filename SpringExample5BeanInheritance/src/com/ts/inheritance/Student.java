package com.ts.inheritance;

public class Student {
	
	private String studentName;
	private String studentAddress;
	
	public void getStudentName() {
		System.out.println("Name: "+studentName);
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void getStudentAddress() {
		System.out.println("Address: "+studentAddress);
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	

}
