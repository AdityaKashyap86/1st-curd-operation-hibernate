
package com.sunglowsys.repository;

import com.sunglowsys.domain.Books;

import java.util.List;

public interface BooksRepository {


    Books save(Books books);

    Books update(Books books, Long id);

    List<Books> findAll();

    Books findById(Long id);

    void delete(Long id);
}