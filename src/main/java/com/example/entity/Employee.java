package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(name="FirstName")
	private String empFirstName;
	@Column(name="LastName")
	private String empLastName;
	@Column(name="Designation")
	private String designation;
	@Column(name="Salary")
	private double salary;
	public static final int ORGANIZATIONCODE=1210350;
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getEmpId() {
		return empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public String getDesignation() {
		return designation;
	}
	public double getSalary() {
		return salary;
	}
	public static int getOrganizationcode() {
		return ORGANIZATIONCODE;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
