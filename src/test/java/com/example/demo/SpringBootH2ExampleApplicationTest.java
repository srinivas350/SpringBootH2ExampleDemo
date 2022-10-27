//package com.example.demo;
//
//
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.example.entity.Employee;
//import com.example.repositories.EmployeeRepostiory;
//
//
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SpringBootH2ExampleApplicationTest {
//
//
//
//   @Autowired
//    EmployeeRepostiory empRepo;
//
//
//
//   public SpringBootH2ExampleApplicationTest()
//    {
//        
//    }
//    @Test
//    public void testCreate() {
//        Employee emp = new Employee();
//        emp.setEmpId(1);
//        emp.setEmpFirstName("Swamy");
//        emp.setEmpLastName("Sanaka");
//        emp.setDesignation("Admin");
//        emp.setSalary(85000);
//        empRepo.save(emp);
////        Employee emp2 = new Employee();
////        emp2.setEmpId(1);
////        emp2.setEmpFirstName("Srinivas");
////        emp2.setEmpLastName("SNK");
////        emp2.setDesignation("Developer");
////        emp2.setSalary(95000);
////        empRepo.save(emp2);
//        assertNotNull(empRepo.findById(1).get());
//    }
//
//
//
//   @SuppressWarnings("unchecked")
//    @Test
//    public void testReadAll() {
//        Employee emp = new Employee();
//        emp.setEmpId(1);
//        emp.setEmpFirstName("Swamy");
//        emp.setEmpLastName("Sanaka");
//        emp.setDesignation("Admin");
//        emp.setSalary(85000);
//        empRepo.save(emp);
//        List list = empRepo.findAll();
//        assertThat(list).size().isGreaterThan(0);
//    }
//
//
//
//}