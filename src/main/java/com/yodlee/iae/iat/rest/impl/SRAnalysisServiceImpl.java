package com.yodlee.iae.iat.rest.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.stereotype.Service;

import com.yodlee.iae.iat.rest.SRAnalysisService;
import com.yodlee.iae.iat.service.resource.SRComment;
import com.yodlee.iae.iat.service.resource.UserAggAccount;

@Service
public class SRAnalysisServiceImpl {

	private static final Logger logger = Logger.getLogger(SRAnalysisServiceImpl.class.getName());

	////@Override
	public Response getAllSRAnalysis() throws Exception {
		logger.info("Called ==============> /sr");
		Task t1 = new Task(1, "i am first");
		Task t2 = new Task(2, "i am second");
		List<Task> tasklist = new ArrayList<Task>();
		tasklist.add(t1);
		tasklist.add(t2);
		// List<SRDetails> srDetailsList = srOutcomeService.getAllSRAnalysis();
		return Response.status(Status.OK).entity(tasklist).build();
	}

	////@Override
	public Response getSRDetails(String srReqID) {
		logger.info("Called ==============> /sr/xxxxx");
		Task t1 = new Task(Integer.parseInt(srReqID), "i am " + srReqID);
		return Response.status(Status.OK).entity(t1).build();
	}

	//@Override
	public Response getAnalysisDetails(String srReqID) {
		logger.info("Called ==============> /sr/xxxxx/analysis");
		Task t1 = new Task(Integer.parseInt(srReqID), "i am " + srReqID);
		return Response.status(Status.OK).entity(t1).build();
	}

	//@Override
	public Response getSimilarSR(String srReqID) {
		logger.info("Called ==============> /sr/xxxxx/similarissue");
		Task t1 = new Task(Integer.parseInt(srReqID), "i am " + srReqID);
		// List<SRDetails> srDetailsList =
		// srOutcomeService.getSimilarSR(srReqID);
		return Response.status(Status.OK).entity(t1).build();
	}

	//@Override
	public Response getUserAggAccount(String srReqID, Integer itemID, String itemType) {
		logger.info("Called ==============> /sr/xxxxx/useraggaccount[GET]");

		logger.info("Called ==============> /sr/xxxxx/useraggaccount[GET]/itemid:" + itemID + "/itemtype:" + itemType);

		Task t1 = new Task(Integer.parseInt(srReqID), "i am " + srReqID);
		// List<UserAggAccount> userAggAccountList =
		// srOutcomeService.getUserAggAccount(srReqID, itemID, itemType);
		return Response.status(Status.OK).entity(t1).build();
	}

	//@Override
	public Response saveUserAggAccount(String srItemID, UserAggAccount userAggAccountD) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public Response getSROutcome(String srItemID) {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	public Response saveSROutcome(String srItemID, SRComment srComment) {
		// TODO Auto-generated method stub
		return null;
	}
}
