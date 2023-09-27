package com.LearnSpring.cruddemo.dao;

import com.LearnSpring.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List <Employee> findAll();
}
