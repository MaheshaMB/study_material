package com.example.exceptionhandler.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.exceptionhandler.beans.Message;

public class MessageDaoImpl {

	public static Map<Long, Message> messages = new HashMap<Long, Message>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
