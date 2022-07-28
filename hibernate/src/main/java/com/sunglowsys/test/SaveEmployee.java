package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeService;
import com.sunglowsys.service.EmployeeServiceImpl;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SaveEmployee {
    public static void main(String[] args) {
        EmployeeService  employeeService = new EmployeeServiceImpl ();

        Employee employee = new Employee ("Narendra","kumar","Mirehchi","Narendrasingh@gmail.com",8878756757l);
        employeeService.save (employee);
    }
}
