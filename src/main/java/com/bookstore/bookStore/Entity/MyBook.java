package com.bookstore.bookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MyBooks")
public class MyBook {
    @Id
    private Long id;
    private String name;
    private String author;
    private String price;

}
