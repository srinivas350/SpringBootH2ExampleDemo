package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@PostMapping("/insert")
	public ResponseEntity<Employee> insertEmployee(@RequestBody Employee emp)
	{
		Employee response=service.saveEmployee(emp);
		return new ResponseEntity<Employee>(response,HttpStatus.OK);
	}
	
	@GetMapping("/allEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		List<Employee> response=service.getAllEmployees();
		return new ResponseEntity<List<Employee>>(response,HttpStatus.OK);
	}
	
	@GetMapping("/findById/{empId}")
	public ResponseEntity<Optional<Employee>> findEmployee(@PathVariable("empId") int empId)
	{
		Optional<Employee> response=service.getEmployee(empId);
		return new ResponseEntity<Optional<Employee>>(response,HttpStatus.OK);
	}
	
	@GetMapping("/hello")
	public String sampleTest()
	{
		return "Hello User";
	}
	
	

}
