package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;
import com.sunglowsys.service.EmployeeServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {


    public static void main(String[] args) {
        EmployeeService  employeeService = new EmployeeServiceImpl ();

        Employee employee = new Employee ("Aditya","Kashyap","mirehchi","Adi@gmail.com",8449308155l);
        employeeService.save (employee);
    }
}
