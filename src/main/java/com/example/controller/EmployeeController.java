package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.AuthRequest;
import com.example.entity.Employee;
import com.example.entity.InputEmployee;
import com.example.jwt.api.util.JwtUtil;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	public EmployeeService service;
	
	@Autowired
    private JwtUtil jwtUtil;
	
    @Autowired
    private AuthenticationManager authenticationManager;
	
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
	
	
	@GetMapping("/greet")
	public String sayGreet(@RequestParam("greet") String msg)
	{
		return "Hello "+msg;
	}
	
	@PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getUserName());
    }
		
}
