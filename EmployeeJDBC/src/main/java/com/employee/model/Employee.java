package com.employee.model;


//a java pojo class
public class Employee {
	private int empId;
	private String fristName;
	private String lastName;
	private int deptId;
	
	//constructor without parameter
	public Employee()
	{
		super();
	}
	
	//constructor with parameter
	public Employee(int empId, String fristName, String lastName, int deptId) {
		super();
		this.empId = empId;
		this.fristName = fristName;
		this.lastName = lastName;
		this.deptId = deptId;
	}
	
	// getter and setter methods

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	//override toString methods

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fristName=" + fristName + ", lastName=" + lastName + ", deptId=" + deptId
				+ "]";
	}
	
	
	
	

}
