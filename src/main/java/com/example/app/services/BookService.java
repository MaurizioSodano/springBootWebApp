package com.example.app.services;

import com.example.app.entities.Book;
import com.example.app.repositories.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;


    public List<Book> getAllBooks() {
        List<Book> books =new ArrayList<>();
        bookDao.findAll().forEach(books::add);

        return books;
    }

    public void saveBook(Book book){
        bookDao.save(book);
    }
    public Book getBook(Long id){
        var bookOpt =bookDao.findById(id);

        if (bookOpt.isPresent()){
            return bookOpt.get();
        }else return null;
    }

}
