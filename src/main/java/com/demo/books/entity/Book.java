package com.demo.books.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Book {
	
	@Id
	@Column
    private int id;

    @Column
    @NotNull(message="{NotNull.Book.title}")
    private String title;
    
    @Column
    @NotNull(message="{NotNull.Book.author}")
    private String author;
    
    @Column
    @NotNull(message="{NotNull.Book.price}")
    private double price;
    
    @Column
    @NotNull(message="{NotNull.Book.qty}")
    private double qty;
}
