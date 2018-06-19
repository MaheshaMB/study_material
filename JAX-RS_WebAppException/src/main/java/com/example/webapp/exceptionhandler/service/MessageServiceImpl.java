package com.example.webapp.exceptionhandler.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.example.webapp.exceptionhandler.beans.Message;
import com.example.webapp.exceptionhandler.dao.ErrorMessage;
import com.example.webapp.exceptionhandler.dao.MessageDaoImpl;
import com.example.webapp.exceptionhandler.exception.BadRequestException;
import com.example.webapp.exceptionhandler.exception.DataNotFoundException;

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
			//throw new DataNotFoundException("Message not found with id " + id + " ");
			//throw new WebApplicationException(Status.NOT_FOUND);
			
			ErrorMessage errorMessage = new ErrorMessage(404, "Not found",
					"http://www.restapitutorial.com/httpstatuscodes.html");
			Response response = Response.status(Status.NOT_FOUND).entity(errorMessage).build();
			//throw new WebApplicationException(response);
			
			throw new NotFoundException(response);
		}
		return messages.get(id);
	}
}
