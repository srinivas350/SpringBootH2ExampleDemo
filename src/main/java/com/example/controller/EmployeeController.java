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
import com.example.entity.InputEmployee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@PostMapping("/insert")
	public ResponseEntity<InputEmployee> insertEmployee(@RequestBody InputEmployee employee)
	{
		System.out.println(employee.getEmpFirstName());
		return new ResponseEntity<>(service.saveEmployee(employee),HttpStatus.OK);
	}
	
	@GetMapping("/allEmployees")
	public ResponseEntity<List<Employee>> getAllEmployees()
	{
		return new ResponseEntity<>(service.getAllEmployees(),HttpStatus.OK);
	}
	
	@GetMapping("/findById/{empId}")
	public ResponseEntity<Optional<Employee>> findEmployee(@PathVariable("empId") int empId)
	{
		return new ResponseEntity<>(service.getEmployee(empId),HttpStatus.OK);
	}
		
}
