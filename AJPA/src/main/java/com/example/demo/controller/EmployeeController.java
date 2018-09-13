package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@RequestMapping(method=RequestMethod.GET, value="/employees")
	public List <Employee> getAll()
	{
		return service.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/employees/{id}")
	public Optional<Employee> getOne(@PathVariable int id)
	{
		return service.findOne(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/employees")
	public Employee addOne(@RequestBody Employee employee)
	{
		return service.addEmployee(employee);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
	public Employee deleteOne(@RequestBody Employee employee, @PathVariable int id)
	{
		return service.UpdateOne(employee,  id);
		
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
	public int deleteOne(@PathVariable int id)
	{
		return service.deleteOne(id);
	}

}
