package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.models.Book;
import com.bookapp.service.BookService;

@RestController
@RequestMapping("book-restapi")

public class BookController {
	
	@Autowired
	BookService bookService;
	//http://localhost:8080/book-restapi/hello
	@GetMapping("/welcome")
	public String sayHello() {
		return "Welcome to RESTAPI";
	}
	//http://localhost:8080/book-restapi/book-by-id/10
	@GetMapping("/book-by-id{id}")
	public Book getBookById(@PathVariable("id") int bookid) {
		return bookService.getById(bookid);
	}
	//http://localhost:8080/book-restapi/books-by-author/Kathy
	@GetMapping("/books-by-author/{author}")
	public List<Book>getBookSByAuthor(@PathVariable String author){
		return bookService.getBooksByAuthor(author);
	}
	//http://localhost:8080/book-restapi/books-by-categoty/category=Fiction
	@GetMapping("/books-by-category")
	public List<Book>getBookByCategory(@RequestParam("category")String category){
		return bookService.getBooksBycategory(category);
	}
	

}
