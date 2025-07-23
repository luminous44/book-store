package com.bookstore.bookStore.Service;

import com.bookstore.bookStore.Entity.Book;
import com.bookstore.bookStore.Repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class BookService {
@Autowired
private BookRepository repo;
    public  void save(Book book){
        repo.save(book);
    }
}
