
package com.sunglowsys.service;

import com.sunglowsys.domain.Books;
import com.sunglowsys.repository.BooksRepository;
import com.sunglowsys.repository.BooksRepositoryImpl;

import java.util.List;

public class BooksServiceImpl implements BooksService{
    private BooksRepository booksRepository = new  BooksRepositoryImpl();

    @Override
    public Books save(Books books) {
        booksRepository.save (books);
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

