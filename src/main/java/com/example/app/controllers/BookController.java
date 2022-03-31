package com.example.app.controllers;

import com.example.app.entities.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/books")
    public Book books(){

        var book =new Book("Great Expectations","Charles Dickens");
        return book;
    }
}
