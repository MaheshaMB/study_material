package com.example.jaxrs.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.jaxrs.beans.Book;
import com.example.jaxrs.dao.BookDao;

public class BookServiceImpl implements BookService {

	private Map<String, Book> books = BookDao.getBooks();

	public BookServiceImpl() {
		books.put("java", new Book(1l, "java", 2006, "Godse", "technical", new Date()));
		books.put("spring", new Book(2l, "spring", 2016, "jobs", "technical", new Date()));
		books.put("hibernet", new Book(3l, "hibernet", 2014, "steve", "technical", new Date()));
		books.put("socialmedia", new Book(4l, "socialmedia", 2014, "steve", "social", new Date()));
		books.put("anotomy", new Book(5l, "anotomy", 2013, "manmohana", "medical", new Date()));
		books.put("phygision", new Book(6l, "phygision", 2014, "manmohana", "medical", new Date()));
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public List<Book> getTechnicalBooks() {
		List<Book> technicalBooks = new ArrayList<Book>();
		for (Book book : books.values()) {
			if (book.getType().equals("technical"))
				technicalBooks.add(book);
		}
		return technicalBooks;
	}

	@Override
	public List<Book> getBooksByYear(int year) {
		List<Book> technicalBooks = new ArrayList<Book>();
		for (Book book : books.values()) {
			if (book.getPublistYear() == year)
				technicalBooks.add(book);
		}
		return technicalBooks;
	}

	@Override
	public List<Book> getBooksByYearNbookType(String bookType, int year) {
		List<Book> technicalBooks = new ArrayList<Book>();
		for (Book book : books.values()) {
			if (book.getPublistYear() == year && book.getType().equals(bookType))
				technicalBooks.add(book);
		}
		return technicalBooks;
	}

	@Override
	public Book getBook(String bookName) {
		return books.get(bookName);
	}
	
	@Override
	public List<Book> getBooksublist(int start, int offset) {
		return new ArrayList<Book>(books.values()).subList(start, offset);
	}

}
