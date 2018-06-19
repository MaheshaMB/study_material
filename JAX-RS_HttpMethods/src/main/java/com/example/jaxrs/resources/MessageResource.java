package com.example.jaxrs.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.jaxrs.Beans.Message;
import com.example.jaxrs.Services.MessageService;
import com.example.jaxrs.Services.MessageServiceImpl;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

	private MessageService messageService = new MessageServiceImpl();

	@GET
	public List<Message> getMessageResources() {
		return messageService.getAllMessages();
	}

	@POST
	public Message addMessageResource(Message message) {
		return messageService.addMessage(message);
	}

	@PUT
	@Path("/{messageId}")
	public Message updateMessageResource(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return messageService.updateMessage(message);
	}

	@DELETE
	@Path("/{messageId}")
	public void deleteMessageResource(@PathParam("messageId") long id) {
		messageService.deleteMessage(id);
	}

	@GET
	@Path("/{messageId}")
	public Message addMessageResource(@PathParam("messageId") long id) {
		return messageService.getMessage(id);
	}

}