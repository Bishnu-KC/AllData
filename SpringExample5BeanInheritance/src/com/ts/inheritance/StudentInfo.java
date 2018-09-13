package com.ts.inheritance;

public class StudentInfo {
	
	private String studentName;
	private String studentAddress;
	private String studentGender;
	
	public void getStudentName() {
		System.out.println("Student Info- Name: "+studentName);
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void getStudentAddress() {
		System.out.println("Student Info- Address: "+studentAddress);
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public void getStudentGender() {
		System.out.println("Student Info- Gender: "+studentGender);
	}
	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}
	

	
}
