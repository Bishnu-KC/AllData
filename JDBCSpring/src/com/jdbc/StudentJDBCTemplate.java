package com.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJDBCTemplate implements StudentDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
	}
	
	//inserting
	public void create(String name, Integer age)
	{
		String SQL="insert into Student (name, age) values(?,?)";
		jdbcTemplateObject.update(SQL,name,age);
		System.out.println("Created Record Name= "+name+ " Age= "+age);
	}
	
	//List down the data
	public Student getStudent(Integer id)
	{
		String SQL="select * from Student where id=?";
		Student student=jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new StudentMapper());
		
		return student;
	}
	
	// list down the data from the database
	public List<Student> listStudents()
	{
		String SQL="select * from Student";
		List<Student> students=jdbcTemplateObject.query(SQL, new StudentMapper());
		return students;
	}
	
	//delete from database
	public void delete(Integer id)
	{
		String SQL="delete from Student where id=?";
		jdbcTemplateObject.update(SQL,id);
		System.out.println("Deleted Record with ID= "+id);
		return;
	}
	
	//update data in database
	public void update(Integer id, Integer age)
	{
		String SQL="update Student set age=? where id=?";
		jdbcTemplateObject.update(SQL,age,id);
		System.out.println("Updated Record with ID= "+id);
	}
}
