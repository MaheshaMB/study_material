package com.example.jaxrs.service;

import java.util.List;

import com.example.jaxrs.beans.Book;

public interface BookService {

	public List<Book> getAllBooks();

	public List<Book> getTechnicalBooks();

	public List<Book> getBooksByYear(int year);

	public List<Book> getBooksByYearNbookType(String bookType, int year);

	public Book getBook(String bookName);
	
	public List<Book> getBooksublist(int start, int offset);

}
