package com.bookstore.bookStore.Controller;


import com.bookstore.bookStore.Entity.Book;
import com.bookstore.bookStore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/books")
public class Controller {
    @Autowired
    private BookService service;
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/books_register")
    public String bookRegister(){
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public String availableBooks(){
        return "availableBooks";
    }
    @GetMapping("/my_books")
    public String myBooks(){
        return "myBooks";
    }

    @PostMapping("/create")
    public String registerNewBook(@ModelAttribute Book book) {  // ✅ Use @ModelAttribute for form submission
        service.save(book);
        return "redirect:/books/available_books";
    }

    }
