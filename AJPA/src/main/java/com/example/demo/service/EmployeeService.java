package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repo;
	
	public List<Employee> findAll()
	{
		List<Employee> employees=new ArrayList<>();
		repo.findAll().forEach(employees::add);
		return employees;
	}
	
	public Optional<Employee> findOne(int id)
	{
		return repo.findById(id);
	}
	
	public Employee addEmployee(Employee employee)
	{
		repo.save(employee);
		return employee;
	}
	
	public Employee UpdateOne(Employee employee, int id)
	{
		return repo.save(employee);
	}
	
	public int deleteOne(int id)
	{
		repo.deleteById(id);
		return id;
	}

}
