package com.example.jaxrs.Dao;

import java.util.HashMap;
import java.util.Map;

import com.example.jaxrs.Beans.Message;

public class MessageDaoImpl {

	public static Map<Long, Message> messages = new HashMap<Long, Message>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
