package com.LearnSpring.cruddemo.service;

import com.LearnSpring.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    // lista tipa Employee
    List <Employee> findAll();
}
