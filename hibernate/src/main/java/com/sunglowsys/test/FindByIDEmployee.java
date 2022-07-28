package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.repository.EmployeeRepositoryImpl;

public class FindByIDEmployee {
    public static void main(String[] args) {
        Employee employee = new EmployeeRepositoryImpl ().findById (3L);
        System.out.println (employee);
    }
}
