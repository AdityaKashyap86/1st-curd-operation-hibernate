package com.sunglowsys.repository;

import com.sunglowsys.domain.Customer;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerRepositoryImpl implements  CustomerRepository{
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory ();


    @Override
    public Customer save(Customer customer) {
        Session session = sessionFactory.openSession ();
        Transaction transaction = session.beginTransaction ();
        Long id=(Long) session.save (customer);
        session.getTransaction ().commit ();
        session.close ();
        return customer ;
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
