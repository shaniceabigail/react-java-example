package com.demo.books.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.demo.books.entity.Book;

@RepositoryRestResource()
public interface BooksRepository extends JpaRepository<Book, Integer>, JpaSpecificationExecutor<Book>, QuerydslPredicateExecutor<Book> {}
