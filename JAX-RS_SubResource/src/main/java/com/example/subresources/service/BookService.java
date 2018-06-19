package com.example.subresources.service;

import java.util.List;

import com.example.subresources.beans.Book;

public interface BookService {

	public List<Book> getAllBooks();

	public Book getBook(String name);

	public Book addBook(Book book);

	public Book updateBook(Book book);

	public Book deleteBook(String name);

}
