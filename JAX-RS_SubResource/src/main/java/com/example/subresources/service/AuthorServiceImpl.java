package com.example.subresources.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.subresources.beans.Author;
import com.example.subresources.beans.Book;
import com.example.subresources.dao.BookDao;

public class AuthorServiceImpl implements AuthorService {

	private Map<String, Book> books = BookDao.getBooks();

	@Override
	public List<Author> getAllAuthors(String bookname) {
		Map<Long, Author> authors = books.get(bookname).getAuthors();
		return new ArrayList<Author>(authors.values());
	}

	@Override
	public Author getAuthors(String bookname, long authorId) {
		Map<Long, Author> authors = books.get(bookname).getAuthors();
		return authors.get(authorId);
	}

	@Override
	public Author addAuthors(String bookname, Author author) {
		Map<Long, Author> authors = books.get(bookname).getAuthors();
		author.setId(authors.size() + 1);
		return authors.put(author.getId(), author);
	}

	@Override
	public Author updateAuthors(String bookname, Author author) {
		Map<Long, Author> authors = books.get(bookname).getAuthors();
		if (author.getId() == 0)
			return null;
		return authors.put(author.getId(), author);
	}

	@Override
	public Author removeAuthors(String bookname, long authorId) {
		Map<Long, Author> authors = books.get(bookname).getAuthors();
		return authors.remove(authorId);
	}

}
