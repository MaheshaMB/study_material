package com.example.subresources.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.subresources.beans.Author;
import com.example.subresources.beans.Book;
import com.example.subresources.dao.BookDao;

public class BookServiceImpl implements BookService {

	private Map<String, Book> books = BookDao.getBooks();

	public BookServiceImpl() {
		Map<Long, Author> authors1 = new HashMap<Long, Author>();
		authors1.put(1l, new Author(1l, "RAMA", new Date()));
		authors1.put(2l, new Author(2l, "SAMA", new Date()));
		authors1.put(3l, new Author(3l, "BAMA", new Date()));
		books.put("java", new Book(1l, "java", 2006, "Godse", "technical", new Date(), authors1));

		Map<Long, Author> authors2 = new HashMap<Long, Author>();
		authors2.put(1l, new Author(1l, "Malesha", new Date()));
		authors2.put(2l, new Author(2l, "Mahadeswara", new Date()));
		books.put("spring", new Book(2l, "spring", 2016, "jobs", "technical", new Date(), authors2));

		Map<Long, Author> authors3 = new HashMap<Long, Author>();
		authors3.put(1l, new Author(1l, "Puttaswamy", new Date()));
		books.put("hibernet", new Book(3l, "hibernet", 2014, "steve", "technical", new Date(), authors3));
	}

	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<Book>(books.values());
	}

	@Override
	public Book getBook(String name) {
		Book book = books.get(name);
		return book;
	}

	@Override
	public Book addBook(Book book) {
		return books.put(book.getName(), book);
	}

	@Override
	public Book updateBook(Book book) {
		return books.put(book.getName(), book);
	}

	@Override
	public Book deleteBook(String name) {
		return books.remove(name);
	}
}
