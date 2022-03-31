package com.example.app.controllers;

import com.example.app.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book books(){

        var book =new Book("Great Expectations","Charles Dickens");
        return book;
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        System.out.println("creating :" + book);
        book.setId(7L);
        return book;
    }
}
