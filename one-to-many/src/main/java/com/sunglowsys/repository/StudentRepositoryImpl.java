package com.sunglowsys.repository;

import com.sunglowsys.domain.Student;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class StudentRepositoryImpl  implements  StudentRepository{
    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory ();

    @Override
    public Student save(Student student) {
     Session  session = sessionFactory.openSession ();
     Transaction transaction = session.beginTransaction ();
     session.save (student);
     session.getTransaction ().commit ();
     session.close ();
     return student;
    }

    @Override
    public Student update(Student student, Long id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
