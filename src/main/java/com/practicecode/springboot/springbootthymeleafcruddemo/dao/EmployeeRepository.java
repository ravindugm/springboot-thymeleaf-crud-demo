package com.practicecode.springboot.springbootthymeleafcruddemo.dao;

import com.practicecode.springboot.springbootthymeleafcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
