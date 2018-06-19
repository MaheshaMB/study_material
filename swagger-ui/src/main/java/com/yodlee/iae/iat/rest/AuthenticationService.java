package com.yodlee.iae.iat.rest;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yodlee.iae.iat.rest.impl.Task;
import com.yodlee.iae.iat.service.resource.AuthenticationRequest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/auth")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "Authentication Service API", description="Operations pertaining to products in Online Store", produces = MediaType.APPLICATION_JSON)
public interface AuthenticationService {

	@POST
	@Path("/login")
	@ApiOperation(value = "Get authorize inputed user detail", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 403, message = "Forbidden request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response getLoginAuthentication(
							@ApiParam(value = "Mandatory") AuthenticationRequest authenticationRequest) throws Exception;
	
	@POST
	@Path("/validation")
	@ApiOperation(value = "Get authenticate inputed token", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 400, message = "Bad request"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 403, message = "Forbidden request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response getValidateAuthentication(
							@ApiParam(value = "Mandatory") String token) throws Exception;

}
