package com.example.exceptionhandler.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.example.exceptionhandler.dao.ErrorMessage;

@Provider
public class GenrericExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable ex) {
		ErrorMessage errorMessage = new ErrorMessage(500, ex.getMessage(),
				"http://www.restapitutorial.com/httpstatuscodes.html");
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorMessage).build();
	}
}
