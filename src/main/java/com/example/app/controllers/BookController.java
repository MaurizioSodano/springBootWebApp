package com.example.app.controllers;

import com.example.app.entities.Book;
import com.example.app.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> books() {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") Long id) {
        return bookService.getBook(id);
    }

    @PostMapping("/books")
    public Book createBook(@RequestBody Book book) {
        bookService.saveBook(book);
        return null;
    }
}
