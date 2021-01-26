package com.demo.books.controller;

import com.demo.books.entity.Book;
import com.demo.books.repository.BooksRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/books/")
public class BooksController {
	
    @Autowired
    private BooksRepository booksRepository;
	// BooksService booksService;
	
	@GetMapping(path = "/listBooks")
    public @ResponseBody Iterable<Book> listBooks() {
        //log.info("BooksController:  list books");
        return booksRepository.findAll();
    }
	
	// @PostMapping(path = BooksLinks.ADD_USER)
	// public ResponseEntity<?> saveUser(@RequestBody Users user) {
    //     log.info("BooksController:  list users");
    //     Users resource = usersService.saveUser(user);
    //     return ResponseEntity.ok(resource);
    // }
}
