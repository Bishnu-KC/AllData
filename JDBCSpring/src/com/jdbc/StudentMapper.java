package com.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{
	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Student std=new Student();
		std.setId(rs.getInt("id"));
		std.setName(rs.getString("name"));
		std.setAge(rs.getInt("age"));
		return std;
	}

}
