package com.graphql.backend.services;

import com.graphql.backend.entities.Book;

import java.util.List;

public interface BookService {

    //Create
    Book create(Book book);

    //get all
    List<Book> getAll();

    //get single book
    Book get(int bookId);
}
