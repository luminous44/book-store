package com.bookstore.bookStore.Controller;


import com.bookstore.bookStore.Entity.Book;
import com.bookstore.bookStore.Entity.MyBook;
import com.bookstore.bookStore.Service.BookService;
import com.bookstore.bookStore.Service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Controller
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BookService service;
    @Autowired
    private MyBookService myBookService;
    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @GetMapping("/books_register")
    public String bookRegister(){
        return "bookRegister";
    }
    @GetMapping("/available_books")
    public ModelAndView availableBooks(){
        List<Book> list = service.getAllBook();
        return new ModelAndView("availableBooks","books",list);
    }
    @GetMapping("/my_books")
    public String myBooks(Model model){

        List<MyBook> bookList = myBookService.getAllBook();
        model.addAttribute("book",bookList);
        return "myBooks";
    }


    @PostMapping("/create")
    public String registerNewBook(@ModelAttribute Book book) {  // ✅ Use @ModelAttribute for form submission
        service.save(book);
        return "redirect:/books/available_books";
    }
  @RequestMapping("/myBookList/{id}")
    public String saveBook(@PathVariable("id") Long id){
        Book b = service.getBookById(id);
        MyBook mb = new MyBook(b.getId(), b.getName(), b.getAuthor(),b.getPrice());
        myBookService.saveMyBook(mb);
        return "redirect:/books/my_books";
  }
  @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Long id){
        service.deleteBook(id);
      return "redirect:/books/available_books";
  }
  @RequestMapping("editBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model){
        Book b = service.getBookById(id);
        model.addAttribute("book",b);
        return "EditBook";
  }
    }
