package com.example.jaxrs.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.jaxrs.beans.Book;

public class BookDao {

	private static Map<String, Book> books = new HashMap<String, Book>();

	public static Map<String, Book> getBooks() {
		return books;
	}
}
