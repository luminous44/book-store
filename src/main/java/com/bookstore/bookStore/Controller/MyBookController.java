package com.bookstore.bookStore.Controller;

import com.bookstore.bookStore.Service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/myBooks")
public class MyBookController {
    @Autowired
    private MyBookService service;
   @GetMapping("/deleteById/{id}")
    public String deleteBook(@PathVariable Long id){
       service.deleteById(id);
     return "redirect:/books/my_books";
   }
}
