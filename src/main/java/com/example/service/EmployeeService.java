package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.entity.InputEmployee;

@Service
public interface EmployeeService {
	
	public InputEmployee saveEmployee(InputEmployee emp);
	public List<Employee> getAllEmployees();
	public Optional<Employee> getEmployee(int empId);

}
