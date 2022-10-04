package com.example.spring.springboot.spring_data_jpa.dao;

import com.example.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
