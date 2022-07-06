package com.bookapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.bookapp.dao.BookDao;
import com.bookapp.models.Book;
@ComponentScan({"com.bookapp.dao.BookDao"})
@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	 
	public BookServiceImpl() {
		
	}
	
	
	@Override
	public List<Book> getBooksByAuthor(String author){
		return null;
	}
	
	@Override
	public List<Book> getBooksBycategory(String category) {
		
		return null;
	}

	public List<Book> getBookList()
	{
		return null;
		

				
	}
	@Override
	public Book getById(int bookid) {
		// TODO Auto-generated method stub
		return bookDao.getById(bookid);
	}

	@Override
	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}


	@Override
	public Book addBook(Book book) {
	//	list.add(book);
		bookDao.save(book);
		return book;
	}
	
	
	
	
}
