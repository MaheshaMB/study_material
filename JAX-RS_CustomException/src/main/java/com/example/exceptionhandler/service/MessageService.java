package com.example.exceptionhandler.service;

import java.util.List;

import com.example.exceptionhandler.beans.Message;

public interface MessageService {

	public List<Message> getAllMessages();

	public Message getMessage(long id);

	public Message addMessage(Message message);

	public Message updateMessage(Message message);

	public Message deleteMessage(long id);

}
