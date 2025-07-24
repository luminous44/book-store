package com.bookstore.bookStore.Service;


import com.bookstore.bookStore.Entity.MyBook;
import com.bookstore.bookStore.Repo.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MyBookService {
    @Autowired
    private MyBookRepository myRepo;

    public void saveMyBook(MyBook book){
        myRepo.save(book);
    }
}
