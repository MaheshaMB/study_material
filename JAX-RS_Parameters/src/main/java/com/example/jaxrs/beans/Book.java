package com.example.jaxrs.beans;

import java.util.Date;

public class Book {

	private long id;
	private String name;
	private int publistYear;
	private String author;
	private String type;
	private Date createdOn;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(long id, String name, int publistYear, String author, String type, Date createdOn) {
		super();
		this.id = id;
		this.name = name;
		this.publistYear = publistYear;
		this.author = author;
		this.type = type;
		this.createdOn = createdOn;
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

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publistYear=" + publistYear + ", author=" + author + ", type="
				+ type + ", createdOn=" + createdOn + "]";
	}
}
