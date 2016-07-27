package com.example.response.locationheader.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.response.locationheader.beans.Message;

public class MessageDaoImpl {

	public static Map<Long, Message> messages = new HashMap<Long, Message>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}
}
