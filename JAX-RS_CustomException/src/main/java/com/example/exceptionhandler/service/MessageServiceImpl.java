package com.example.exceptionhandler.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.exceptionhandler.beans.Message;
import com.example.exceptionhandler.dao.MessageDaoImpl;
import com.example.exceptionhandler.exception.BadRequestException;
import com.example.exceptionhandler.exception.DataNotFoundException;

public class MessageServiceImpl implements MessageService {

	public static Map<Long, Message> messages = MessageDaoImpl.getMessages();

	public MessageServiceImpl() {
		messages.put(1l, new Message(1l, "Hello World", new Date()));
	}

	@Override
	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	@Override
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		message.setCreatedOn(new Date());
		messages.put(message.getId(), message);
		return message;
	}

	@Override
	public Message updateMessage(Message message) {
		if (message.getId() == 0)
			throw new BadRequestException("Requested URI is not get...");
		messages.put(message.getId(), message);
		return message;
	}

	@Override
	public Message deleteMessage(long id) {
		return messages.remove(id);
	}

	@Override
	public Message getMessage(long id) {
		Message message = messages.get(id);
		if (message == null) {
			throw new DataNotFoundException("Message not found with id " + id + " ");
		}
		return messages.get(id);
	}
}
