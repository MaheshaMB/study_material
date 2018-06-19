package com.example.response.locationheader.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.example.response.locationheader.beans.Message;
import com.example.response.locationheader.dao.MessageDaoImpl;

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
			return null;
		messages.put(message.getId(), message);
		return message;
	}

	@Override
	public Message deleteMessage(long id) {
		return messages.remove(id);
	}

	@Override
	public Message getMessage(long id) {
		return messages.get(id);
	}
}
