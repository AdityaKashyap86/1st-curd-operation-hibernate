package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Customer;
import com.sunglowsys.service.CustomerServiceImpl;

public class CreateCustomer {
    public static void main(String[] args) {

        Address address = new Address("mirehchi","etah","207125","UP");
        Customer customer = new Customer("Amit","Kasap","AmitKyap@gmail.com","878798534",address);
        new CustomerServiceImpl().save(customer);

    }
}
