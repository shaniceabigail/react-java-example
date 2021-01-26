package com.demo.books.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.books.entity.Book;

public interface BooksRepository extends CrudRepository<Book, Integer> {

}