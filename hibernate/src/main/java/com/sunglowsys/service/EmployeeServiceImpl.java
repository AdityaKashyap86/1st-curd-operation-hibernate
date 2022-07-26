package com.sunglowsys.service;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepository;
import com.sunglowsys.repository.EmployeeRepositoryImpl;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
    public static EmployeeRepository employeeRepository =new EmployeeRepositoryImpl ();


    @Override
    public Employee save(Employee employee) {
        employeeRepository.save (employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee, Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public Employee findByID(Long id) {
        return null;
    }

    @Override
    public Void delete() {
        return null;
    }
}
