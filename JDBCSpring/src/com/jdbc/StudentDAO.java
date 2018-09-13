package com.jdbc;

import java.util.List;

import javax.sql.DataSource;


public interface StudentDAO {
	
	// this is the method to be used to initialize database resource ie. connection
	public void setDataSource(DataSource ds);
	
	//this is the method to be used to create a record in the student table
	public void create(String name, Integer age);
	
	//this is the method to be used to list down a record from the student table
	//corresponding to a passed student ID
	public Student getStudent(Integer id);
	
	//this is the method to be used to list down all the records from the student table
	public List<Student> listStudents();
	
	//This is the method to be used to delete  a record from the student table
	//corresponding to a passed student id.
	public void delete(Integer id);
	
	//This is the method to be used to update a record into the student table
	public void update(Integer id, Integer age);

}
