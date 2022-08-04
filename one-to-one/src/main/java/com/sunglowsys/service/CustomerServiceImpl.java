package com.sunglowsys.service;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.repository.CustomerRepository;
import com.sunglowsys.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
     CustomerRepository customerRepository = new CustomerRepositoryImpl ();

    @Override
    public Customer save(Customer customer) {
        customerRepository.save (customer);
        return customer;
    }

    @Override
    public Customer update(Customer customer, Long id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
