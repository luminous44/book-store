package com.bookstore.bookStore.Repo;

import com.bookstore.bookStore.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface BookRepository extends JpaRepository<Book,Long> {
}
