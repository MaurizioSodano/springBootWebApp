package com.example.app.controllers;

import com.example.app.entities.Book;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Book> books(){

        var book1 =new Book("Great Expectations","Charles Dickens");
        var book2 =new Book("Great Expectations","Charles Dickens");
        var books = Arrays.asList(book1,book2);
        return books;
    }
    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") Long id){
        var book =new Book("Great Expectations","Charles Dickens");
        book.setId(id);
        return book;
    }
    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        System.out.println("creating :" + book);
        book.setId(7L);
        return book;
    }
}
