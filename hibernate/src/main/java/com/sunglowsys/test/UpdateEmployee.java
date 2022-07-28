package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class UpdateEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee ();
        employee.setFirstName ("Amit Kashyap");
        new EmployeeServiceImpl ().update (employee,1l);
    }
}
