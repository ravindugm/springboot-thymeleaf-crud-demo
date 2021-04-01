package com.practicecode.springboot.springbootthymeleafcruddemo.service;

import com.practicecode.springboot.springbootthymeleafcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
