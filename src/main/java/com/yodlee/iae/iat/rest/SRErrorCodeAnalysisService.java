package com.yodlee.iae.iat.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.yodlee.iae.iat.rest.impl.Task;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Path("/sr/{srnum}")
@Produces(MediaType.APPLICATION_JSON)
@Api(value = "ErrorCode base ServiceRequest API", produces = MediaType.APPLICATION_JSON)
public interface SRErrorCodeAnalysisService {


	@GET
	@Path("/{errcode}")
	@ApiOperation(value = "Get Analysed SR detail for inputed error code", response = Task.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Resource found"),
			@ApiResponse(code = 401, message = "unauthorized request"),
			@ApiResponse(code = 404, message = "Resource not found") })
	public Response getSRDetailswithaction(
							@ApiParam(value = "Mandatory") @PathParam("srnum") String srReqID, 
							@ApiParam(value = "Mandatory") @PathParam("errcode") String errorcode, 
							@ApiParam(value = "optional") @QueryParam("itemid") Integer itemID, 
							@ApiParam(value = "optional") @QueryParam("itemtype") String itemType,
							@ApiParam(value = "optional") @QueryParam("cobrandid") Integer cobrandid) throws Exception;
}
