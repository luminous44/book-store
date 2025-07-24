package com.bookstore.bookStore.Service;

import com.bookstore.bookStore.Entity.Book;
import com.bookstore.bookStore.Repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
@Autowired
private BookRepository repo;

    public  void save(Book book){
        repo.save(book);
    }

    public List<Book> getAllBook() {
        List<Book> all = repo.findAll();
        return all;
    }
    public Book getBookById(Long id){
        return repo.findById(id).get();
    }

    public void deleteBook(Long id) {
       repo.deleteById(id);
    }
}
