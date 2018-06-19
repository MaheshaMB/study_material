package com.example.subresources.beans;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlTransient;

public class Book {

	private long id;
	private String name;
	private int publistYear;
	private String author;
	private String type;
	private Date createdOn;

	private Map<Long, Author> authors = new HashMap<Long, Author>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long id, String name, int publistYear, String author, String type, Date createdOn,
			Map<Long, Author> authors) {
		super();
		this.id = id;
		this.name = name;
		this.publistYear = publistYear;
		this.author = author;
		this.type = type;
		this.createdOn = createdOn;
		this.authors = authors;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPublistYear() {
		return publistYear;
	}

	public void setPublistYear(int publistYear) {
		this.publistYear = publistYear;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@XmlTransient
	public Map<Long, Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Map<Long, Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publistYear=" + publistYear + ", author=" + author + ", type="
				+ type + ", createdOn=" + createdOn + ", authors=" + authors + "]";
	}
}
