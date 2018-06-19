package com.example.jaxrs.Services;

import java.util.List;

import com.example.jaxrs.Beans.Message;

public interface MessageService {

	public List<Message> getAllMessages();

	public Message getMessage(long id);

	public Message addMessage(Message message);

	public Message updateMessage(Message message);

	public Message deleteMessage(long id);

}
