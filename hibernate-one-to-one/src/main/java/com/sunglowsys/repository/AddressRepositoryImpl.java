package com.sunglowsys.repository;

import com.sunglowsys.domain.Address;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class AddressRepositoryImpl implements AddressRepository{
private  SessionFactory sessionFactory = HibernateUtil.getSessionFactory ();

    @Override
    public Address save(Address address) {
        Session session = sessionFactory.openSession ();
        Transaction transaction = session.beginTransaction ();
        session.save (address);
        session.getTransaction ().commit ();
        session.close ();
        System.out.println ("---Created---");
        return address;
    }

    @Override
    public Address update(Address address, Long id) {
        return null;
    }

    @Override
    public List<Address> findAll() {
        return null;
    }

    @Override
    public Address findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
