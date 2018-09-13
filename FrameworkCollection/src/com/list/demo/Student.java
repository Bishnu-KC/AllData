package com.list.demo;

public class Student {
	private String stuName;
	private int rollNo;
	private int stuAge;
	public Student(String stuName, int rollNo, int stuAge) {
		super();
		this.stuName = stuName;
		this.rollNo = rollNo;
		this.stuAge = stuAge;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", rollNo=" + rollNo + ", stuAge=" + stuAge + "]";
	}
	
	
	

}
