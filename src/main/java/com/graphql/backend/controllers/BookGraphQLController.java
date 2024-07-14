package com.graphql.backend.controllers;

import com.graphql.backend.entities.Book;
import com.graphql.backend.services.BookService;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookGraphQLController {

    @Autowired
    private BookService bookService;

    //Fetch All Books
    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAll();
    }

    //FEtch Book By ID
    @QueryMapping("getBook")
    public Book getBookById(@Argument int bookId){
        return this.bookService.get(bookId);
    }

    //Create a book
    @MutationMapping("createBook")
    public Book createBook(@Argument BookInput book){
        Book newBook = new Book();
//        book.setTitle(bookInput.getTitle());
//        book.setPrice(bookInput.getPrice());
//        book.setPages(bookInput.getPages());
//        book.setAuthor(bookInput.getAuthor());
//        book.setDesc(bookInput.getDesc());
        BeanUtils.copyProperties(book,newBook);
        return this.bookService.create(newBook);
    }

}

@Data
class BookInput{
    private String title;
    private String desc;
    private int pages;
    private double price;
    private String author;
}
