package com.LearnSpring.cruddemo.rest;

import com.LearnSpring.cruddemo.entity.Employee;
import com.LearnSpring.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api")
public class EmployeeRestController {

    private EmployeeService employeeService;

    @Autowired
    // ovdje radim konstruktor injection za Service
    public EmployeeRestController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/employees")
    // expose "/employees" and return a list employees  "http://localhost:8080/api/employees"
    public List<Employee> findAll(){
        return employeeService.findAll();
    }
}
