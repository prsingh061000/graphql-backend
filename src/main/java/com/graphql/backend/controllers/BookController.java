package com.graphql.backend.controllers;

import com.graphql.backend.entities.Book;
import com.graphql.backend.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    //Create a book
    @PostMapping
    public Book createBook(@RequestBody Book book){
        return this.bookService.create(book);
    }

    //Get aLl books
    @GetMapping
    public List<Book> getAllBooks(){
        List<Book> books = this.bookService.getAll();
        System.out.println(books.toString());
        return this.bookService.getAll();
    }

    //Get Book By ID
    @GetMapping("/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        return this.bookService.get(bookId);
    }

}
