package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.service.CustomerService;
import com.sunglowsys.service.CustomerServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CreateCustomer {
    public static void main(String[] args) {

        List<Order> orders = new ArrayList<> ();
        Order order = new Order (23.34,"22");
        Order order1 = new Order (54.12,"30");
        orders.add (order);
        orders.add (order1);
        Customer customer = new Customer ("Mohan","Kumar","MohanKumar@gmail.com","12256555",orders);
       CustomerService customerService = (CustomerService) new CustomerServiceImpl ().save (customer);
    }
}
