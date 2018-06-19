package com.example.response.locationheader.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import com.example.response.locationheader.beans.Message;
import com.example.response.locationheader.service.MessageService;
import com.example.response.locationheader.service.MessageServiceImpl;

import jersey.repackaged.com.google.common.collect.Lists;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

	private MessageService messageService = new MessageServiceImpl();

	@GET
	public Response getMessageResources() {
		GenericEntity<List<Message>> entity = new GenericEntity<List<Message>>(
				Lists.newArrayList(messageService.getAllMessages())) {
		};
		return Response.ok(entity).build();
	}

	@POST
	public Response addMessageResource(Message message, @Context UriInfo uriInfo) {
		Message newMessage = messageService.addMessage(message);
		String newId = String.valueOf(message.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newMessage).build();
	}

	@PUT
	@Path("/{messageId}")
	public Response updateMessageResource(@PathParam("messageId") long id, Message message) {
		message.setId(id);
		return Response.accepted(messageService.addMessage(message)).build();
	}

	@DELETE
	@Path("/{messageId}")
	public Response deleteMessageResource(@PathParam("messageId") long id) {
		return Response.noContent().entity(messageService.deleteMessage(id)).build();
	}

	@GET
	@Path("/{messageId}")
	public Response addMessageResource(@PathParam("messageId") long id) {
		// return messageService.getMessage(id);
		return Response.status(Status.OK).entity(messageService.getMessage(id)).build();
	}

}
