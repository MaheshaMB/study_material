package com.example.response.locationheader.service;

import java.util.List;

import com.example.response.locationheader.beans.Message;

public interface MessageService {

	public List<Message> getAllMessages();

	public Message getMessage(long id);

	public Message addMessage(Message message);

	public Message updateMessage(Message message);

	public Message deleteMessage(long id);

}
