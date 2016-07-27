package com.example.subresources.service;

import java.util.List;

import com.example.subresources.beans.Author;

public interface AuthorService {

	public List<Author> getAllAuthors(String bookname);

	public Author getAuthors(String bookname, long authorId);

	public Author addAuthors(String bookname, Author author);

	public Author updateAuthors(String bookname, Author author);

	public Author removeAuthors(String bookname, long authorId);

}
