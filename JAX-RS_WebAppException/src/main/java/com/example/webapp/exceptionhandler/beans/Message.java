package com.example.webapp.exceptionhandler.beans;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {

	private long id;
	private String message;
	private Date createdOn;

	public Message() {
		super();
	}

	public Message(long id, String message, Date createdOn) {
		super();
		this.id = id;
		this.message = message;
		this.createdOn = createdOn;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", message=" + message + ", createdOn=" + createdOn + "]";
	}
}
