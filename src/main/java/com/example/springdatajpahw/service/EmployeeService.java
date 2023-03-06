package com.example.springdatajpahw.service;

import com.example.springdatajpahw.entity.Employee;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAll();

    Employee getById(int id);

    void add(Employee employee);

    void update(Employee employee);

    void removeById(int id);
}