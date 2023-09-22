package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.entity.InputEmployee;
import com.example.repositories.EmployeeRepostiory;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepostiory repo;
	
	@Override
	public InputEmployee saveEmployee(InputEmployee emp) {
		Employee emp1=new Employee();
		emp1.setEmpFirstName(emp.getEmpFirstName());
		emp1.setEmpLastName(emp.getEmpLastName());
		emp1.setDesignation(emp.getDesignation());
		emp1.setSalary(emp.getSalary());
		emp1=repo.save(emp1);
//		emp.setEmpId(emp1.getEmpId());
//		emp.setEmpFirstName(emp1.getEmpFirstName());
//		emp.setEmpLastName(emp1.getEmpLastName());
//		emp.setDesignation(emp1.getDesignation());
//		emp.setSalary(emp1.getSalary());
		return emp;	
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> empList;
		empList=repo.findAll();
		return empList;
	}

	@Override
	public Optional<Employee> getEmployee(int empId) {
		Optional<Employee> emp;
		emp=repo.findById(empId);
		return emp;
	}

}
