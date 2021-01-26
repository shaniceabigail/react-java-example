// package com.demo.books.service;

// import java.util.List;

// import org.springframework.stereotype.Component;

// import com.demo.books.entity.Book;
// import com.demo.books.repository.BooksRepository;

// @Component
// public class BooksService {
	
// 	private BooksRepository booksRepository;

//     public BooksService(BooksRepository booksRepository) {
//         this.booksRepository = booksRepository;
//     }

//     public List<Book> getAllBooks() {
//         return booksRepository.findAll();
//     }
    
//     public Book addNewBook(Book book) {
//     	return booksRepository.save(book);
//     }

// }
