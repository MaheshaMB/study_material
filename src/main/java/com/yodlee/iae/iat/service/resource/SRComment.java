package com.yodlee.iae.iat.service.resource;

public class SRComment {

	private String comment;
	private Integer srItemId;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getSRItemId() {
		return srItemId;
	}
	public void setSRItemId(Integer srItemId) {
		this.srItemId = srItemId;
	}
	
	public SRComment(String comment, Integer srItemId) {
		super();
		this.comment = comment;
		this.srItemId = srItemId;
	}
	
	
}
