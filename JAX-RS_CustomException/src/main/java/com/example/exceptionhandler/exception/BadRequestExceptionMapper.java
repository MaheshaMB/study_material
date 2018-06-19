package com.example.exceptionhandler.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.example.exceptionhandler.dao.ErrorMessage;

@Provider
public class BadRequestExceptionMapper implements ExceptionMapper<BadRequestException> {

	@Override
	public Response toResponse(BadRequestException ex) {
		ErrorMessage errorMessage = new ErrorMessage(400, ex.getMessage(),
				"http://www.restapitutorial.com/httpstatuscodes.html");
		return Response.status(Status.BAD_REQUEST).entity(errorMessage).build();
	}

}
