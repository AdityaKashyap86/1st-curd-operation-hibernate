package com.sunglowsys.test;

import com.sunglowsys.domain.Employee;
import com.sunglowsys.service.EmployeeServiceImpl;

public class DeleteEmployee {
    public static void main(String[] args) {
        new EmployeeServiceImpl ().delete (3l);
    }
}
