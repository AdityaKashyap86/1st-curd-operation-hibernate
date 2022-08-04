
package com.sunglowsys.service;

import com.sunglowsys.domain.Books;

import java.util.List;

public interface BooksService {

    Books save(Books books);

    Books update(Books books, Long id);

    List<Books> findAll();

    Books findById(Long id);

    void delete(Long id);
}

