package com.graphql.backend.services.impl;

import com.graphql.backend.entities.Book;
import com.graphql.backend.repositories.BookRepository;
import com.graphql.backend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Book create(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        System.out.println("Service Impl :" + bookRepository.findAll().toString());
        return this.bookRepository.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRepository.findById(bookId).orElseThrow(()->new RuntimeException("Book not found !!!!"));
    }
}
