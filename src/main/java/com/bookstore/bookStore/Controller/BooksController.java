package com.bookstore.bookStore.Controller;

import com.bookstore.bookStore.Entity.Book;
import com.bookstore.bookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class BooksController {
    @Autowired
    private BookService service;

}
