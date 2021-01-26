package com.demo.books.controller;

import java.util.List;

import com.demo.books.entity.Book;
import com.demo.books.links.BooksLinks;
import com.demo.books.service.BooksService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/books/")
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	@GetMapping(path = BooksLinks.LIST_BOOKS)
    public ResponseEntity<?> listBooks() {
        log.info("BooksController:  list books");
        List<Book> resource = booksService.getAllBooks();
        return ResponseEntity.ok(resource);
    }
	
	// @PostMapping(path = BooksLinks.ADD_USER)
	// public ResponseEntity<?> saveUser(@RequestBody Users user) {
    //     log.info("BooksController:  list users");
    //     Users resource = usersService.saveUser(user);
    //     return ResponseEntity.ok(resource);
    // }
}
