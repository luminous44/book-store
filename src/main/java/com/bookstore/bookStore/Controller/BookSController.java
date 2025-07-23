package com.bookstore.bookStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/books")
public class BookSController {
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

}
