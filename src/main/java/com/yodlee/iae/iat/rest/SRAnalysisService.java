package com.yodlee.iae.iat.rest;


import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yodlee.iae.iat.rest.impl.Task;
import com.yodlee.iae.iat.service.Action;
import com.yodlee.iae.iat.service.resource.SRComment;
import com.yodlee.iae.iat.service.resource.UserAggAccount;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/sr")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "ServiceRequest API", produces = MediaType.APPLICATION_JSON)
public interface SRAnalysisService {

	@GET
	@ApiOperation(value = "Get all open SRs detail", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response getAllSRAnalysis() throws Exception;

	@GET
	@Path("{srnum}")
	@ApiOperation(value = "Get Analysed SR detail for inputed SR", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response getSRDetailswithaction(
							@ApiParam(value = "Mandatory") @PathParam("srnum") String srReqID, 
							@ApiParam(value = "Mandatory") @QueryParam("action") @NotNull Action action,
							@ApiParam(value = "optional") @QueryParam("itemid") Integer itemID, 
							@ApiParam(value = "optional") @QueryParam("itemtype") String itemType,
							@ApiParam(value = "optional") @QueryParam("cobrandid") Integer cobrandid) throws Exception;
	
	@PUT
	@Path("{srnum}/useraggaccount")
	@ApiOperation(value = "Provide item detail to start analysis", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response saveUserAggAccount(@PathParam("srnum") String srItemID, UserAggAccount userAggAccountD);

	
	@PUT
	@Path("{srnum}/outcome")
	@ApiOperation(value = "Updating SR in YCC by SR number", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response saveSROutcome(@PathParam("srnum") String srItemID, SRComment srComment);

}
