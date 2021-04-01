package com.practicecode.springboot.springbootthymeleafcruddemo.service;

import com.practicecode.springboot.springbootthymeleafcruddemo.dao.EmployeeRepository;
import com.practicecode.springboot.springbootthymeleafcruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }


    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> results = employeeRepository.findById(theId);

        Employee theEmployee = null;

        if (results.isPresent()) {
            theEmployee = results.get();
        } else {
            throw new RuntimeException("Did not found Employee of Id: " + theId);
        }

        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
