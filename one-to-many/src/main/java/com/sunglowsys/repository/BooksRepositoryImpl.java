
package com.sunglowsys.repository;

import com.sunglowsys.domain.Books;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.security.PrivateKey;
import java.util.List;

public class BooksRepositoryImpl implements BooksRepository{
    private SessionFactory  sessionFactory = HibernateUtil.getSessionFactory ();

    @Override
    public Books save(Books books) {
        Session session = sessionFactory.openSession ();
        Transaction transaction = session.beginTransaction ();
        session.save (books);
        session.getTransaction ().commit ();
        session.close ();
        return null;
    }

    @Override
    public Books update(Books books, Long id) {
        return null;
    }

    @Override
    public List<Books> findAll() {
        return null;
    }

    @Override
    public Books findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}

