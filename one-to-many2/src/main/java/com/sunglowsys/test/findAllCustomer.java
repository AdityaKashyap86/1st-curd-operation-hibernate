package com.sunglowsys.test;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.domain.Order;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class findAllCustomer {
    public static void main(String[] args) {
        List<Customer>  customerList = new CustomerRepositoryImpl ().findAll ();
        for (Customer  customer : customerList) {
            System.out.println ("cus_ID =  "+customer.getId ()+"\ncus_firstName = "+customer.getFirstName ()+"\ncus_lastName =  "+customer.getLastName ()+"\ncus_mobile  "+customer.getMobile ()+"\ncus_email  "+customer.getEmail ());

            System.out.println ("Order details-----");

            List<Order> orders = customer.getOrders ();
            for (Order  order : orders) {
                System.out.println (order.getAmount ()+""+order.getAmount ());
            }

        }

    }
}
