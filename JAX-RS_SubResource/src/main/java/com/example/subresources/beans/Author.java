package com.example.subresources.beans;

import java.util.Date;

public class Author {

	private long id;
	private String name;
	private Date createdOn;

	public Author() {
		super();
	}

	public Author(long id, String name, Date createdOn) {
		super();
		this.id = id;
		this.name = name;
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

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
}
