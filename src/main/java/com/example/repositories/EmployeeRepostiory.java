package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;
@Repository
public interface EmployeeRepostiory extends JpaRepository<Employee , Integer> {

}
