package com.employee.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

@Repository
public class EmployeeRespository {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public List<Employee> findAll()
	{
		return jdbc.query("SELECT * FROM EMPLOYEE", new BeanPropertyRowMapper(Employee.class));
	}
	/*
	public List<Employee> findAll()
	{
		return jdbc.query("select * from employee", new EmployeeRowMapper());
	}
	*/
	
	public Employee fineOne(int empId)
	{
		return (Employee) jdbc.queryForObject("select *from employee where empId=?", new Object[] {empId}, new BeanPropertyRowMapper(Employee.class));
	}
	
	public int deleteOne(int empId)
	{
		return jdbc.update("delete from employee where empId=?", new Object[] {empId});
	}
	
	public Object addOne(Employee employee)
	{
		return jdbc.update("insert into employee(empId,firstName,lastName,deptId)"+"values(?,?,?,?)",new Object[] {employee.getEmpId(),employee.getFristName(),employee.getLastName(),employee.getDeptId()});
	}
	
	public int UpdateOne(Employee employee)
	{
		return jdbc.update(
				"  update person  "+"set firstName=?, lastName=?, deptId=?"+" where empId=?  ", new Object[] {employee.getFristName(),employee.getLastName(),employee.getDeptId(),employee.getEmpId()
						
				}
				
				);
	}
	
}
class EmployeeRowMapper implements RowMapper<Employee>
	{
		@Override
		public Employee mapRow(ResultSet rs, int arg1) throws  SQLException
		{
			Employee employee=new Employee();
			employee.setEmpId(rs.getInt("empId"));
			employee.setFristName(rs.getString("firstName"));
			employee.setLastName(rs.getString("lastName"));
			employee.setDeptId(rs.getInt("deptId"));
			return employee;
			
		}
	}

